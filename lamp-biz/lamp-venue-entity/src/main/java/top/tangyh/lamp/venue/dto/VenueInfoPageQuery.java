package top.tangyh.lamp.venue.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 实体类
 * 场地信息表
 * </p>
 *
 * @author leo
 * @since 2023-10-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "VenueInfoPageQuery", description = "场地信息表")
public class VenueInfoPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场地名称
     */
    @ApiModelProperty(value = "场地名称")
    private String venueName;
    /**
     * 场地类型, 如某某船，某某甲板
     */
    @ApiModelProperty(value = "场地类型, 如某某船，某某甲板")
    private String venueType;
    /**
     * 场地描述
     */
    @ApiModelProperty(value = "场地描述")
    private String venueDescription;
    /**
     * 场地地址
     */
    @ApiModelProperty(value = "场地地址")
    private String venueAddress;
    /**
     * 场地是否可移动
     */
    @ApiModelProperty(value = "场地是否可移动")
    private String isMovable;
    /**
     * 场地移动状态，移动中，静止
     */
    @ApiModelProperty(value = "场地移动状态，移动中，静止")
    private String moveState;
    /**
     * 场地是否为场所
     */
    @ApiModelProperty(value = "场地是否为场所")
    private Boolean isPlace;
    /**
     * 场地层级
     */
    @ApiModelProperty(value = "场地层级")
    private String hierarchyLevel;
    /**
     * 当前纬度
     */
    @ApiModelProperty(value = "当前纬度")
    private BigDecimal latitude;
    /**
     * 当前经度
     */
    @ApiModelProperty(value = "当前经度")
    private BigDecimal longitude;
    /**
     * 联系人姓名
     */
    @ApiModelProperty(value = "联系人姓名")
    private String contactName;
    /**
     * 联系人电话号码
     */
    @ApiModelProperty(value = "联系人电话号码")
    private String contactPhone;
    /**
     * 联系人电子邮件
     */
    @ApiModelProperty(value = "联系人电子邮件")
    private String contactEmail;

}
