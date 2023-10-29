package top.tangyh.lamp.alarm.controller;

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
import top.tangyh.lamp.alarm.dto.AlarmInfoPageQuery;
import top.tangyh.lamp.alarm.dto.AlarmInfoSaveDTO;
import top.tangyh.lamp.alarm.dto.AlarmInfoUpdateDTO;
import top.tangyh.lamp.alarm.entity.AlarmInfo;
import top.tangyh.lamp.alarm.service.AlarmInfoService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * 告警信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/alarmInfo")
@Api(value = "AlarmInfo", tags = "告警信息表")
@PreAuth(enabled = false, replace = "alarm:alarmInfo:")
public class AlarmInfoController extends SuperController<AlarmInfoService, Long, AlarmInfo, AlarmInfoPageQuery, AlarmInfoSaveDTO, AlarmInfoUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<AlarmInfo> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<AlarmInfo> alarmInfoList = list.stream().map((map) -> {
            AlarmInfo alarmInfo = AlarmInfo.builder().build();
            //TODO 请在这里完成转换
            return alarmInfo;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(alarmInfoList));
    }
}
