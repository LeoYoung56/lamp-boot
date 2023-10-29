package top.tangyh.lamp.device.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

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
@ApiModel(value = "DeviceInfoPageQuery", description = "监控设备信息")
public class DeviceInfoPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称")
    private String deviceName;
    /**
     * 设备类型
     */
    @ApiModelProperty(value = "设备类型")
    private String deviceType;
    /**
     * 设备位置
     */
    @ApiModelProperty(value = "设备位置")
    private String location;
    /**
     * 设备状态,Online, Offline, Error, Unknown
     */
    @ApiModelProperty(value = "设备状态,Online, Offline, Error, Unknown")
    private String status;
    /**
     * 设备描述
     */
    @ApiModelProperty(value = "设备描述")
    private String description;
    /**
     * 设备租户代码
     */
    @ApiModelProperty(value = "设备租户代码")
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
    private String deviceUrl;
    /**
     * 协议信息
     */
    @ApiModelProperty(value = "协议信息")
    private String protocolInfo;
    /**
     * AI平台同步状态, Synced, unknown
     */
    @ApiModelProperty(value = "AI平台同步状态, Synced, unknown")
    private String aiSyncStatus;

}
