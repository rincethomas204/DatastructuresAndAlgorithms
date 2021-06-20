package learning.datastructures.singlylinkedlists;

public class App {
    public static void main(String[] args){
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.insertFirst(99);
        sList.insertFirst(84);
        sList.insertFirst(79);
        sList.insertFirst(64);
        sList.insertFirst(59);
        sList.insertFirst(44);
        sList.insertLast(104);
        sList.deleteFirst();
        sList.deleteLast();
        sList.deleteLast();
        sList.deleteLast();
        sList.deleteFirst();

        sList.displayList();
    }
}
