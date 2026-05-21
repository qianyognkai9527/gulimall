package com.joker.gulimall.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GulimallGatewayApp.class, args);
    }
}
