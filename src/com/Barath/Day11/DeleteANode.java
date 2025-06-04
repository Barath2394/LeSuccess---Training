package com.Barath.Day11;

public class DeleteANode {
    Node head;
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
    public void deleteNode(int val) {
        Node pre = null;
        Node current = head;
        while (current != null && current.val != val) {
            pre = current;
            current = current.next;
        }
        if (current != null) {
            pre.next = current.next;
        }
        else {
            System.out.println("Val " + val + " is not found in the list");
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
        DeleteANode list = new DeleteANode();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print("List Before deleting a node : ");
        list.traverse();
        list.deleteNode(3);
        System.out.println();
        System.out.print("List After deleting a node : ");
        list.traverse();
    }
}
