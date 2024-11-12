package com.cgi.appTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Execution(ExecutionMode.CONCURRENT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TrialTest {

        private final String obj = "";



        // execution maybe 13, 14, 16, 15 or 13, 16, 14, 15
        @Test
        @Order(1)
        void assertTest13() {
            assertNotNull(obj);
        }

        @Test
        @Order(2)
        void assertTest14() {
            assertNotNull(obj);
        }

        @Test
        @Order(3)
        void assertTest15() {
            assertNotNull(obj);
        }

        @Test
        @Order(2)
        void assertTest16() {
            assertNotNull(obj);
        }


    }