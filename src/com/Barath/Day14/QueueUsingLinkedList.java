package com.Barath.Day14;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList {
    Node front = null, rear = null;
    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(front.val + " dequeued");
        front = front.next;
        if (front == null) rear = null;
    }
    public void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedList q = new LinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.display();
    }
}
