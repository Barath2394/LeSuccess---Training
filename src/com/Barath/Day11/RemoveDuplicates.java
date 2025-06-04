package com.Barath.Day11;

public class RemoveDuplicates {
    Node head;
    public void removeDuplicatesFromList() {
        Node ptr = head;
        while (ptr != null && ptr.next != null) {
            if (ptr.val == ptr.next.val) {
                ptr.next = ptr.next.next;
            }
            else {
                ptr = ptr.next;
            }
        }

    }
    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }
        else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }
    public void traverse() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val +"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.print("List Before removing the duplicate : ");
        list.traverse();
        list.removeDuplicatesFromList();
        System.out.println();
        System.out.print("After Before removing the duplicate : ");
        list.traverse();
    }
}
