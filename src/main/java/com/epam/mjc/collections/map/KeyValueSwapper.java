package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> result = new HashMap<>();
        for(Integer i:  sourceMap.keySet()){
            if(result.containsKey(sourceMap.get(i))){
                result.put(sourceMap.get(i), result.get(sourceMap.get(i)).compareTo(i) > 0 ? i: result.get(sourceMap.get(i)));
            }
            else result.put(sourceMap.get(i), i);
        }
    return result;
    }
}
