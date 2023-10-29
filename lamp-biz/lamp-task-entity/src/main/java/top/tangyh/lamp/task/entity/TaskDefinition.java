package top.tangyh.lamp.task.entity;

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
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * <p>
 * 实体类
 * 任务类型表
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
@TableName("a_task_definition")
@ApiModel(value = "TaskDefinition", description = "任务类型表")
@AllArgsConstructor
public class TaskDefinition extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 任务类型
     */
    @ApiModelProperty(value = "任务类型")
    @NotEmpty(message = "请填写任务类型")
    @Size(max = 50, message = "任务类型长度不能超过50")
    @TableField(value = "task_type", condition = LIKE)
    @Excel(name = "任务类型")
    private String taskType;

    /**
     * 算法模型
     */
    @ApiModelProperty(value = "算法模型")
    @NotEmpty(message = "请填写算法模型")
    @Size(max = 255, message = "算法模型长度不能超过255")
    @TableField(value = "ai_module", condition = LIKE)
    @Excel(name = "算法模型")
    private String aiModule;

    /**
     * 所需设备类型
     */
    @ApiModelProperty(value = "所需设备类型")
    @Size(max = 50, message = "所需设备类型长度不能超过50")
    @TableField(value = "required_device_type", condition = LIKE)
    @Excel(name = "所需设备类型")
    private String requiredDeviceType;

    /**
     * 最少可接受的设备数量
     */
    @ApiModelProperty(value = "最少可接受的设备数量")
    @TableField(value = "min_device_count")
    @Excel(name = "最少可接受的设备数量")
    private Integer minDeviceCount;

    /**
     * 最多可接受的设备数量
     */
    @ApiModelProperty(value = "最多可接受的设备数量")
    @TableField(value = "max_device_count")
    @Excel(name = "最多可接受的设备数量")
    private Integer maxDeviceCount;

    /**
     * 任务触发的告警定义类型
     */
    @ApiModelProperty(value = "任务触发的告警定义类型")
    @Size(max = 100, message = "任务触发的告警定义类型长度不能超过100")
    @TableField(value = "alert_definition", condition = LIKE)
    @Excel(name = "任务触发的告警定义类型")
    private String alertDefinition;


    @Builder
    public TaskDefinition(Long id, LocalDateTime createTime, Long createdBy, LocalDateTime updateTime, Long updatedBy, 
                    String taskType, String aiModule, String requiredDeviceType, Integer minDeviceCount, Integer maxDeviceCount, String alertDefinition) {
        this.id = id;
        this.createTime = createTime;
        this.createdBy = createdBy;
        this.updateTime = updateTime;
        this.updatedBy = updatedBy;
        this.taskType = taskType;
        this.aiModule = aiModule;
        this.requiredDeviceType = requiredDeviceType;
        this.minDeviceCount = minDeviceCount;
        this.maxDeviceCount = maxDeviceCount;
        this.alertDefinition = alertDefinition;
    }

}
