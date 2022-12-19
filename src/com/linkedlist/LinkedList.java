package com.linkedlist;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextnode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString() {
        String res = "{";
        Node current = this.head;

        while (current != null) {
            res += current.toString() + "  ";
            current = current.getNextnode();
        }
        res += "}";
        return res;
    }

    public int lengthOfList() {
      

        int ans = 0;
        Node current = this.head;

        while (current != null) {
            ans++;
            current = current.getNextnode();
        }
        System.out.println();
       // System.out.println("Length of list:"+ans);
        return ans;
    }

}