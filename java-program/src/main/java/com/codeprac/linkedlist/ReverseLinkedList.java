package com.codeprac.linkedlist;

public class ReverseLinkedList {

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

    public static ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newNode = null;

        while (head != null){
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return newNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newHead = reverseLinkedList(head);
        System.out.println(newHead);
    }
}
