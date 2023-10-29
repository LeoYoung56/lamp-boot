package top.tangyh.lamp.task.controller;

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
import top.tangyh.lamp.task.dto.TaskDefinitionPageQuery;
import top.tangyh.lamp.task.dto.TaskDefinitionSaveDTO;
import top.tangyh.lamp.task.dto.TaskDefinitionUpdateDTO;
import top.tangyh.lamp.task.entity.TaskDefinition;
import top.tangyh.lamp.task.service.TaskDefinitionService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * 任务类型表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/taskDefinition")
@Api(value = "TaskDefinition", tags = "任务类型表")
@PreAuth(enabled = false, replace = "task:taskDefinition:")
public class TaskDefinitionController extends SuperController<TaskDefinitionService, Long, TaskDefinition, TaskDefinitionPageQuery, TaskDefinitionSaveDTO, TaskDefinitionUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<TaskDefinition> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<TaskDefinition> taskDefinitionList = list.stream().map((map) -> {
            TaskDefinition taskDefinition = TaskDefinition.builder().build();
            //TODO 请在这里完成转换
            return taskDefinition;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(taskDefinitionList));
    }
}
