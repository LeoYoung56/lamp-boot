package top.tangyh.lamp.alarm.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

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
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("a_alarm_definition")
@ApiModel(value = "AlarmDefinition", description = "动态告警等级定义表")
@AllArgsConstructor
public class AlarmDefinition extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 范围ID，对应ES的范围，如果为空就不看位置信息直接告警
     */
    @ApiModelProperty(value = "范围ID，对应ES的范围，如果为空就不看位置信息直接告警")
    @TableField(value = "range_id")
    @Excel(name = "范围ID，对应ES的范围，如果为空就不看位置信息直接告警")
    private Long rangeId;

    /**
     * Cron时间表达式，如果为空就不看时间信息直接告警
     */
    @ApiModelProperty(value = "Cron时间表达式，如果为空就不看时间信息直接告警")
    @Size(max = 255, message = "Cron时间表达式，如果为空就不看时间信息直接告警长度不能超过255")
    @TableField(value = "cron_expression", condition = LIKE)
    @Excel(name = "Cron时间表达式，如果为空就不看时间信息直接告警")
    private String cronExpression;

    /**
     * 告警类型
     */
    @ApiModelProperty(value = "告警类型")
    @NotEmpty(message = "请填写告警类型")
    @Size(max = 50, message = "告警类型长度不能超过50")
    @TableField(value = "alarm_type", condition = LIKE)
    @Excel(name = "告警类型")
    private String alarmType;

    /**
     * 告警等级
     */
    @ApiModelProperty(value = "告警等级")
    @NotNull(message = "请填写告警等级")
    @TableField(value = "severity_id")
    @Excel(name = "告警等级")
    private Integer severityId;

    /**
     * 动态告警定义描述
     */
    @ApiModelProperty(value = "动态告警定义描述")
    @Size(max = 65535, message = "动态告警定义描述长度不能超过65535")
    @TableField(value = "description", condition = LIKE)
    @Excel(name = "动态告警定义描述")
    private String description;

    /**
     * 可以进行确认的人员类型ID
     */
    @ApiModelProperty(value = "可以进行确认的人员类型ID")
    @TableField(value = "confirmable_person_type_id")
    @Excel(name = "可以进行确认的人员类型ID")
    private Long confirmablePersonTypeId;


    @Builder
    public AlarmDefinition(Long id, Long createdBy, LocalDateTime createTime, Long updatedBy, LocalDateTime updateTime, 
                    Long rangeId, String cronExpression, String alarmType, Integer severityId, String description, Long confirmablePersonTypeId) {
        this.id = id;
        this.createdBy = createdBy;
        this.createTime = createTime;
        this.updatedBy = updatedBy;
        this.updateTime = updateTime;
        this.rangeId = rangeId;
        this.cronExpression = cronExpression;
        this.alarmType = alarmType;
        this.severityId = severityId;
        this.description = description;
        this.confirmablePersonTypeId = confirmablePersonTypeId;
    }

}
