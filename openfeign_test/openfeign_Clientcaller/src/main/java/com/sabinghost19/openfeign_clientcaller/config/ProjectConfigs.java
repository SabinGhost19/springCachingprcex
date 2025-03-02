package com.sabinghost19.openfeign_clientcaller.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.sabinghost19.openfeign_clientcaller.proxy")
public class ProjectConfigs {
}
