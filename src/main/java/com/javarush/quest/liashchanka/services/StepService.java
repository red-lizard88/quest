package com.javarush.quest.liashchanka.services;


import java.util.List;

import static com.javarush.quest.liashchanka.data.StepsText.getStepsMap;

public class StepService {
    
    public static List<String> getStep(String step){
        List<String> localOneStap = null;
        for(var oneStep: getStepsMap().entrySet()){
            if(oneStep.getKey().equals(step)){
                localOneStap = oneStep.getValue();
            }
        }
        return localOneStap;
    }
}
