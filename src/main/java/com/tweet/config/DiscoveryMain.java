package com.tweet.config;

import com.thetransactioncompany.cors.CORSFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMain {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryMain.class, args);
    }

    @Bean
    public CORSFilter corsFilter(){
        return new CORSFilter();
    }

}