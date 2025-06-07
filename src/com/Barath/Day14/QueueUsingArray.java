package com.Barath.Day14;

public class QueueUsingArray {
    private static int SIZE = 100;
    int[] queue = new int[SIZE];
    int front = -1;
    int rear = -1;
    public void enqueue(int val) {
        if (rear == SIZE - 1) {
            System.out.println("Queue is FULL");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = val;
        System.out.println(val + " is enqueued");
    }
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is EMPTY");
            return;
        }
        int popVal = queue[front];
        front++;
        System.out.println("Dequeue Value : " + popVal);
    }
    public void display() {
        if (front == - 1 || front > rear) {
            System.out.println("Queue is EMPTY");
            return;
        }
        System.out.print("Queue : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
    }
}
