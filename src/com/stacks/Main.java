package com.stacks;

class Stack {
    static int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }
    boolean isFull() {
        return (top<MAX-1);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Overflow condition reached");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Underflow condition reached");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Underflow condition");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Stack stk = new Stack();
//        stk.push(20);
//        stk.push(40);
//        stk.push(60);
        for(int i=1;i<10;i++) {
            stk.push(i);
            System.out.println(stk.isFull());
        }
        for(int i=0;i<9;i++) {
           // stk.pop();
            System.out.println(stk.pop());
        }
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        // System.out.println(stk.pop());
    }
}