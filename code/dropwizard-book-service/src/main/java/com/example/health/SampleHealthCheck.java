package com.example.health;

import com.codahale.metrics.health.HealthCheck;

public class SampleHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
    	// health check condition...
        return Result.healthy();
    }
}
