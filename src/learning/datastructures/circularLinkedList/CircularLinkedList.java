package learning.datastructures.circularLinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    // constructor
    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        if(first == null) return true;
        else return false;
    }

    public void insertFirst(int value){
        Node firstNode = new Node();
        firstNode.data = value;
        firstNode.next = first;
        if(first == null){
            last = firstNode;
        }
        first = firstNode;

    }

    public Node deleteFirst(){
        Node deletedNode = first;
        if(deletedNode == last){
            last = null;
        }
        first = first.next;
        return deletedNode;
    }


    public void insertLast(int value){
        Node newLastNode = new Node();
        newLastNode.data = value;
        if(last == null){
            first = newLastNode;
        }
        last.next = newLastNode;
        last = newLastNode;

    }

    public Node deleteLast(){
        Node deletedNode = first;
       if(first.next == null){
           first = null;
           last = null;
           return deletedNode;
       }

       while (deletedNode.next != last){
           deletedNode = deletedNode.next;
       }
       deletedNode.next = null;
       Node temp = last;
       last = deletedNode;

        return temp;
    }

    public void displayList(){
        Node displayNode = first;
        while (displayNode != null){
            System.out.print(displayNode.data + "  ");
            displayNode = displayNode.next;
        }
        System.out.println();
    }

}
