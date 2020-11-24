package com.gc;

import com.gc.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConsumerZK {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF.spring/consumerZK.xml");
        context.start();

        ProviderService providerService = (ProviderService) context.getBean("providerService");
        providerService.print("refer successfully.");
    }
}
