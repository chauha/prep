package com.coderust;




public class LinkedListReverse {

    public static Node reverseList(Node head){
        Node temp=null;
        Node prev=null;

        while (head != null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }

   public static void main(String [] args){
       Node n1= new Node(10);
       Node n2= new Node(20);
       Node n3= new Node(30);
       n1.next = n2;
       n2.next=n3;
       Node result= reverseList(n1);

       while (result != null){
           System.out.println(result.data);
           result=result.next;
       }

   }


    private static class Node {
        int data;
        Node next;
        public  Node(int data){
            this.data=data;

        }


    }


}
