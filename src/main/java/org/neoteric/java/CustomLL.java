package org.neoteric.java;

public class CustomLL {

        private Node head;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
               // System.out.println(head);
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void remove(int data) {

            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.data == data) {
                head = head.next;
                return;
            }

            Node curret=head.next;
            Node prev=head;
            while (curret.next!=null){
                if(curret.data==data){
                    prev.next=curret.next;
                    return;
                }
                prev=curret;
                curret=curret.next;
            }
            if(curret.next==null){
                prev.next=null;
            }

        }

        public void printList() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }


