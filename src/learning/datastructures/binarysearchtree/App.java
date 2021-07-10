package learning.datastructures.binarysearchtree;

public class App {
    public static void main(String[] args){
        BST binaryTree = new BST();
        binaryTree.insert(10, "Ten");
        binaryTree.insert(2, "two");
        binaryTree.insert(15, "Fifteen");
        binaryTree.insert(9, "Nine");
        binaryTree.insert(6, "Six");
        binaryTree.insert(4, "four");

//        System.out.println(binaryTree.findMin().key);
//        System.out.println(binaryTree.findMax().key);
//        binaryTree.deleteNode(2);
//        binaryTree.deleteNode(15);
//        System.out.println(binaryTree.findMin().key);
//        System.out.println(binaryTree.findMax().key);

        binaryTree.displayTree();

    }
}
