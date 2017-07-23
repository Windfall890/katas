package com.jsaop.katas;

public class Stack {

    public static final int STARTING_CAPACITY = 10;
    private int size;
    private int capacity;
    private int[] values;

    public Stack() {
        capacity = STARTING_CAPACITY;
        values = new int[capacity];
    }

    public boolean isEmpty() {
        return size() < 1;
    }

    public int size() {
        return size;
    }


    public void push( int n) {
        if(size >= capacity) {
            doubleSize();
        }
        values[size++] = n;
    }

    private void doubleSize() {
        capacity*=2;
        int[] temp = values;
        values = new int[capacity];
        for (int i = 0; i < temp.length; i++) {
            values[i] = temp[i];
        }
    }

    public int pop() {

        if (isEmpty()) throw new IllegalStateException("underflow");

        return values[--size];
    }
}
