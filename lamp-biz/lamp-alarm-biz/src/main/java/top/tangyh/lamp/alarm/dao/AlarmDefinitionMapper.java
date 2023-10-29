package top.tangyh.lamp.alarm.dao;

import org.springframework.stereotype.Repository;
import top.tangyh.basic.base.mapper.SuperMapper;
import top.tangyh.lamp.alarm.entity.AlarmDefinition;

/**
 * <p>
 * Mapper 接口
 * 动态告警等级定义表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Repository
public interface AlarmDefinitionMapper extends SuperMapper<AlarmDefinition> {

}
