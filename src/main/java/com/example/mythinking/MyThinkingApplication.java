package com.example.mythinking;

import com.example.mythinking.medium.twosum.ListNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.mythinking.medium.longest_substring.LongestSub.lengthOfLongestSubstring;
import static com.example.mythinking.medium.twosum.AddTwoNumbers.addTwoNumbers;

@SpringBootApplication
public class MyThinkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyThinkingApplication.class, args);

        /*ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));

        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));

        addTwoNumbers(l1,l2);*/


        int res=lengthOfLongestSubstring("abcabcbb");
        System.out.println("result -> " +res);
    }

}
