package org.neoteric.java;

public class LLTest {

        public static void main(String[] args) {
            CustomLL list = new CustomLL();

            list.add(10);
            list.add(20);
            list.add(30);

            System.out.println("Linked List:");
            list.printList();

            System.out.println("Removing 20:");
            list.remove(30);

            System.out.println("Linked List after removal:");
            list.printList();
        }
    }



