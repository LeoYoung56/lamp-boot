package top.tangyh.lamp.device.dto;

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
 * 监控设备信息
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
@ApiModel(value = "DeviceInfoUpdateDTO", description = "监控设备信息")
public class DeviceInfoUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @NotNull(message = "请填写主键", groups = SuperEntity.Update.class)
    private Long id;

    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称")
    @NotEmpty(message = "请填写设备名称")
    @Size(max = 255, message = "设备名称长度不能超过255")
    private String deviceName;
    /**
     * 设备类型
     */
    @ApiModelProperty(value = "设备类型")
    @Size(max = 50, message = "设备类型长度不能超过50")
    private String deviceType;
    /**
     * 设备位置
     */
    @ApiModelProperty(value = "设备位置")
    @Size(max = 100, message = "设备位置长度不能超过100")
    private String location;
    /**
     * 设备状态,Online, Offline, Error, Unknown
     */
    @ApiModelProperty(value = "设备状态,Online, Offline, Error, Unknown")
    @Size(max = 50, message = "设备状态,Online, Offline, Error, Unknown长度不能超过50")
    private String status;
    /**
     * 设备描述
     */
    @ApiModelProperty(value = "设备描述")
    @Size(max = 65535, message = "设备描述长度不能超过65,535")
    private String description;
    /**
     * 设备租户代码
     */
    @ApiModelProperty(value = "设备租户代码")
    @Size(max = 20, message = "设备租户代码长度不能超过20")
    private String deviceTenantCode;
    /**
     * AI平台ID
     */
    @ApiModelProperty(value = "AI平台ID")
    private Long aiPlatformId;
    /**
     * 设备URL
     */
    @ApiModelProperty(value = "设备URL")
    @Size(max = 255, message = "设备URL长度不能超过255")
    private String deviceUrl;
    /**
     * 协议信息
     */
    @ApiModelProperty(value = "协议信息")
    @Size(max = 50, message = "协议信息长度不能超过50")
    private String protocolInfo;
    /**
     * AI平台同步状态, Synced, unknown
     */
    @ApiModelProperty(value = "AI平台同步状态, Synced, unknown")
    @Size(max = 50, message = "AI平台同步状态, Synced, unknown长度不能超过50")
    private String aiSyncStatus;
}
