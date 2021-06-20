package learning.datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    // constructor
    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int value){
        //Create a new node.. which will hold this value
        Node insertFirstNode = new Node();
        insertFirstNode.data = value;

        if (isEmpty()){
            last = insertFirstNode;
        } else {
            first.previous = insertFirstNode;
        }
        insertFirstNode.next = first;
        this.first = insertFirstNode;

    }

    public void insertLast(int value) {
        //Create a new node.. which will hold this value
        Node insertLastNode = new Node();
        insertLastNode.data = value;

        if (isEmpty()){
            first = insertLastNode;
        } else{
            last.next = insertLastNode;
        }

        insertLastNode.previous = last;
        this.last = insertLastNode;
    }

    public Node deleteFirst(){
        Node deletedNode = first;

        if(isEmpty()) return deletedNode;

        if(first.next == null){
            last = null;
        }else {
            first.next.previous = null;
        }

        first = first.next;
        return deletedNode;
    }

    public Node deleteLast() {
        Node deletedNode = first;

        if(isEmpty()) return deletedNode;

        if(last.previous == null){
            first = null;
        }else {
            last.previous.next = null;
        }

        last = last.previous;
        return deletedNode;

    }

    public boolean insertAfter(int key, int data){
        Node current = first;

        while(current.data != key){
            current = current.next;
            if(current == null) {
                return false;
            }
        }

        Node theNodeToBeInserted = new Node();
        theNodeToBeInserted.data = data;

        if (current == last){
            last = theNodeToBeInserted;
        }else{
            theNodeToBeInserted.next = current.next;
            current.next.previous = theNodeToBeInserted;
        }

        theNodeToBeInserted.previous = current;
        current.next = theNodeToBeInserted;

        return true;
    }

    public Node deleteKey(int key) {
        Node current = first;

        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if(current == first){
            first = current.next;
        } else{
            current.previous.next = current.next;
        }
        if (current == last){
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        return current;
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
