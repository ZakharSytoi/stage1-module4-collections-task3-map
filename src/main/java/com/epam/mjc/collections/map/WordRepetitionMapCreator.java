package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.replaceAll("\\.","");
        sentence = sentence.replaceAll(",","");

        HashMap<String, Integer> resultMap = new HashMap<>();
        if (sentence.equals("")) {
            return resultMap;
        }
        for (String i: sentence.split(" ")){
            if(!resultMap.containsKey(i.toLowerCase())){
                resultMap.put(i.toLowerCase(), (int)Stream.of(sentence.split(" ")).filter(element -> element.equalsIgnoreCase(i)).count());
            }
        }
        return resultMap;
    }
}
