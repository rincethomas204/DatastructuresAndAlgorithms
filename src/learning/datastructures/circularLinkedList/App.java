package learning.datastructures.circularLinkedList;

public class App {
    public static void main(String[] args){
        CircularLinkedList sList = new CircularLinkedList();
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
