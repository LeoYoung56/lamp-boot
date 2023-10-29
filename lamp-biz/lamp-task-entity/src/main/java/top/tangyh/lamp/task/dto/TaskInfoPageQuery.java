package top.tangyh.lamp.task.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 实体类
 * AI视觉任务信息表
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
@ApiModel(value = "TaskInfoPageQuery", description = "AI视觉任务信息表")
public class TaskInfoPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务名称
     */
    @ApiModelProperty(value = "任务名称")
    private String taskName;
    /**
     * 任务类型
     */
    @ApiModelProperty(value = "任务类型")
    private Integer taskTypeId;
    /**
     * 任务描述
     */
    @ApiModelProperty(value = "任务描述")
    private String taskDescription;
    /**
     * 任务开始时间
     */
    @ApiModelProperty(value = "任务开始时间")
    private Long startTime;
    /**
     * 任务结束时间
     */
    @ApiModelProperty(value = "任务结束时间")
    private Long endTime;
    /**
     * 任务是否启用
     */
    @ApiModelProperty(value = "任务是否启用")
    private String enable;
    /**
     * 任务状态，启动中，运行中，错误，未知
     */
    @ApiModelProperty(value = "任务状态，启动中，运行中，错误，未知")
    private String status;

}
