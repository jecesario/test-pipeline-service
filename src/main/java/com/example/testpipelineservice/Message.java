package com.example.testpipelineservice;

import org.springframework.util.ObjectUtils;

public class Message {

    public String getMessage(String name) {
        StringBuilder s = new StringBuilder();
        if(ObjectUtils.isEmpty(name)) {
            s = s.append("Please provide a name");
        } else {
            s.append("Hello ").append(name).append("!");
        }
        return s.toString();
    }
}
