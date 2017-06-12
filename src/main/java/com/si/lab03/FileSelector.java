package com.si.lab03;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.io.File;

public class FileSelector implements MessageSelector {
    public boolean accept(Message<?> message) {
        return message.getPayload().getClass() == File.class
               && !((File) message.getPayload()).getName().startsWith("msg");
    }
}
