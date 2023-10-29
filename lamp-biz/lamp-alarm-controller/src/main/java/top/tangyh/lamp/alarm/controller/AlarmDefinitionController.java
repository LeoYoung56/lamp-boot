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
import top.tangyh.lamp.alarm.dto.AlarmDefinitionPageQuery;
import top.tangyh.lamp.alarm.dto.AlarmDefinitionSaveDTO;
import top.tangyh.lamp.alarm.dto.AlarmDefinitionUpdateDTO;
import top.tangyh.lamp.alarm.entity.AlarmDefinition;
import top.tangyh.lamp.alarm.service.AlarmDefinitionService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * 动态告警等级定义表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/alarmDefinition")
@Api(value = "AlarmDefinition", tags = "动态告警等级定义表")
@PreAuth(replace = "alarm:alarmDefinition:")
public class AlarmDefinitionController extends SuperController<AlarmDefinitionService, Long, AlarmDefinition, AlarmDefinitionPageQuery, AlarmDefinitionSaveDTO, AlarmDefinitionUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<AlarmDefinition> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<AlarmDefinition> alarmDefinitionList = list.stream().map((map) -> {
            AlarmDefinition alarmDefinition = AlarmDefinition.builder().build();
            //TODO 请在这里完成转换
            return alarmDefinition;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(alarmDefinitionList));
    }
}
