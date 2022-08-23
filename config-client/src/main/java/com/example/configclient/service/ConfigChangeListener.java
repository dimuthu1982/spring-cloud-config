package com.example.configclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ConfigChangeListener {
    @Autowired
    private HikariConfigUpdateService hikariConfigUpdateService;

    @EventListener({ContextStartedEvent.class, RefreshRemoteApplicationEvent.class})
    public void onEvent1(RefreshRemoteApplicationEvent event) {
        System.out.println("\n %%%%%%%%%%%%%%% @EventListener({RefreshRemoteApplicationEvent.class})");
        System.out.println("e.getDestinationService():" + event.getDestinationService());
        System.out.println("e.getOriginService():" + event.getOriginService());
        System.out.println("e.getId():" + event.getId());
        System.out.println("e.getSource():" + event.getSource());
        hikariConfigUpdateService.changeConfigurations();
        System.out.println(" @EventListener({RefreshRemoteApplicationEvent.class}) %%%%%%%%%%%%%%%");
    }

}
