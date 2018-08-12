package com.personality.mbti;

import java.util.HashMap;

public class ApplicationSessionStorage {

    public static HashMap<String, Integer> ApplicationData = new HashMap<String, Integer>();
    public static void SetSessionData(String Key,Integer Value){
        ApplicationData.put(Key,Value);
    }

    public static Integer GetSessionData(String Key){
        if(ApplicationData.containsKey(Key)) {
            return ApplicationData.get(Key);
        }
        return -1;
    }
}