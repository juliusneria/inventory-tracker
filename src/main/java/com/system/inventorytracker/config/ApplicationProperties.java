package com.system.inventorytracker.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class ApplicationProperties {

    private String driverClassName;
    private String maxActive;
    private String maxIdle;
    private String minIdle;
    private String initialSize;
    private String removeAbandoned;
    private String url;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(String maxActive) {
        this.maxActive = maxActive;
    }

    public String getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(String maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(String minIdle) {
        this.minIdle = minIdle;
    }

    public String getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }

    public String getRemoveAbandoned() {
        return removeAbandoned;
    }

    public void setRemoveAbandoned(String removeAbandoned) {
        this.removeAbandoned = removeAbandoned;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Datasource {" +
                "driverClassName='" + driverClassName + '\'' + ", "+
                "maxActive='" + maxActive + '\'' + ", "+
                "maxIdle='" + maxIdle + '\'' + ", "+
                "minIdle='" + minIdle + '\'' + ", "+
                "initialSize='" + initialSize + '\'' + ", "+
                "removeAbandoned='" + removeAbandoned + '\'' + ", "+
                "url='" + url + '\'' +
                '}';
    }
}
