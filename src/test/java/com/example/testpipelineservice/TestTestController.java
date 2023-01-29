package com.example.testpipelineservice;

import com.example.testpipelineservice.controller.TestController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestTestController {

    @InjectMocks
    TestController testController;

    @Test
    void sampleTest() {
        testController.test();
    }

}
