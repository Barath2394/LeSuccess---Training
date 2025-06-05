package com.Barath.Day12;

import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }
        else {
            Node pre = null;
            Node current = head;
            while (current.next != null) {
                pre = current;
                current = current.next;
            }
            current.next = newNode;
            current.pre = pre;
        }
    }
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    void insertInMiddle(int val) {
        Node newNode = new Node(val);
        Node pre = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = newNode;
        newNode.pre = pre;
    }
    void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }
    void deleteAtEnd() {
        Node pre = null;
        Node current = head;
        while (current.next != null) {
            pre = current;
            current = current.next;
        }
        pre = current.next;
    }
    void deleteMiddleNode() {
        Node pre = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = slow.next;
        slow.next.pre = pre;
    }
    void displayForward() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of list to created : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter list " + (i+1) +":");
            int no = sc.nextInt();
            list.insertAtEnd(no);
        }
        list.displayForward();
        list.deleteMiddleNode();
        list.displayForward();
    }
}
