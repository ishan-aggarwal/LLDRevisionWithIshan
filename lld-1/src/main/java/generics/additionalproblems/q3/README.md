# Generic Singly Linked List Implementation (Assignment)

## Problem Statement

Your task is to implement a generic singly linked list in Java, capable of storing data of any type. The class
`ListNode` has been provided, which represents the nodes of the linked list. You are required to complete the
implementation of the `LinkedList` class, which should include methods for adding elements to the list, displaying the
list contents, checking if the list is empty, and determining the size of the list.

## Instructions

1. Inside the `LinkedList` class, initialize the head node to null in the constructor. The head node will be used to
   keep track of the start of the list.
2. Implement the add method to `add` a new node with the specified data at the end of the list. This method should take
   the data to be added as a parameter and does not return anything.
3. Implement the `display` method to print the data of each node in the list, separated by spaces. Ensure that no
   additional spaces or newline characters are printed at the end of the output.
4. Implement the `isEmpty` method to return true if the list is empty (i.e., the head is null), otherwise false. This
   method does not take any parameters and returns a boolean value.
5. Implement the `size` method to return the number of nodes currently in the list. This method does not take any
   parameters and returns an integer value representing the size of the list.