package basic;

import java.util.Arrays;
import java.util.Scanner;

public class LInkedListAdd {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void addPosition(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        for(int i = 1; i<(position-1); i++){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    public void printData(){
        if(head == null){
            System.out.println("This is Empty");
        }
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+ "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        LInkedListAdd test = new LInkedListAdd();
        test.addFirst(5);
        test.addFirst(6);
        test.printData();
        test.addLast(8);
        test.printData();
        test.addPosition(3,2);
        test.printData();

    }
}
