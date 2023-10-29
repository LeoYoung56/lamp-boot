package top.tangyh.lamp.alarm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.SuperEntity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * <p>
 * 实体类
 * 动态告警等级定义表
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
@ApiModel(value = "AlarmDefinitionUpdateDTO", description = "动态告警等级定义表")
public class AlarmDefinitionUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @NotNull(message = "请填写主键", groups = SuperEntity.Update.class)
    private Long id;

    /**
     * 范围ID，对应ES的范围，如果为空就不看位置信息直接告警
     */
    @ApiModelProperty(value = "范围ID，对应ES的范围，如果为空就不看位置信息直接告警")
    private Long rangeId;
    /**
     * Cron时间表达式，如果为空就不看时间信息直接告警
     */
    @ApiModelProperty(value = "Cron时间表达式，如果为空就不看时间信息直接告警")
    @Size(max = 255, message = "Cron时间表达式，如果为空就不看时间信息直接告警长度不能超过255")
    private String cronExpression;
    /**
     * 告警类型
     */
    @ApiModelProperty(value = "告警类型")
    @NotEmpty(message = "请填写告警类型")
    @Size(max = 50, message = "告警类型长度不能超过50")
    private String alarmType;
    /**
     * 告警等级
     */
    @ApiModelProperty(value = "告警等级")
    @NotNull(message = "请填写告警等级")
    private Integer severityId;
    /**
     * 动态告警定义描述
     */
    @ApiModelProperty(value = "动态告警定义描述")
    @Size(max = 65535, message = "动态告警定义描述长度不能超过65,535")
    private String description;
    /**
     * 可以进行确认的人员类型ID
     */
    @ApiModelProperty(value = "可以进行确认的人员类型ID")
    private Long confirmablePersonTypeId;
}
