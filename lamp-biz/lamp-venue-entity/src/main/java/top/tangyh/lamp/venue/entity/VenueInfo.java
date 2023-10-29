package top.tangyh.lamp.venue.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.Entity;
import top.tangyh.basic.interfaces.echo.EchoVO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

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
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("a_venue_info")
@ApiModel(value = "VenueInfo", description = "场地信息表")
@AllArgsConstructor
public class VenueInfo extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 场地名称
     */
    @ApiModelProperty(value = "场地名称")
    @NotEmpty(message = "请填写场地名称")
    @Size(max = 100, message = "场地名称长度不能超过100")
    @TableField(value = "venue_name", condition = LIKE)
    @Excel(name = "场地名称")
    private String venueName;

    /**
     * 场地类型, 如某某船，某某甲板
     */
    @ApiModelProperty(value = "场地类型, 如某某船，某某甲板")
    @Size(max = 50, message = "场地类型, 如某某船，某某甲板长度不能超过50")
    @TableField(value = "venue_type", condition = LIKE)
    @Excel(name = "场地类型, 如某某船，某某甲板")
    private String venueType;

    /**
     * 场地描述
     */
    @ApiModelProperty(value = "场地描述")
    @Size(max = 65535, message = "场地描述长度不能超过65535")
    @TableField(value = "venue_description", condition = LIKE)
    @Excel(name = "场地描述")
    private String venueDescription;

    /**
     * 场地地址
     */
    @ApiModelProperty(value = "场地地址")
    @Size(max = 255, message = "场地地址长度不能超过255")
    @TableField(value = "venue_address", condition = LIKE)
    @Excel(name = "场地地址")
    private String venueAddress;

    /**
     * 场地是否可移动
     */
    @ApiModelProperty(value = "场地是否可移动")
    @Size(max = 20, message = "场地是否可移动长度不能超过20")
    @TableField(value = "is_movable", condition = LIKE)
    @Excel(name = "场地是否可移动")
    private String isMovable;

    /**
     * 场地移动状态，移动中，静止
     */
    @ApiModelProperty(value = "场地移动状态，移动中，静止")
    @Size(max = 50, message = "场地移动状态，移动中，静止长度不能超过50")
    @TableField(value = "move_state", condition = LIKE)
    @Excel(name = "场地移动状态，移动中，静止")
    private String moveState;

    /**
     * 场地是否为场所
     */
    @ApiModelProperty(value = "场地是否为场所")
    @TableField(value = "is_place")
    @Excel(name = "场地是否为场所", replace = {"是_true", "否_false", "_null"})
    private Boolean isPlace;

    /**
     * 场地层级
     */
    @ApiModelProperty(value = "场地层级")
    @Size(max = 255, message = "场地层级长度不能超过255")
    @TableField(value = "hierarchy_level", condition = LIKE)
    @Excel(name = "场地层级")
    private String hierarchyLevel;

    /**
     * 当前纬度
     */
    @ApiModelProperty(value = "当前纬度")
    @TableField(value = "latitude")
    @Excel(name = "当前纬度")
    private BigDecimal latitude;

    /**
     * 当前经度
     */
    @ApiModelProperty(value = "当前经度")
    @TableField(value = "longitude")
    @Excel(name = "当前经度")
    private BigDecimal longitude;

    /**
     * 联系人姓名
     */
    @ApiModelProperty(value = "联系人姓名")
    @Size(max = 100, message = "联系人姓名长度不能超过100")
    @TableField(value = "contact_name", condition = LIKE)
    @Excel(name = "联系人姓名")
    private String contactName;

    /**
     * 联系人电话号码
     */
    @ApiModelProperty(value = "联系人电话号码")
    @Size(max = 20, message = "联系人电话号码长度不能超过20")
    @TableField(value = "contact_phone", condition = LIKE)
    @Excel(name = "联系人电话号码")
    private String contactPhone;

    /**
     * 联系人电子邮件
     */
    @ApiModelProperty(value = "联系人电子邮件")
    @Size(max = 100, message = "联系人电子邮件长度不能超过100")
    @TableField(value = "contact_email", condition = LIKE)
    @Excel(name = "联系人电子邮件")
    private String contactEmail;


    @Builder
    public VenueInfo(Long id, Long createdBy, LocalDateTime createTime, Long updatedBy, LocalDateTime updateTime, 
                    String venueName, String venueType, String venueDescription, String venueAddress, String isMovable, 
                    String moveState, Boolean isPlace, String hierarchyLevel, BigDecimal latitude, BigDecimal longitude, String contactName, 
                    String contactPhone, String contactEmail) {
        this.id = id;
        this.createdBy = createdBy;
        this.createTime = createTime;
        this.updatedBy = updatedBy;
        this.updateTime = updateTime;
        this.venueName = venueName;
        this.venueType = venueType;
        this.venueDescription = venueDescription;
        this.venueAddress = venueAddress;
        this.isMovable = isMovable;
        this.moveState = moveState;
        this.isPlace = isPlace;
        this.hierarchyLevel = hierarchyLevel;
        this.latitude = latitude;
        this.longitude = longitude;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
    }

}
