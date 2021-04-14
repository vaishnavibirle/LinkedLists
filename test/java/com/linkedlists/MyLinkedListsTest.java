package com.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListsTest {

    //Creating 3 numbers 
    @Test
    public void given3NumbersWhenLinkedShouldPassMyLinkedListsTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        //create a linked list
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        //adding nodes to linked list
        myLinkedLists.add(myFirstNode);
        myLinkedLists.add(mySecondNode);
        myLinkedLists.add(myThirdNode);
        /*for printing
        myLinkedLists.printMyNodes();*/

        boolean result = myLinkedLists.head.equals(myThirdNode) && myLinkedLists.head.getNext().equals(mySecondNode) && myLinkedLists.tail.equals(myFirstNode);
        Assertions.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAppendedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        //create linked list
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        //adding nodes using append method
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);

        boolean result = myLinkedLists.head.equals(myFirstNode) && myLinkedLists.head.getNext().equals(mySecondNode) && myLinkedLists.tail.equals(myThirdNode);
        Assertions.assertTrue(result);


    }
}
