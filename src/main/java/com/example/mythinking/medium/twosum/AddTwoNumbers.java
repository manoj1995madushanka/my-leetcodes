package com.example.mythinking.medium.twosum;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = new ListNode(0);
       ListNode head = result;
       int remaining =0;

       while(l1!=null && l2!=null){
          int total = l1.val+l2.val+remaining;
          result.next = new ListNode(total%10);
          remaining = total/10;
          result=result.next;
          l1 = l1.next;
          l2=l2.next;
       }

       while (l1!=null){
           int total = l1.val+remaining;
           result.next = new ListNode(total%10);
           remaining = total/10;
           result=result.next;
           l1 = l1.next;
       }

        while (l2!=null){
            int total = l2.val+remaining;
            result.next = new ListNode(total%10);
            remaining = total/10;
            result=result.next;
            l2 = l2.next;
        }

        if (remaining>0){
            result.next = new ListNode(remaining);
        }
       return head.next;
    }
}
