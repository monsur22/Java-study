package basic;

public class LinkedListDelete {
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
        newNode.next = head;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode = head;
        }
        Node currNode  = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void addPosition(int data,int position){
        Node newNode = new Node(data);
        Node currNode = head;
        for (int i = 1; i<position-1;i++){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    public void printData(){
        if(head == null){
            System.out.println("List is empty:");
        }
        Node currNode = head;
        while (currNode!= null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next =null;
    }
    public static void main(String[] args) {
        LinkedListDelete test = new LinkedListDelete();
        test.addFirst(5);
        test.addFirst(6);
        test.printData();
        test.addLast(8);
        test.printData();
        test.addPosition(9,2);
        test.printData();
        test.deleteFirst();
        test.printData();
        test.deleteLast();
        test.printData();
    }
}
