package com.example.testpipelineservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageTest {

    @Test
    void testName() {
        Message message = new Message();
        Assertions.assertEquals("Hello Jean!", message.getMessage("Jean"));
    }
}
