package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> swapMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (!swapMap.containsKey(entry.getValue())){
                swapMap.put(entry.getValue(), entry.getKey());
            }else {
                if (entry.getKey() < swapMap.get(entry.getValue())) swapMap.replace(entry.getValue(), entry.getKey());
            }
        }
        return swapMap;
    }
}
