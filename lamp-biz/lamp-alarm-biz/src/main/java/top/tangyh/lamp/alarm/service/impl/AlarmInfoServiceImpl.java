package top.tangyh.lamp.alarm.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.alarm.dao.AlarmInfoMapper;
import top.tangyh.lamp.alarm.entity.AlarmInfo;
import top.tangyh.lamp.alarm.service.AlarmInfoService;

/**
 * <p>
 * 业务实现类
 * 告警信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class AlarmInfoServiceImpl extends SuperServiceImpl<AlarmInfoMapper, AlarmInfo> implements AlarmInfoService {
}
