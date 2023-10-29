package top.tangyh.lamp.task.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

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
@ApiModel(value = "TaskDefinitionPageQuery", description = "任务类型表")
public class TaskDefinitionPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务类型
     */
    @ApiModelProperty(value = "任务类型")
    private String taskType;
    /**
     * 算法模型
     */
    @ApiModelProperty(value = "算法模型")
    private String aiModule;
    /**
     * 所需设备类型
     */
    @ApiModelProperty(value = "所需设备类型")
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
    private String alertDefinition;

}
