package top.tangyh.lamp.alarm.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.alarm.dao.AlarmDefinitionMapper;
import top.tangyh.lamp.alarm.entity.AlarmDefinition;
import top.tangyh.lamp.alarm.service.AlarmDefinitionService;

/**
 * <p>
 * 业务实现类
 * 动态告警等级定义表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class AlarmDefinitionServiceImpl extends SuperServiceImpl<AlarmDefinitionMapper, AlarmDefinition> implements AlarmDefinitionService {
}
