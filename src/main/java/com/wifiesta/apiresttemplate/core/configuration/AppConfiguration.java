package com.wifiesta.apiresttemplate.core.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Application configuration class
 *
 * @author charz
 */

@EnableConfigurationProperties({CustomSetting.class})
public class AppConfiguration {

}

