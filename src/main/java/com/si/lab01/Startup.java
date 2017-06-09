package com.si.lab01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("/META-INF/spring/si-components.xml");
//        while (true) {}

//        MessageChannel channel = context.getBean("messageChannel", MessageChannel.class);
//
//        Message<String> message1 = MessageBuilder.withPayload("First message").build();
//        Message<String> message2 = MessageBuilder.withPayload("Second message").build();
//        Message<String> message3 = MessageBuilder.withPayload("Third message").build();
//
//        System.out.println("Sending message1");
//        channel.send(message1);
//        System.out.println("Sending message2");
//        channel.send(message2);
//        System.out.println("Sending message3");
//        channel.send(message3);
//        System.out.println("Done sending messages");
    }
}
