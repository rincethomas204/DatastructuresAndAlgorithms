package learning.datastructures.linkedLists;

public class App {
    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.data = 5;

        Node nodeB = new Node();
        nodeA.next = nodeB;
        nodeB.data = 7;

        Node nodeC = new Node();
        nodeB.next = nodeC;
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeC.next = nodeD;
        nodeD.data = 2;

        System.out.println(listLength(nodeD));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));
        System.out.println(listLength(nodeA));

    }

    public static int listLength(Node aNode){
        int counter = 0;

        if (aNode == null) return counter;
        else counter++;

        while (aNode.next != null){
            counter++;
            aNode = aNode.next;
        }
        return counter;
    }
}
