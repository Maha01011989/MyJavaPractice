package com.qa.opencart.constants;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {

        String s = "pwwkew";
        ArrayList<String> arrL = new ArrayList<>();
        ArrayList<String> uniarrL = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        int max = 0;
        String longestString = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                arrL.add(s.substring(i, j));
            }
        }

        System.out.println(arrL);

        for (String a : arrL) {
            for (int i = 0; i < a.length(); i++) {
                set.add(a.charAt(i));
            }
            if (a.length() == set.size()) {
                uniarrL.add(a);
            }
            set.clear();
        }

        System.out.println(uniarrL);

        for (String a : uniarrL) {
            if (a.length() > max) {
                max = a.length();
                longestString = a;
            }
        }

        System.out.println(max);
        System.out.println(longestString);

    }
}
