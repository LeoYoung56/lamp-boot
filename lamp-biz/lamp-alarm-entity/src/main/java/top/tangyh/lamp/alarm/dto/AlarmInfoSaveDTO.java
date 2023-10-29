package top.tangyh.lamp.alarm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.Size;
import java.io.Serializable;

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
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "AlarmInfoSaveDTO", description = "告警信息表")
public class AlarmInfoSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关联的监控设备ID
     */
    @ApiModelProperty(value = "关联的监控设备ID")
    private Long alarmDefinitionId;
    /**
     * 关联的监控设备ID
     */
    @ApiModelProperty(value = "关联的监控设备ID")
    private Long deviceId;
    /**
     * 触发告警的任务ID
     */
    @ApiModelProperty(value = "触发告警的任务ID")
    private Long taskId;
    /**
     * 告警类型
     */
    @ApiModelProperty(value = "告警类型")
    @Size(max = 50, message = "告警类型长度不能超过50")
    private String alarmType;
    /**
     * 告警时间
     */
    @ApiModelProperty(value = "告警时间")
    private Long alarmTime;
    /**
     * 告警描述
     */
    @ApiModelProperty(value = "告警描述")
    @Size(max = 65535, message = "告警描述长度不能超过65,535")
    private String description;
    /**
     * 告警级别ID
     */
    @ApiModelProperty(value = "告警级别ID")
    private Long severityId;
    /**
     * 告警确认人员ID
     */
    @ApiModelProperty(value = "告警确认人员ID")
    private Long confirmationPersonId;
    /**
     * 告警确认时间
     */
    @ApiModelProperty(value = "告警确认时间")
    private Long confirmationTime;
    /**
     * 告警对应的视频地址
     */
    @ApiModelProperty(value = "告警对应的视频地址")
    @Size(max = 255, message = "告警对应的视频地址长度不能超过255")
    private String videoUrl;
    /**
     * 截图文件的URL
     */
    @ApiModelProperty(value = "截图文件的URL")
    @Size(max = 255, message = "截图文件的URL长度不能超过255")
    private String screenshotUrl;
    /**
     * 截图描述信息
     */
    @ApiModelProperty(value = "截图描述信息")
    @Size(max = 65535, message = "截图描述信息长度不能超过65,535")
    private String screenshotDescription;
    /**
     * 视频描述信息
     */
    @ApiModelProperty(value = "视频描述信息")
    @Size(max = 65535, message = "视频描述信息长度不能超过65,535")
    private String videoDescription;

}
