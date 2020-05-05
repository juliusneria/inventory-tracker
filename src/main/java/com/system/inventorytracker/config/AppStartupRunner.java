package com.system.inventorytracker.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {
    final static Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @Autowired
    private final ApplicationProperties applicationProperties;

    public AppStartupRunner(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("spring: {}", applicationProperties.toString());
    }
}
