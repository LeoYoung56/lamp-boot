package top.tangyh.lamp.venue.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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
@ApiModel(value = "VenueInfoSaveDTO", description = "场地信息表")
public class VenueInfoSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场地名称
     */
    @ApiModelProperty(value = "场地名称")
    @NotEmpty(message = "请填写场地名称")
    @Size(max = 100, message = "场地名称长度不能超过100")
    private String venueName;
    /**
     * 场地类型, 如某某船，某某甲板
     */
    @ApiModelProperty(value = "场地类型, 如某某船，某某甲板")
    @Size(max = 50, message = "场地类型, 如某某船，某某甲板长度不能超过50")
    private String venueType;
    /**
     * 场地描述
     */
    @ApiModelProperty(value = "场地描述")
    @Size(max = 65535, message = "场地描述长度不能超过65,535")
    private String venueDescription;
    /**
     * 场地地址
     */
    @ApiModelProperty(value = "场地地址")
    @Size(max = 255, message = "场地地址长度不能超过255")
    private String venueAddress;
    /**
     * 场地是否可移动
     */
    @ApiModelProperty(value = "场地是否可移动")
    @Size(max = 20, message = "场地是否可移动长度不能超过20")
    private String isMovable;
    /**
     * 场地移动状态，移动中，静止
     */
    @ApiModelProperty(value = "场地移动状态，移动中，静止")
    @Size(max = 50, message = "场地移动状态，移动中，静止长度不能超过50")
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
    @Size(max = 255, message = "场地层级长度不能超过255")
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
    @Size(max = 100, message = "联系人姓名长度不能超过100")
    private String contactName;
    /**
     * 联系人电话号码
     */
    @ApiModelProperty(value = "联系人电话号码")
    @Size(max = 20, message = "联系人电话号码长度不能超过20")
    private String contactPhone;
    /**
     * 联系人电子邮件
     */
    @ApiModelProperty(value = "联系人电子邮件")
    @Size(max = 100, message = "联系人电子邮件长度不能超过100")
    private String contactEmail;

}
