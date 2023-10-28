CREATE TABLE a_venue_info
(
    venue_id          BIGINT                      NOT NULL PRIMARY KEY COMMENT '场地ID',
    venue_name        VARCHAR(100)                NOT NULL COMMENT '场地名称',
    venue_type        VARCHAR(50)                 NULL COMMENT '场地类型, 如某某船，某某甲板',
    venue_description TEXT                        NULL COMMENT '场地描述',
    venue_address     VARCHAR(255)                NULL COMMENT '场地地址',
    is_movable        VARCHAR(20)             default 'false' NULL COMMENT '场地是否可移动',
    move_state        VARCHAR(50)                 NULL COMMENT '场地移动状态，移动中，静止',
    is_place          BOOLEAN                     NULL COMMENT '场地是否为场所',
    hierarchy_level   VARCHAR(255)                NULL COMMENT '场地层级',
    latitude          DECIMAL(10, 6)              NULL COMMENT '当前纬度',
    longitude         DECIMAL(10, 6)              NULL COMMENT '当前经度',
    contact_name      VARCHAR(100)                NULL COMMENT '联系人姓名',
    contact_phone     VARCHAR(20)                 NULL COMMENT '联系人电话号码',
    contact_email     VARCHAR(100)                NULL COMMENT '联系人电子邮件',
    created_by        BIGINT                      NULL COMMENT '创建者',
    create_time       datetime    DEFAULT NULL COMMENT '创建时间',
    updated_by        BIGINT                      NULL COMMENT '更新者',
    update_time       datetime    DEFAULT NULL COMMENT '更新时间',
    tenant_code       varchar(20) default ''      not null comment '租户编码',
    constraint uk_venue_id unique (tenant_code, venue_id)
) COMMENT '场地信息表';

CREATE TABLE a_device_info
(
    device_id          BIGINT       NOT NULL PRIMARY KEY COMMENT '设备ID',
    device_name        VARCHAR(255) NOT NULL COMMENT '设备名称',
    device_type        VARCHAR(50)  NULL COMMENT '设备类型',
    location           VARCHAR(100) NULL COMMENT '设备位置',
    status             VARCHAR(50)  NULL default 'unknown' COMMENT '设备状态,Online, Offline, Error, Unknown',
    description        TEXT         NULL COMMENT '设备描述',
    device_tenant_code VARCHAR(20)  NULL COMMENT '设备租户代码',
    ai_platform_id     BIGINT       NULL COMMENT 'AI平台ID',
    device_url         VARCHAR(255) NULL COMMENT '设备URL',
    protocol_info      VARCHAR(50)  NULL COMMENT '协议信息',
    ai_sync_status     VARCHAR(50)  NULL default 'unknown' COMMENT 'AI平台同步状态, Synced, unknown',
    create_time        datetime          DEFAULT NULL COMMENT '创建时间',
    created_by         BIGINT       NULL COMMENT '创建者',
    update_time        datetime          DEFAULT NULL COMMENT '更新时间',
    updated_by         BIGINT       NULL COMMENT '更新者',
    tenant_code        varchar(20)       default '' not null comment '租户编码',
    constraint uk_device_id unique (tenant_code, device_id)
) COMMENT '监控设备信息';

CREATE TABLE a_task_definition
(
    task_definition_id   BIGINT                 NOT NULL PRIMARY KEY COMMENT '任务定义ID',
    task_type            VARCHAR(50)            NOT NULL COMMENT '任务类型',
    ai_module            VARCHAR(255)           NOT NULL COMMENT '算法模型',
    required_device_type VARCHAR(50)            NULL COMMENT '所需设备类型',
    min_device_count     INT                    NULL COMMENT '最少可接受的设备数量',
    max_device_count     INT                    NULL COMMENT '最多可接受的设备数量',
    alert_definition     VARCHAR(100)           NULL COMMENT '任务触发的告警定义类型',
    create_time          datetime    DEFAULT NULL COMMENT '创建时间',
    created_by           BIGINT                 NULL COMMENT '创建者',
    update_time          datetime    DEFAULT NULL COMMENT '更新时间',
    updated_by           BIGINT                 NULL COMMENT '更新者',
    tenant_code          varchar(20) default '' not null comment '租户编码',
    constraint uk_task_definition_id unique (tenant_code, task_definition_id)
) COMMENT '任务类型表';

CREATE TABLE a_task_info
(
    task_id          INT                    NOT NULL PRIMARY KEY COMMENT '任务ID',
    task_name        VARCHAR(100)           NOT NULL COMMENT '任务名称',
    task_type_id     INT                    NULL COMMENT '任务类型',
    task_description TEXT                   NULL COMMENT '任务描述',
    start_time       BIGINT                 NULL COMMENT '任务开始时间',
    end_time         BIGINT                 NULL COMMENT '任务结束时间',
    enable           VARCHAR(50)            NULL COMMENT '任务是否启用',
    status           VARCHAR(50)            NULL COMMENT '任务状态，启动中，运行中，错误，未知',
    created_by       BIGINT                 NULL COMMENT '创建者',
    create_time      datetime    DEFAULT NULL COMMENT '创建时间',
    updated_by       BIGINT                 NULL COMMENT '更新者',
    update_time      datetime    DEFAULT NULL COMMENT '更新时间',
    tenant_code      varchar(20) default '' not null comment '租户编码',
    constraint uk_task_id unique (tenant_code, task_id)
) COMMENT 'AI视觉任务信息表';

CREATE TABLE a_alarm_info
(
    alarm_id               BIGINT                 NOT NULL PRIMARY KEY COMMENT '告警ID',
    alarm_definition_id    BIGINT                 NULL COMMENT '关联的监控设备ID',
    device_id              BIGINT                 NULL COMMENT '关联的监控设备ID',
    task_id                BIGINT                 NULL COMMENT '触发告警的任务ID',
    alarm_type             VARCHAR(50)            NULL COMMENT '告警类型',
    alarm_time             BIGINT                 NULL COMMENT '告警时间',
    description            TEXT                   NULL COMMENT '告警描述',
    severity_id            BIGINT                 NULL COMMENT '告警级别ID',
    confirmation_person_id BIGINT                 NULL COMMENT '告警确认人员ID',
    confirmation_time      BIGINT                 NULL COMMENT '告警确认时间',
    video_url              VARCHAR(255)           NULL COMMENT '告警对应的视频地址',
    screenshot_url         VARCHAR(255)           NULL COMMENT '截图文件的URL',
    screenshot_description TEXT                   NULL COMMENT '截图描述信息',
    video_description      TEXT                   NULL COMMENT '视频描述信息',
    created_by             BIGINT                 NULL COMMENT '创建者',
    create_time            datetime    DEFAULT NULL COMMENT '创建时间',
    updated_by             BIGINT                 NULL COMMENT '更新者',
    update_time            datetime    DEFAULT NULL COMMENT '更新时间',
    tenant_code            varchar(20) default '' not null comment '租户编码',
    constraint uk_alarm_id unique (tenant_code, alarm_id)
) COMMENT '告警信息表';

CREATE TABLE a_alarm_definition
(
    alarm_definition_id        BIGINT                 NOT NULL PRIMARY KEY COMMENT '动态告警定义ID',
    range_id                   BIGINT                 NULL COMMENT '范围ID，对应ES的范围，如果为空就不看位置信息直接告警',
    cron_expression            VARCHAR(255)           NULL COMMENT 'Cron时间表达式，如果为空就不看时间信息直接告警',
    alarm_type                 VARCHAR(50)            NOT NULL COMMENT '告警类型',
    severity_id                INT                    NOT NULL COMMENT '告警等级',
    description                TEXT                   NULL COMMENT '动态告警定义描述',
    confirmable_person_type_id BIGINT                 NULL COMMENT '可以进行确认的人员类型ID',
    created_by                 BIGINT                 NULL COMMENT '创建者',
    create_time                datetime    DEFAULT NULL COMMENT '创建时间',
    updated_by                 BIGINT                 NULL COMMENT '更新者',
    update_time                datetime    DEFAULT NULL COMMENT '更新时间',
    tenant_code                varchar(20) default '' not null comment '租户编码',
    constraint uk_alarm_definition_id unique (tenant_code, alarm_definition_id)
) COMMENT '动态告警等级定义表';