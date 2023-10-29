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

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * <p>
 * 实体类
 * 告警信息表
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
@TableName("a_alarm_info")
@ApiModel(value = "AlarmInfo", description = "告警信息表")
@AllArgsConstructor
public class AlarmInfo extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 关联的监控设备ID
     */
    @ApiModelProperty(value = "关联的监控设备ID")
    @TableField(value = "alarm_definition_id")
    @Excel(name = "关联的监控设备ID")
    private Long alarmDefinitionId;

    /**
     * 关联的监控设备ID
     */
    @ApiModelProperty(value = "关联的监控设备ID")
    @TableField(value = "device_id")
    @Excel(name = "关联的监控设备ID")
    private Long deviceId;

    /**
     * 触发告警的任务ID
     */
    @ApiModelProperty(value = "触发告警的任务ID")
    @TableField(value = "task_id")
    @Excel(name = "触发告警的任务ID")
    private Long taskId;

    /**
     * 告警类型
     */
    @ApiModelProperty(value = "告警类型")
    @Size(max = 50, message = "告警类型长度不能超过50")
    @TableField(value = "alarm_type", condition = LIKE)
    @Excel(name = "告警类型")
    private String alarmType;

    /**
     * 告警时间
     */
    @ApiModelProperty(value = "告警时间")
    @TableField(value = "alarm_time")
    @Excel(name = "告警时间")
    private Long alarmTime;

    /**
     * 告警描述
     */
    @ApiModelProperty(value = "告警描述")
    @Size(max = 65535, message = "告警描述长度不能超过65535")
    @TableField(value = "description", condition = LIKE)
    @Excel(name = "告警描述")
    private String description;

    /**
     * 告警级别ID
     */
    @ApiModelProperty(value = "告警级别ID")
    @TableField(value = "severity_id")
    @Excel(name = "告警级别ID")
    private Long severityId;

    /**
     * 告警确认人员ID
     */
    @ApiModelProperty(value = "告警确认人员ID")
    @TableField(value = "confirmation_person_id")
    @Excel(name = "告警确认人员ID")
    private Long confirmationPersonId;

    /**
     * 告警确认时间
     */
    @ApiModelProperty(value = "告警确认时间")
    @TableField(value = "confirmation_time")
    @Excel(name = "告警确认时间")
    private Long confirmationTime;

    /**
     * 告警对应的视频地址
     */
    @ApiModelProperty(value = "告警对应的视频地址")
    @Size(max = 255, message = "告警对应的视频地址长度不能超过255")
    @TableField(value = "video_url", condition = LIKE)
    @Excel(name = "告警对应的视频地址")
    private String videoUrl;

    /**
     * 截图文件的URL
     */
    @ApiModelProperty(value = "截图文件的URL")
    @Size(max = 255, message = "截图文件的URL长度不能超过255")
    @TableField(value = "screenshot_url", condition = LIKE)
    @Excel(name = "截图文件的URL")
    private String screenshotUrl;

    /**
     * 截图描述信息
     */
    @ApiModelProperty(value = "截图描述信息")
    @Size(max = 65535, message = "截图描述信息长度不能超过65535")
    @TableField(value = "screenshot_description", condition = LIKE)
    @Excel(name = "截图描述信息")
    private String screenshotDescription;

    /**
     * 视频描述信息
     */
    @ApiModelProperty(value = "视频描述信息")
    @Size(max = 65535, message = "视频描述信息长度不能超过65535")
    @TableField(value = "video_description", condition = LIKE)
    @Excel(name = "视频描述信息")
    private String videoDescription;


    @Builder
    public AlarmInfo(Long id, Long createdBy, LocalDateTime createTime, Long updatedBy, LocalDateTime updateTime, 
                    Long alarmDefinitionId, Long deviceId, Long taskId, String alarmType, Long alarmTime, 
                    String description, Long severityId, Long confirmationPersonId, Long confirmationTime, String videoUrl, String screenshotUrl, 
                    String screenshotDescription, String videoDescription) {
        this.id = id;
        this.createdBy = createdBy;
        this.createTime = createTime;
        this.updatedBy = updatedBy;
        this.updateTime = updateTime;
        this.alarmDefinitionId = alarmDefinitionId;
        this.deviceId = deviceId;
        this.taskId = taskId;
        this.alarmType = alarmType;
        this.alarmTime = alarmTime;
        this.description = description;
        this.severityId = severityId;
        this.confirmationPersonId = confirmationPersonId;
        this.confirmationTime = confirmationTime;
        this.videoUrl = videoUrl;
        this.screenshotUrl = screenshotUrl;
        this.screenshotDescription = screenshotDescription;
        this.videoDescription = videoDescription;
    }

}
