package com.arch.hex.system.inbound.rest.controller.actuator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.health.actuate.endpoint.HealthDescriptor;
import org.springframework.boot.health.actuate.endpoint.HealthEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ActuatorController {
    private final HealthEndpoint healthEndpoint;

    @GetMapping("/health")
    public HealthDescriptor health(){
        log.info("APP VERSION = 1.0.4");
        log.info("APP VERSION = 1.0.5");
        return healthEndpoint.health();
    }
}
