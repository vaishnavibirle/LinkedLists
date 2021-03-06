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
    //Append the node to the last
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
    //Insert the node in between the nodes
    @Test
    public void given3NumbersWhenInsertingInBetweenShouldPassLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        //create linked list
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        //inserting nodes
        myLinkedLists.add(myFirstNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.insert(myFirstNode,myThirdNode);

        boolean result = myLinkedLists.head.equals(myFirstNode) && myLinkedLists.head.equals(mySecondNode) && myLinkedLists.tail.equals(myThirdNode);
        Assertions.assertTrue(result);

    }
    //UC5 Deleting First Element
    @Test
    public void given3Numbers_deleteFirstElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.deleteElement();
        boolean result = myLinkedLists.head.equals(mySecondNode);
        Assertions.assertEquals(true, result);
    }

    //Deleting last element
    @Test
    public void given3Numbers_deleteLastElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.deleteLastElement();
        INode result = myLinkedLists.deleteLastElement();
        Assertions.assertEquals(mySecondNode, result);
    }

    // Searching for a specific Node in the List
    public void given3Numbers_searchSpecificNode() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        INode result = myLinkedLists.searchNode(mySecondNode);
        Assertions.assertEquals(mySecondNode, result);
    }

    //Searching for a specific Node and Inserting new node after that
    @Test
    public void givenNumbers_searchforSpecificNode_InsertNewElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myFourthNode);
        myLinkedLists.searchNode(mySecondNode);
        myLinkedLists.searchNodeAndInsert(mySecondNode, myThirdNode);
        boolean result = myLinkedLists.head.equals(myFirstNode) && myLinkedLists.head.getNext().equals(mySecondNode)
                && myLinkedLists.head.getNext().getNext().equals(myThirdNode) &&
                myLinkedLists.tail.equals(myFourthNode);
        Assertions.assertEquals(true, result);
    }

    //Searching for a specific Node, deleting it and print list size
    @Test
    public void givenNumbers_searchAndDeleteSpecificNode_PrintListSize() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.append(myFourthNode);
        INode node = myLinkedLists.deleteNodeInBetween(myThirdNode);
        int size = myLinkedLists.myListSize();
        Assertions.assertEquals(3, size);
    }

    //Creating Ordered Linked List
    @Test
    public void givenNumbers_GetSortedList() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.add(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.append(myFourthNode);
        System.out.println("List before sorting: ");
        myLinkedLists.printMyNode();
        myLinkedLists.sortList();
        System.out.println("List after sorting: ");
        myLinkedLists.printMyNode();
        boolean result = myLinkedLists.head.equals(myFirstNode) && myFirstNode.getNext().equals(mySecondNode)
                && mySecondNode.getNext().equals(myThirdNode) && myLinkedLists.tail.equals(myFourthNode);
        Assertions.assertEquals(true, result);
    }
}

