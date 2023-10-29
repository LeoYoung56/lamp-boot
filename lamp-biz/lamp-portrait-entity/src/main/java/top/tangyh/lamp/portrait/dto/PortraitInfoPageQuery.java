package top.tangyh.lamp.portrait.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

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
@ApiModel(value = "PortraitInfoPageQuery", description = "人像信息表")
public class PortraitInfoPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 原图URL
     */
    @ApiModelProperty(value = "原图URL")
    private String fullImageUrl;
    /**
     * 头像URL
     */
    @ApiModelProperty(value = "头像URL")
    private String avatarImageUrl;
    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
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
    private String gender;
    /**
     * 职位
     */
    @ApiModelProperty(value = "职位")
    private String position;
    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    private String phoneNumber;
    /**
     * 备注信息
     */
    @ApiModelProperty(value = "备注信息")
    private String description;

}
