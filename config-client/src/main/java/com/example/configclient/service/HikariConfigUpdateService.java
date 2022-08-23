package com.example.configclient.service;

import com.example.configclient.config.HikariConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
public class HikariConfigUpdateService {

    @Autowired
    private HikariConfiguration hikariConfiguration;

    public void changeConfigurations() {
        System.out.println(hikariConfiguration.toString());
        if(isNotDefaultValue(hikariConfiguration.getConnectionTimeout())) {
            System.out.println("Setting ConnectionTimeout");
        }

        if(isNotDefaultValue(hikariConfiguration.getIdleTimeout())) {
            System.out.println("Setting IdleTimeout");
        } else {
            System.out.println("NOT Setting IdleTimeout");
        }

    }

    private boolean isNotDefaultValue(Number number) {
       return  (number.longValue() != -1);
    }
}
