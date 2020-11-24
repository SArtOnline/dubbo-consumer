package com.gc.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.gc.serviceImpl")
@ComponentScan(value = {"com.gc.serviceImpl"})
public class DubboApplicationConfig {

    @Bean
    public ApplicationConfig getApplicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumerImpl");
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig getConsumerConfig() {
        return new ConsumerConfig();
    }

    @Bean
    public RegistryConfig getRegistryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setAddress("localhost");
        return registryConfig;
    }

}
