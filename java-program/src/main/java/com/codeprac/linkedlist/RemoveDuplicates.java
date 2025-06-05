package com.codeprac.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return val + (next != null ? " -> " + next.toString() : "");
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode newNode = removeDuplicateNodes(head);
        System.out.println(newNode);

    }

    private static ListNode removeDuplicateNodes(ListNode head) {
        if(head == null) return null;

        HashSet<Integer> seen = new HashSet<>();
        ListNode current = head;
        seen.add(head.val);

        while (current.next != null) {
            if (seen.contains(current.next.val)){
                current.next = current.next.next;
            } else {
                seen.add(current.next.val);
                current = current.next;
            }
        }
        return head;
    }
}
