package com.sabinghost19.openfeign_clientcaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class OpenfeignClientcallerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignClientcallerApplication.class, args);
    }

}