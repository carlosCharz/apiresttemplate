package com.wifiesta.apiresttemplate.core.configuration;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Custom variables loaded from a property file
 *
 * @author charz
 */

@Component
@ConfigurationProperties(prefix = "custom")
public class CustomSettings {

    private static final Logger LOG = LoggerFactory.getLogger(CustomSettings.class);

    private String serverUrl;

    private Long serverPort;

    private Boolean debuggable;

    private String imageQuality;

    private Boolean enableSwagger;

    public CustomSettings() {
        LOG.info("Loading custom properties");
    }

    @PostConstruct
    public void postConstruct() {
        LOG.info(
                "Custom properties -> serverUrl: '{}', serverPort: '{}', debuggable: '{}', enableSwagger: '{}', imageQuality: '{}'",
                serverUrl, serverPort, debuggable, imageQuality, enableSwagger);
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public Long getServerPort() {
        return serverPort;
    }

    public void setServerPort(Long serverPort) {
        this.serverPort = serverPort;
    }

    public Boolean getDebuggable() {
        return debuggable;
    }

    public void setDebuggable(Boolean debuggable) {
        this.debuggable = debuggable;
    }

    public String getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(String imageQuality) {
        this.imageQuality = imageQuality;
    }

    public Boolean getEnableSwagger() {
        return enableSwagger;
    }

    public void setEnableSwagger(Boolean enableSwagger) {
        this.enableSwagger = enableSwagger;
    }

    @Override
    public String toString() {
        return "[serverUrl=" + serverUrl + ", serverPort=" + serverPort + ", debuggable=" + debuggable
                + ", imageQuality=" + imageQuality + ", enableSwagger=" + enableSwagger + "]";
    }

}
