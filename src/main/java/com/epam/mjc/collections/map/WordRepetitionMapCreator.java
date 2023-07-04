package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String [] sentenceList = sentence.replaceAll(",", "")
                .replaceAll("\\.", "")
                .toLowerCase()
                .split(" ");

        Map <String,Integer> map = new HashMap<>();
        for (String s : sentenceList) {
            int count = 1;
            if (s.isEmpty()){
                break;
            } else if (!map.containsKey(s)){
                map.put(s, count);
            } else {
                map.put(s, ++count);
            }
        }
        return map;
    }
}
