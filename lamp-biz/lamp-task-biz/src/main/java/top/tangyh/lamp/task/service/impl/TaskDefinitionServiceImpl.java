package top.tangyh.lamp.task.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.task.dao.TaskDefinitionMapper;
import top.tangyh.lamp.task.entity.TaskDefinition;
import top.tangyh.lamp.task.service.TaskDefinitionService;

/**
 * <p>
 * 业务实现类
 * 任务类型表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class TaskDefinitionServiceImpl extends SuperServiceImpl<TaskDefinitionMapper, TaskDefinition> implements TaskDefinitionService {
}
