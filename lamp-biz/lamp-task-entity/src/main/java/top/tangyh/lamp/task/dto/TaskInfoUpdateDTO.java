package top.tangyh.lamp.task.dto;

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
@ApiModel(value = "TaskInfoUpdateDTO", description = "AI视觉任务信息表")
public class TaskInfoUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @NotNull(message = "请填写主键", groups = SuperEntity.Update.class)
    private Long id;

    /**
     * 任务名称
     */
    @ApiModelProperty(value = "任务名称")
    @NotEmpty(message = "请填写任务名称")
    @Size(max = 100, message = "任务名称长度不能超过100")
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
    @Size(max = 65535, message = "任务描述长度不能超过65,535")
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
    @Size(max = 50, message = "任务是否启用长度不能超过50")
    private String enable;
    /**
     * 任务状态，启动中，运行中，错误，未知
     */
    @ApiModelProperty(value = "任务状态，启动中，运行中，错误，未知")
    @Size(max = 50, message = "任务状态，启动中，运行中，错误，未知长度不能超过50")
    private String status;
}
