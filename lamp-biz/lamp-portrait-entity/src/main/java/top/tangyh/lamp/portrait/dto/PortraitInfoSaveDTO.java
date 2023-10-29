package top.tangyh.lamp.portrait.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.Size;
import java.io.Serializable;

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
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "PortraitInfoSaveDTO", description = "人像信息表")
public class PortraitInfoSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 原图URL
     */
    @ApiModelProperty(value = "原图URL")
    @Size(max = 255, message = "原图URL长度不能超过255")
    private String fullImageUrl;
    /**
     * 头像URL
     */
    @ApiModelProperty(value = "头像URL")
    @Size(max = 255, message = "头像URL长度不能超过255")
    private String avatarImageUrl;
    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
    @Size(max = 100, message = "人员姓名长度不能超过100")
    private String personName;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;
    /**
     * 性别, Male, Female, Other
     */
    @ApiModelProperty(value = "性别, Male, Female, Other")
    @Size(max = 20, message = "性别, Male, Female, Other长度不能超过20")
    private String gender;
    /**
     * 职位
     */
    @ApiModelProperty(value = "职位")
    @Size(max = 100, message = "职位长度不能超过100")
    private String position;
    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    @Size(max = 20, message = "电话号码长度不能超过20")
    private String phoneNumber;
    /**
     * 备注信息
     */
    @ApiModelProperty(value = "备注信息")
    @Size(max = 65535, message = "备注信息长度不能超过65,535")
    private String description;

}
