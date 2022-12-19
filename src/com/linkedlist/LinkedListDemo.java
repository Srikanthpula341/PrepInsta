package com.linkedlist;

public class LinkedListDemo {

    public static void main(String[] args) {
     
        LinkedList li = new LinkedList();
        li.insertAtHead(5);
        li.insertAtHead(10);
        li.insertAtHead(2);
        li.insertAtHead(12);
        li.insertAtHead(19);
        li.insertAtHead(20);
        
        System.out.println(li);
        System.out.println(li.lengthOfList());

    }

}
