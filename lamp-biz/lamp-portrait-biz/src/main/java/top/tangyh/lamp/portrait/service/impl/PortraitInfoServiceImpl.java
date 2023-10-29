package top.tangyh.lamp.portrait.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.portrait.dao.PortraitInfoMapper;
import top.tangyh.lamp.portrait.entity.PortraitInfo;
import top.tangyh.lamp.portrait.service.PortraitInfoService;

/**
 * <p>
 * 业务实现类
 * 人像信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class PortraitInfoServiceImpl extends SuperServiceImpl<PortraitInfoMapper, PortraitInfo> implements PortraitInfoService {
}
