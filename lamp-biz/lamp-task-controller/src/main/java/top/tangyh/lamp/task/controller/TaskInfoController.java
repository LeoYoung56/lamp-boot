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
import top.tangyh.lamp.task.dto.TaskInfoPageQuery;
import top.tangyh.lamp.task.dto.TaskInfoSaveDTO;
import top.tangyh.lamp.task.dto.TaskInfoUpdateDTO;
import top.tangyh.lamp.task.entity.TaskInfo;
import top.tangyh.lamp.task.service.TaskInfoService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * AI视觉任务信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/taskInfo")
@Api(value = "TaskInfo", tags = "AI视觉任务信息表")
@PreAuth(enabled = false, replace = "task:taskInfo:")
public class TaskInfoController extends SuperController<TaskInfoService, Long, TaskInfo, TaskInfoPageQuery, TaskInfoSaveDTO, TaskInfoUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<TaskInfo> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<TaskInfo> taskInfoList = list.stream().map((map) -> {
            TaskInfo taskInfo = TaskInfo.builder().build();
            //TODO 请在这里完成转换
            return taskInfo;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(taskInfoList));
    }
}
