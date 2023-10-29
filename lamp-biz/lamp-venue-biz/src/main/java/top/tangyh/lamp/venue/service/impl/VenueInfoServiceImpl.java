package top.tangyh.lamp.venue.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.venue.dao.VenueInfoMapper;
import top.tangyh.lamp.venue.entity.VenueInfo;
import top.tangyh.lamp.venue.service.VenueInfoService;

/**
 * <p>
 * 业务实现类
 * 场地信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Service
public class VenueInfoServiceImpl extends SuperServiceImpl<VenueInfoMapper, VenueInfo> implements VenueInfoService {
}
