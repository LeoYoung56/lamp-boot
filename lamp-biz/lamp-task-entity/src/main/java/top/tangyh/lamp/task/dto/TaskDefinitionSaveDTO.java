package top.tangyh.lamp.task.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

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
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "TaskDefinitionSaveDTO", description = "任务类型表")
public class TaskDefinitionSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务类型
     */
    @ApiModelProperty(value = "任务类型")
    @NotEmpty(message = "请填写任务类型")
    @Size(max = 50, message = "任务类型长度不能超过50")
    private String taskType;
    /**
     * 算法模型
     */
    @ApiModelProperty(value = "算法模型")
    @NotEmpty(message = "请填写算法模型")
    @Size(max = 255, message = "算法模型长度不能超过255")
    private String aiModule;
    /**
     * 所需设备类型
     */
    @ApiModelProperty(value = "所需设备类型")
    @Size(max = 50, message = "所需设备类型长度不能超过50")
    private String requiredDeviceType;
    /**
     * 最少可接受的设备数量
     */
    @ApiModelProperty(value = "最少可接受的设备数量")
    private Integer minDeviceCount;
    /**
     * 最多可接受的设备数量
     */
    @ApiModelProperty(value = "最多可接受的设备数量")
    private Integer maxDeviceCount;
    /**
     * 任务触发的告警定义类型
     */
    @ApiModelProperty(value = "任务触发的告警定义类型")
    @Size(max = 100, message = "任务触发的告警定义类型长度不能超过100")
    private String alertDefinition;

}
