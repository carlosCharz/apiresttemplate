package com.wifiesta.apiresttemplate.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.wifiesta.apiresttemplate.core.configuration.ProjectBanner;

/**
 * Entry Point class
 *
 * https://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html
 *
 * @author charz
 */

@SpringBootApplication
public class EntryPoint extends SpringBootServletInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(EntryPoint.class);
    private static final String CATALINA_HOME = System.getProperty("catalina.home");

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        LOG.info("Catalina home OS variable: {}", CATALINA_HOME);
        return application.sources(EntryPoint.class).banner(new ProjectBanner());
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EntryPoint.class).sources(EntryPoint.class).run(args);
    }

}
