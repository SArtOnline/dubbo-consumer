package com.gc;

import com.gc.config.DubboApplicationConfig;
import com.gc.serviceImpl.ConsumerImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConsumer {

    public static void main(String []args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboApplicationConfig.class);
        context.start();

        ConsumerImpl consumer = context.getBean(ConsumerImpl.class);
        consumer.print();

    }
}
