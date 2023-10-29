package top.tangyh.lamp.task.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.task.dao.TaskInfoMapper;
import top.tangyh.lamp.task.entity.TaskInfo;
import top.tangyh.lamp.task.service.TaskInfoService;

/**
 * <p>
 * 业务实现类
 * AI视觉任务信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class TaskInfoServiceImpl extends SuperServiceImpl<TaskInfoMapper, TaskInfo> implements TaskInfoService {
}
