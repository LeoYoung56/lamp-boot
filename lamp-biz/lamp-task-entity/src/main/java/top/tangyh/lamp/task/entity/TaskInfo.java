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
 * AI视觉任务信息表
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
@TableName("a_task_info")
@ApiModel(value = "TaskInfo", description = "AI视觉任务信息表")
@AllArgsConstructor
public class TaskInfo extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 任务名称
     */
    @ApiModelProperty(value = "任务名称")
    @NotEmpty(message = "请填写任务名称")
    @Size(max = 100, message = "任务名称长度不能超过100")
    @TableField(value = "task_name", condition = LIKE)
    @Excel(name = "任务名称")
    private String taskName;

    /**
     * 任务类型
     */
    @ApiModelProperty(value = "任务类型")
    @TableField(value = "task_type_id")
    @Excel(name = "任务类型")
    private Integer taskTypeId;

    /**
     * 任务描述
     */
    @ApiModelProperty(value = "任务描述")
    @Size(max = 65535, message = "任务描述长度不能超过65535")
    @TableField(value = "task_description", condition = LIKE)
    @Excel(name = "任务描述")
    private String taskDescription;

    /**
     * 任务开始时间
     */
    @ApiModelProperty(value = "任务开始时间")
    @TableField(value = "start_time")
    @Excel(name = "任务开始时间")
    private Long startTime;

    /**
     * 任务结束时间
     */
    @ApiModelProperty(value = "任务结束时间")
    @TableField(value = "end_time")
    @Excel(name = "任务结束时间")
    private Long endTime;

    /**
     * 任务是否启用
     */
    @ApiModelProperty(value = "任务是否启用")
    @Size(max = 50, message = "任务是否启用长度不能超过50")
    @TableField(value = "enable", condition = LIKE)
    @Excel(name = "任务是否启用")
    private String enable;

    /**
     * 任务状态，启动中，运行中，错误，未知
     */
    @ApiModelProperty(value = "任务状态，启动中，运行中，错误，未知")
    @Size(max = 50, message = "任务状态，启动中，运行中，错误，未知长度不能超过50")
    @TableField(value = "status", condition = LIKE)
    @Excel(name = "任务状态，启动中，运行中，错误，未知")
    private String status;


    @Builder
    public TaskInfo(Long id, Long createdBy, LocalDateTime createTime, Long updatedBy, LocalDateTime updateTime, 
                    String taskName, Integer taskTypeId, String taskDescription, Long startTime, Long endTime, 
                    String enable, String status) {
        this.id = id;
        this.createdBy = createdBy;
        this.createTime = createTime;
        this.updatedBy = updatedBy;
        this.updateTime = updateTime;
        this.taskName = taskName;
        this.taskTypeId = taskTypeId;
        this.taskDescription = taskDescription;
        this.startTime = startTime;
        this.endTime = endTime;
        this.enable = enable;
        this.status = status;
    }

}
