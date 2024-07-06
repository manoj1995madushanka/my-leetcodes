package com.example.mythinking.medium.longest_substring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSub {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();

        int start=0;
        int end=0;
        int max=0;

        while(start<s.length()){
            if(charSet.contains(s.charAt(start))){
                charSet.remove(s.charAt(end));
                end++;
            }else{
                charSet.add(s.charAt(start));
                start++;
                if (max<charSet.size()) {
                    max = charSet.size();
                }
            }
        }
        return max;
    }
}