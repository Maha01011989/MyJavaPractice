package com.qa.opencart.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {

        String s = "pwwkew";

        HashMap<String, Integer> uniqueSubString = new HashMap<>();

        HashMap<String, Integer> nonRepCharSubString = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                uniqueSubString.put(s.substring(i, j), s.substring(i, j).length());
            }
        }
        System.out.println(uniqueSubString);

        System.out.println(Collections.max(uniqueSubString.values()));

        for (String a : uniqueSubString.keySet()) {
            boolean isDupPresent = false;
            for (int i = 0; i < a.length(); i++) {
                for (int j = i + 1; j < a.length(); j++) {
                    if (a.charAt(i) == a.charAt(j)) {
                        isDupPresent = true;
                    }
                }
            }
            if (!isDupPresent)
                nonRepCharSubString.put(a, a.length());
        }

        System.out.println(nonRepCharSubString);

        System.out.println(Collections.max(nonRepCharSubString.values()));

        for (Map.Entry<String, Integer> entry :
                nonRepCharSubString.entrySet()) {

            if (entry.getValue() == Collections.max(nonRepCharSubString.values())) {

                // Print the key with max value
                System.out.println(entry.getKey());
            }


        }

    }
}
