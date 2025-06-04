package com.Barath.Day11;

class MergeKLists {
    Node head;
    public Node mergeKLists(Node[] lists) {
        if (lists.length == 0) return null;
        if (lists.length < 2) return lists[0];
        Node returnNode = mergeTwoList(lists[0] , lists[1]);
        for (int i = 2; i < lists.length; i++) {
            returnNode = mergeTwoList(returnNode , lists[i]);
        }
        return returnNode;
    }
    static Node mergeTwoList(Node list1,Node list2) {
        Node dummy = new Node(-1);
        Node returnNode = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                returnNode.next = list1;
                list1 = list1.next;
            }
            else {
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }
        if (list1 != null) {
            returnNode.next = list1;
        }
        if (list2 != null) {
            returnNode.next = list2;
        }
        return dummy.next;
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
}

