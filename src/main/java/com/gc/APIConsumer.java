package com.gc;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.gc.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APIConsumer {
    public static void main(String[] args) {
        // 声明当前应用
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setOwner("zgc");
        applicationConfig.setName("apiConsumer");

        // 连接注册中心
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:2181");

        // 引用配置
        ReferenceConfig<ProviderService> referenceConfig = new ReferenceConfig<ProviderService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(ProviderService.class);

        // 发现服务
        ProviderService providerService = referenceConfig.get();
        providerService.print("refer successfully.");
    }
}
