package com.gc.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gc.service.ProviderService;
import org.springframework.stereotype.Component;

@Component("annotationConsumer")
public class ConsumerImpl {

    @Reference
    private ProviderService providerService;

    public void print() {
        providerService.print("consumer 1");
    }
}
