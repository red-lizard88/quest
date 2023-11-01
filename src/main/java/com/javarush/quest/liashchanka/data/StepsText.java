package com.javarush.quest.liashchanka.data;

import com.javarush.quest.liashchanka.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepsText {


    public static HashMap<String, List<String>> getStepsMap(){
         List<String> StepOneTrue = new ArrayList<>();
         List<String> StepOneFalse = new ArrayList<>();
         HashMap<String, List<String>> steps = new HashMap();

        List<String> StepTwoTrue = new ArrayList<>();
        List<String> StepTwoFalse = new ArrayList<>();

        StepOneTrue.add("Ты принял вызов. Поднимешься на мостик к капитану?");
        StepOneTrue.add("Подняться на мостик");
        StepOneTrue.add("Отказаться подниматься на мостик");

        StepOneFalse.add("Ты отклонил вызов. Поражение");
        StepOneFalse.add("");
        StepOneFalse.add("");

        steps.put("step1-true", StepOneTrue);
        steps.put("step1-false", StepOneFalse);

        StepTwoTrue.add("Ты поднялся на мостик. Ты кто?");
        StepTwoTrue.add("Рассказать о правду о себе");
        StepTwoTrue.add("Солгать о себе");

        StepTwoFalse.add("Ты не пошел на переговоры. Поражение");
        StepTwoFalse.add("");
        StepTwoFalse.add("");

        steps.put("step2-true", StepTwoTrue);
        steps.put("step2-false", StepTwoFalse);

        return steps;
    }


}
