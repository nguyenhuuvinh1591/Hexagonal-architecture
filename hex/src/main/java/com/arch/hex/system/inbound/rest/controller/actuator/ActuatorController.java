package com.arch.hex.system.inbound.rest.controller.actuator;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.health.actuate.endpoint.HealthDescriptor;
import org.springframework.boot.health.actuate.endpoint.HealthEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ActuatorController {
    private final HealthEndpoint healthEndpoint;

    @GetMapping("/health")
    public HealthDescriptor health(){
        return healthEndpoint.health();
    }
}
