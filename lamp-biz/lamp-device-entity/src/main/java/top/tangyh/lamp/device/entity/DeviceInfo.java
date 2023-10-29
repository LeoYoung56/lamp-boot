package top.tangyh.lamp.device.entity;

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
 * 监控设备信息
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
@TableName("a_device_info")
@ApiModel(value = "DeviceInfo", description = "监控设备信息")
@AllArgsConstructor
public class DeviceInfo extends Entity<Long> implements EchoVO {

    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private Map<String, Object> echoMap = new HashMap<>();
    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称")
    @NotEmpty(message = "请填写设备名称")
    @Size(max = 255, message = "设备名称长度不能超过255")
    @TableField(value = "device_name", condition = LIKE)
    @Excel(name = "设备名称")
    private String deviceName;

    /**
     * 设备类型
     */
    @ApiModelProperty(value = "设备类型")
    @Size(max = 50, message = "设备类型长度不能超过50")
    @TableField(value = "device_type", condition = LIKE)
    @Excel(name = "设备类型")
    private String deviceType;

    /**
     * 设备位置
     */
    @ApiModelProperty(value = "设备位置")
    @Size(max = 100, message = "设备位置长度不能超过100")
    @TableField(value = "location", condition = LIKE)
    @Excel(name = "设备位置")
    private String location;

    /**
     * 设备状态,Online, Offline, Error, Unknown
     */
    @ApiModelProperty(value = "设备状态,Online, Offline, Error, Unknown")
    @Size(max = 50, message = "设备状态,Online, Offline, Error, Unknown长度不能超过50")
    @TableField(value = "status", condition = LIKE)
    @Excel(name = "设备状态,Online, Offline, Error, Unknown")
    private String status;

    /**
     * 设备描述
     */
    @ApiModelProperty(value = "设备描述")
    @Size(max = 65535, message = "设备描述长度不能超过65535")
    @TableField(value = "description", condition = LIKE)
    @Excel(name = "设备描述")
    private String description;

    /**
     * 设备租户代码
     */
    @ApiModelProperty(value = "设备租户代码")
    @Size(max = 20, message = "设备租户代码长度不能超过20")
    @TableField(value = "device_tenant_code", condition = LIKE)
    @Excel(name = "设备租户代码")
    private String deviceTenantCode;

    /**
     * AI平台ID
     */
    @ApiModelProperty(value = "AI平台ID")
    @TableField(value = "ai_platform_id")
    @Excel(name = "AI平台ID")
    private Long aiPlatformId;

    /**
     * 设备URL
     */
    @ApiModelProperty(value = "设备URL")
    @Size(max = 255, message = "设备URL长度不能超过255")
    @TableField(value = "device_url", condition = LIKE)
    @Excel(name = "设备URL")
    private String deviceUrl;

    /**
     * 协议信息
     */
    @ApiModelProperty(value = "协议信息")
    @Size(max = 50, message = "协议信息长度不能超过50")
    @TableField(value = "protocol_info", condition = LIKE)
    @Excel(name = "协议信息")
    private String protocolInfo;

    /**
     * AI平台同步状态, Synced, unknown
     */
    @ApiModelProperty(value = "AI平台同步状态, Synced, unknown")
    @Size(max = 50, message = "AI平台同步状态, Synced, unknown长度不能超过50")
    @TableField(value = "ai_sync_status", condition = LIKE)
    @Excel(name = "AI平台同步状态, Synced, unknown")
    private String aiSyncStatus;


    @Builder
    public DeviceInfo(Long id, LocalDateTime createTime, Long createdBy, LocalDateTime updateTime, Long updatedBy, 
                    String deviceName, String deviceType, String location, String status, String description, 
                    String deviceTenantCode, Long aiPlatformId, String deviceUrl, String protocolInfo, String aiSyncStatus) {
        this.id = id;
        this.createTime = createTime;
        this.createdBy = createdBy;
        this.updateTime = updateTime;
        this.updatedBy = updatedBy;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.location = location;
        this.status = status;
        this.description = description;
        this.deviceTenantCode = deviceTenantCode;
        this.aiPlatformId = aiPlatformId;
        this.deviceUrl = deviceUrl;
        this.protocolInfo = protocolInfo;
        this.aiSyncStatus = aiSyncStatus;
    }

}
