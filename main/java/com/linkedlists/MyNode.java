package com.linkedlists;

public class MyNode<K> {

    //Declaring key and next
    private K key;
    private MyNode next;


    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    //getting the get and set functions
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
