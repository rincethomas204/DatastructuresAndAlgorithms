package learning.datastructures.singlylinkedlists;

public class SinglyLinkedList {
    private Node first;

    // constructor
    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        if(first == null) return true;
        else return false;
    }

    public void insertFirst(int value){
        Node firstNode = new Node();
        firstNode.data = value;
        firstNode.next = first;
        first = firstNode;

    }

    public Node deleteFirst(){
        Node deletedNode = first;
        first = first.next;
        return deletedNode;
    }


    public void insertLast(int value){
        Node newLastNode = new Node();
        newLastNode.data = value;
        Node currentlastNode = first;
        while (currentlastNode.next != null)
            currentlastNode = currentlastNode.next;
        currentlastNode.next = newLastNode;

    }

    public Node deleteLast(){
        Node deletedNode = new Node();
        Node currentlastNode = first;

        if(currentlastNode.next == null){
            deletedNode = currentlastNode;
            first = null;
            return deletedNode;
        }

        while (currentlastNode.next.next != null)
            currentlastNode = currentlastNode.next;

        deletedNode = currentlastNode.next;
        currentlastNode.next = null;

        return deletedNode;
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
