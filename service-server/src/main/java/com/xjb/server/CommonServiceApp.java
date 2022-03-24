package com.xjb.server;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 辛集斌
 * @date 2022/3/24
 */
@EnableDubbo
@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml","classpath:dubbo-consumer.xml","classpath:dubbo-config.xml"})
@ComponentScan(basePackages = {"com.xjb"})
public class CommonServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(CommonServiceApp.class,args);
    }
}
