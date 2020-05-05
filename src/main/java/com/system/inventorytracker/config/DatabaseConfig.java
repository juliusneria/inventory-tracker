package com.system.inventorytracker.config;

import com.zaxxer.hikari.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    final static Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);

    @Autowired
    private final ApplicationProperties applicationProperties;

    public DatabaseConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean
    public DataSource dataSource() {
        logger.info("URL: {}", applicationProperties.getUrl());
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(applicationProperties.getUrl());
        return new HikariDataSource(config);
    }
}
