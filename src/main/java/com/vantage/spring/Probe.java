package com.vantage.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.logging.Logger;

public class Probe implements ApplicationListener<ApplicationEvent> {

    private static final Logger log = Logger.getLogger(Probe.class.getName());

    public void onApplicationEvent(ApplicationEvent event) {
        log.info("Event triggered: " + event);
    }

}
