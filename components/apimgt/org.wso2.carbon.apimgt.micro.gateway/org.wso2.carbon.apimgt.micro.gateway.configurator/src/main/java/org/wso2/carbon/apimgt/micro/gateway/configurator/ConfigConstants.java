/*
 * Copyright (c) 2017 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.micro.gateway.configurator;

/**
 * Config Constants
 */
public class ConfigConstants {

    public static final String CARBON_HOME = "carbon.home";

    public static final String REPOSITORY_DIR = "repository";
    public static final String CONF_DIR = "conf";
    public static final String RESOURCES_DIR = "resources";

    public static final String EMAIL = "email";
    public static final String TENANT_DOMAIN = "tenant.domain";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    public static final String CONFIGURE_LOCK_FILE_NAME = "configure.lck";
    public static final String CONFIG_TOOL_CONFIG_FILE_NAME = "gateway-config-tool.properties";
    public static final String CLOUD_CONFIG_FILE_NAME = "cloud-on-premise-gateway.properties";
    public static final String GATEWAY_CARBON_FILE_NAME = "carbon.xml";
    public static final int GATEWAY_DEFAULT_PORT = 9443;

    public static final String API_KEY_VALIDATION_CLIENT_TYPE = "api.key.validator.client.type";
    public static final String ANALYTICS_ENABLED = "analytics.enabled";
    public static final String PUBLIC_CLOUD_SETUP = "public.cloud.setup";

    public static final String STRATOS_PUBLIC_CLOUD_SETUP = "stratos.public.cloud.setup";

    public static final String FILE_DATA_PUBLISHER_CLASS = "file.data.publisher.class";
    public static final String DEFAULT_FILE_DATA_PUBLISHER_CLASS
            = "org.wso2.carbon.apimgt.onpremise.gateway.usage.publisher.APIMgtUsageFileDataPublisher";

    public static final String FILE_DATA_UPLOAD_TASK_ENABLED = "file.data.upload.task.enabled";
    public static final String FILE_DATA_UPLOAD_TASK_CLASS = "file.data.upload.task.class";
    public static final String DEFAULT_FILE_DATA_UPLOAD_TASK_CLASS
            = "org.wso2.carbon.apimgt.onpremise.gateway.usage.publisher.tasks.APIUsageFileUploadTask";
    public static final String FILE_DATA_UPLOAD_TASK_CRON = "file.data.upload.task.cron";

    public static final String FILE_DATA_CLEANUP_TASK_ENABLED = "file.data.cleanup.task.enabled";
    public static final String FILE_DATA_CLEANUP_TASK_CLASS = "file.data.cleanup.task.class";
    public static final String DEFAULT_FILE_DATA_CLEANUP_TASK_CLASS
            = "org.wso2.carbon.apimgt.onpremise.gateway.usage.publisher.tasks.APIUsageFileCleanupTask";
    public static final String FILE_DATA_CLEANUP_TASK_CRON = "file.data.cleanup.task.cron";
    public static final String FILE_DATA_RETENTION_DAYS = "file.data.retention.days";

    public static final String THROTTLING_SYNC_TASK_ENABLED = "throttling.synchronization.enabled";
    public static final String THROTTLING_SYNC_TASK_CLASS = "throttling.synchronization.class";
    public static final String DEFAULT_THROTTLING_SYNC_TASK_CLASS
            = "org.wso2.carbon.apimgt.onpremise.gateway.throttling.tasks.ThrottlingSyncTask";
    public static final String THROTTLING_SYNC_TASK_CRON = "throttling.synchronization.cron";
    public static final String API_UPDATE_TASK_ENABLED = "api.update.task.enabled";
    public static final String API_UPDATE_TASK_CLASS = "api.update.task.class";
    public static final String DEFAULT_API_UPDATE_TASK_CLASS
            = "org.wso2.carbon.apimgt.onpremise.gateway.api.synchronizer.tasks.APISynchronizationTask";
    public static final String API_UPDATE_TASK_CRON = "api.update.task.cron";
    public static final String DELIMITER = ":";
    public static final String INITIALIZATION_API_URL = "initialization.api.url";
    public static final String DEFAULT_MAC_ADDRESS = "00:00:00:00:00";
    public static final String UNIQUE_IDENTIFIER_HOLDER = "$token";
}
