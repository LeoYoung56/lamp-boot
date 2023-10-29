package top.tangyh.lamp.portrait.controller;

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
import top.tangyh.lamp.portrait.dto.PortraitInfoPageQuery;
import top.tangyh.lamp.portrait.dto.PortraitInfoSaveDTO;
import top.tangyh.lamp.portrait.dto.PortraitInfoUpdateDTO;
import top.tangyh.lamp.portrait.entity.PortraitInfo;
import top.tangyh.lamp.portrait.service.PortraitInfoService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * 人像信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/portraitInfo")
@Api(value = "PortraitInfo", tags = "人像信息表")
@PreAuth(enabled = false, replace = "portrait:portraitInfo:")
public class PortraitInfoController extends SuperController<PortraitInfoService, Long, PortraitInfo, PortraitInfoPageQuery, PortraitInfoSaveDTO, PortraitInfoUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<PortraitInfo> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<PortraitInfo> portraitInfoList = list.stream().map((map) -> {
            PortraitInfo portraitInfo = PortraitInfo.builder().build();
            //TODO 请在这里完成转换
            return portraitInfo;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(portraitInfoList));
    }
}
