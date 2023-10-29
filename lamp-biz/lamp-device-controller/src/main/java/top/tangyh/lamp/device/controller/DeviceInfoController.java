package top.tangyh.lamp.device.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.tangyh.basic.annotation.security.PreAuth;
import top.tangyh.basic.base.R;
import top.tangyh.basic.base.controller.SuperController;
import top.tangyh.basic.interfaces.echo.EchoService;
import top.tangyh.lamp.device.dto.DeviceInfoPageQuery;
import top.tangyh.lamp.device.dto.DeviceInfoSaveDTO;
import top.tangyh.lamp.device.dto.DeviceInfoUpdateDTO;
import top.tangyh.lamp.device.entity.DeviceInfo;
import top.tangyh.lamp.device.service.DeviceInfoService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * 监控设备信息
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/deviceInfo")
@Api(value = "DeviceInfo", tags = "监控设备信息")
@PreAuth(enabled = false, replace = "device:deviceInfo:")
public class DeviceInfoController extends SuperController<DeviceInfoService, Long, DeviceInfo, DeviceInfoPageQuery, DeviceInfoSaveDTO, DeviceInfoUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<DeviceInfo> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<DeviceInfo> deviceInfoList = list.stream().map((map) -> {
            DeviceInfo deviceInfo = DeviceInfo.builder().build();
            //TODO 请在这里完成转换
            return deviceInfo;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(deviceInfoList));
    }
}
