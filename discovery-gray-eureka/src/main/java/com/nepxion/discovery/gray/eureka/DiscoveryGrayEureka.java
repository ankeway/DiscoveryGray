package com.nepxion.discovery.gray.eureka;

import org.springframework.boot.SpringApplication;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryGrayEureka {
    public static void main(String[] args) {
		SpringApplication.run(DiscoveryGrayEureka.class, args);
    }

}