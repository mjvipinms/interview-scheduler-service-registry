package com.ibs.interview_scheduler_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InterviewSchedulerServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewSchedulerServiceRegistryApplication.class, args);

	}

}
