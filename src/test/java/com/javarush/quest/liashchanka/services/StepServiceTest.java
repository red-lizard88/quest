package com.javarush.quest.liashchanka.services;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StepServiceTest {

@Test
    void givenStaticMethodWithArgs () {
        try (MockedStatic<StepService> utilities =  Mockito.mockStatic(StepService.class)) {

            utilities.when(StepService::getStep).thenReturn("Ты принял вызов. Поднимешься на мостик к капитану?");


            assertEquals("Ты принял вызов. Поднимешься на мостик к капитану?", StepService.getStep());
        }
    }


}