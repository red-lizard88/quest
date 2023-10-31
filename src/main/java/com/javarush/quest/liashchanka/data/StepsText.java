package com.javarush.quest.liashchanka.data;

import com.javarush.quest.liashchanka.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepsText {
    static List<String> StepOneTrue = new ArrayList<>();
    static List<String> StepOneFalse = new ArrayList<>();
    static Map<String, List<String>> steps = new HashMap();

    public static List<String> setStepOneTrue(){
        StepOneTrue.add("Ты принял вызов. Поднимешься на мостик к капитану?");
        StepOneTrue.add("Подняться на мостик");
        StepOneTrue.add("Отказаться подниматься на мостик");
        return StepOneTrue;
    }

    public static List<String> setStepOneFalse(){
        StepOneFalse.add("Ты отклонил вызов. Поражение");
        StepOneFalse.add("");
        StepOneFalse.add("");
        return StepOneFalse;
    }
    public static void setStepsMap(){
        steps.put("step1-true", setStepOneTrue());
        steps.put("step1-false", setStepOneFalse());
    }
    public static Map<String, List<String>> getStepsMap(){
        return steps;
    }


}
