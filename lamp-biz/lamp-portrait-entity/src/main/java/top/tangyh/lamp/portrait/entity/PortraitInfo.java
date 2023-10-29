package top.tangyh.lamp.portrait.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.Entity;
import top.tangyh.basic.interfaces.echo.EchoVO;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * <p>
 * 实体类
 * 人像信息表
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
@TableName("a_portrait_info")
@ApiModel(value = "PortraitInfo", description = "人像信息表")
@AllArgsConstructor
public class PortraitInfo extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 原图URL
     */
    @ApiModelProperty(value = "原图URL")
    @Size(max = 255, message = "原图URL长度不能超过255")
    @TableField(value = "full_image_url", condition = LIKE)
    @Excel(name = "原图URL")
    private String fullImageUrl;

    /**
     * 头像URL
     */
    @ApiModelProperty(value = "头像URL")
    @Size(max = 255, message = "头像URL长度不能超过255")
    @TableField(value = "avatar_image_url", condition = LIKE)
    @Excel(name = "头像URL")
    private String avatarImageUrl;

    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
    @Size(max = 100, message = "人员姓名长度不能超过100")
    @TableField(value = "person_name", condition = LIKE)
    @Excel(name = "人员姓名")
    private String personName;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    @TableField(value = "age")
    @Excel(name = "年龄")
    private Integer age;

    /**
     * 性别, Male, Female, Other
     */
    @ApiModelProperty(value = "性别, Male, Female, Other")
    @Size(max = 20, message = "性别, Male, Female, Other长度不能超过20")
    @TableField(value = "gender", condition = LIKE)
    @Excel(name = "性别, Male, Female, Other")
    private String gender;

    /**
     * 职位
     */
    @ApiModelProperty(value = "职位")
    @Size(max = 100, message = "职位长度不能超过100")
    @TableField(value = "position", condition = LIKE)
    @Excel(name = "职位")
    private String position;

    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    @Size(max = 20, message = "电话号码长度不能超过20")
    @TableField(value = "phone_number", condition = LIKE)
    @Excel(name = "电话号码")
    private String phoneNumber;

    /**
     * 备注信息
     */
    @ApiModelProperty(value = "备注信息")
    @Size(max = 65535, message = "备注信息长度不能超过65535")
    @TableField(value = "description", condition = LIKE)
    @Excel(name = "备注信息")
    private String description;


    @Builder
    public PortraitInfo(Long id, Long createdBy, LocalDateTime createTime, Long updatedBy, LocalDateTime updateTime, 
                    String fullImageUrl, String avatarImageUrl, String personName, Integer age, String gender, 
                    String position, String phoneNumber, String description) {
        this.id = id;
        this.createdBy = createdBy;
        this.createTime = createTime;
        this.updatedBy = updatedBy;
        this.updateTime = updateTime;
        this.fullImageUrl = fullImageUrl;
        this.avatarImageUrl = avatarImageUrl;
        this.personName = personName;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

}
