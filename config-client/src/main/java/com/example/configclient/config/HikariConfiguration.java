package com.example.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.util.NumberUtils;

@Component
@RefreshScope
@ConfigurationProperties("hikari.config")
public class HikariConfiguration {
    private long connectionTimeout = -1;
    private int minimumIdle = -1;
    private int maximumPoolSize = -1;
    private int maxLifetime = -1;

    private int validationTimeout = -1;
    private int idleTimeout = -1;

    public int getMinimumIdle() {
        return minimumIdle;
    }

    public void setMinimumIdle(int minimumIdle) {
        this.minimumIdle = minimumIdle;
    }

    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public int getMaxLifetime() {
        return maxLifetime;
    }

    public void setMaxLifetime(int maxLifetime) {
        this.maxLifetime = maxLifetime;
    }

    public long getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getValidationTimeout() {
        return validationTimeout;
    }

    public void setValidationTimeout(int validationTimeout) {
        this.validationTimeout = validationTimeout;
    }

    public int getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    @Override
    public String toString() {
        return "HikariConfiguration{" +
                "connectionTimeout=" + connectionTimeout +
                ", minimumIdle=" + minimumIdle +
                ", maximumPoolSize=" + maximumPoolSize +
                ", maxLifetime=" + maxLifetime +
                ", validationTimeout=" + validationTimeout +
                ", idleTimeout=" + idleTimeout +
                '}';
    }
}
