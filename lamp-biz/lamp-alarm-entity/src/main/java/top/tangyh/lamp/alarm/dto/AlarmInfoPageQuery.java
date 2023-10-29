package top.tangyh.lamp.alarm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

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
@ApiModel(value = "AlarmInfoPageQuery", description = "告警信息表")
public class AlarmInfoPageQuery implements Serializable {

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
    private String videoUrl;
    /**
     * 截图文件的URL
     */
    @ApiModelProperty(value = "截图文件的URL")
    private String screenshotUrl;
    /**
     * 截图描述信息
     */
    @ApiModelProperty(value = "截图描述信息")
    private String screenshotDescription;
    /**
     * 视频描述信息
     */
    @ApiModelProperty(value = "视频描述信息")
    private String videoDescription;

}
