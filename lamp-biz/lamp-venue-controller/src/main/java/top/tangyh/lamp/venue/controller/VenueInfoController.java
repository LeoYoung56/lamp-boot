package top.tangyh.lamp.venue.controller;

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
import top.tangyh.lamp.venue.dto.VenueInfoPageQuery;
import top.tangyh.lamp.venue.dto.VenueInfoSaveDTO;
import top.tangyh.lamp.venue.dto.VenueInfoUpdateDTO;
import top.tangyh.lamp.venue.entity.VenueInfo;
import top.tangyh.lamp.venue.service.VenueInfoService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * <p>
 * 前端控制器
 * 场地信息表
 * </p>
 *
 * @author leo
 * @date 2023-10-29
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/venueInfo")
@Api(value = "VenueInfo", tags = "场地信息表")
@PreAuth(enabled = false, replace = "venue:venueInfo:")
public class VenueInfoController extends SuperController<VenueInfoService, Long, VenueInfo, VenueInfoPageQuery, VenueInfoSaveDTO, VenueInfoUpdateDTO> {

    @Autowired
    private EchoService echoService;

    @Override
    public void handlerResult(IPage<VenueInfo> page) {
        echoService.action(page);
    }
    /**
     * Excel导入后的操作
     *
     * @param list
     */
    @Override
    public R<Boolean> handlerImport(List<Map<String, String>> list){
        List<VenueInfo> venueInfoList = list.stream().map((map) -> {
            VenueInfo venueInfo = VenueInfo.builder().build();
            //TODO 请在这里完成转换
            return venueInfo;
        }).collect(Collectors.toList());

        return R.success(baseService.saveBatch(venueInfoList));
    }
}
