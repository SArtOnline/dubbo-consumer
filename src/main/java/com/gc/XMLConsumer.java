package com.gc;

import com.gc.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF.spring/consumer.xml");
        context.start();

        ProviderService providerService = (ProviderService) context.getBean("providerService");
        providerService.print("refer successfully.");
    }
}
