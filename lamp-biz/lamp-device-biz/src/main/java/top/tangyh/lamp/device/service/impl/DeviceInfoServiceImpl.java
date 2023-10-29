package top.tangyh.lamp.device.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.device.dao.DeviceInfoMapper;
import top.tangyh.lamp.device.entity.DeviceInfo;
import top.tangyh.lamp.device.service.DeviceInfoService;

/**
 * <p>
 * 业务实现类
 * 监控设备信息
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class DeviceInfoServiceImpl extends SuperServiceImpl<DeviceInfoMapper, DeviceInfo> implements DeviceInfoService {
}
