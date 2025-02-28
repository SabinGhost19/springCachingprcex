package com.sabinghost19.aspect_practice.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sabinghost19.aspect_practice.models.Comment;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;


@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public Comment comment1(){
        return  new Comment("bUNa ce faci","Tudor");
    }

    @Bean
    public Comment comment2(){
        return  new Comment("negativ comment 2","MITRACHE");
    }
}
