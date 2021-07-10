package learning.datastructures.binarysearchtree;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Arrays;

public class BST {
    private Node root;

    public void insert(int key, String value){
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;

        if(root == null){
        root = newNode;
        } else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(current.key > key){
                    current = current.leftNode;
                    if(current == null){
                        parent.leftNode = newNode;
                        return;
                    } }
                else{
                        current = current.rightNode;
                        if (current == null){
                            parent.rightNode = newNode;
                            return;
                        }
                    }
            }
        }
    }

    public Node findMin(){
        return findMin_internal(root, root,false);
    }

    private Node findMin_internal(Node rootNode, Node nodeToDelete, boolean replace){
        Node current = rootNode;
        Node parent = rootNode;
        if(current == null){
            return null;
        } else{
            while (current.leftNode != null){
                parent = current;
                current = current.leftNode;
            }
        }
        if(replace && current != nodeToDelete.rightNode){
            parent.leftNode = current.rightNode;
            current.rightNode = nodeToDelete.rightNode;
        }
        return current;
    }

    public Node findMax(){
        return findMax_internal(root);
    }

    private Node findMax_internal(Node rootNode){
        Node current = rootNode;
        if(current == null){
            return null;
        } else{
            while (current.rightNode != null){
                current = current.rightNode;
            }
        }
        return current;
    }

    public boolean deleteNode(int key){
        return deleteNode_internal(key, root, root, false);
    }

    private boolean deleteNode_internal(int key, Node nodeToBeDeleted_OptParameter, Node parent_OptParameter, boolean child){

        Node currentNode, parentNode, nodeToBeDeleted;
        Boolean isLeftChild = false;

        if(nodeToBeDeleted_OptParameter == root){
            currentNode = root;
            parentNode = root;

        if(parentNode == null) return false;

        while (currentNode.key != key){
            parentNode = currentNode;
            if(currentNode.key < key){
                currentNode = currentNode.rightNode;
                isLeftChild = false;
            } else {
                currentNode = currentNode.leftNode;
                isLeftChild = true;
            }
            if(currentNode == null){
                return false;
            }
        }
        nodeToBeDeleted = currentNode;
        }else{
            nodeToBeDeleted = nodeToBeDeleted_OptParameter;
            parentNode = parent_OptParameter;
            isLeftChild = child;
        }

        //delete when the key is at the leaf node
        if(nodeToBeDeleted.rightNode == null && nodeToBeDeleted.leftNode == null){
            if(nodeToBeDeleted == root){
                root = null;
            }else if(isLeftChild){
                parentNode.leftNode = null;
            }else{
                parentNode.rightNode = null;
            }
        }
        //delete when the key has only 1 child node
        else if(nodeToBeDeleted.rightNode==null){
            if(nodeToBeDeleted == root){
                root = nodeToBeDeleted.leftNode;
            } else if(isLeftChild){
                parentNode.leftNode = nodeToBeDeleted.leftNode;
            } else {
                parentNode.rightNode = nodeToBeDeleted.leftNode;
            }
        }

        else if(nodeToBeDeleted.leftNode==null){
            if(nodeToBeDeleted == root){
                root = nodeToBeDeleted.rightNode;
            } else if(isLeftChild){
                parentNode.leftNode = nodeToBeDeleted.rightNode;
            } else {
                parentNode.rightNode = nodeToBeDeleted.rightNode;
            }
        }
        //delete when the key has 2 child nodes
        else{
            Node newReplacementNode = findMin_internal(nodeToBeDeleted.rightNode,nodeToBeDeleted,true);
            if(nodeToBeDeleted == root){
                root = newReplacementNode;
            } else if (isLeftChild) {
                parentNode.leftNode = newReplacementNode;
            } else {
                parentNode.rightNode = newReplacementNode;
            }

            newReplacementNode.leftNode = nodeToBeDeleted.leftNode;
        }
        return true;

    }

    public void displayTree(){
        displayTree_withNode(new Node[] {root}, 1);
    }

    private void displayTree_withNode(Node[] rootNode, int i){
        Node[] currentNodes;
        if(i==1) {
            System.out.println(root.key + "  ");
        }

            currentNodes = new Node[(int) Math.pow(2,i)];
            int k=0;
            for(int j=0; j<i; j++){
                if(rootNode[j] == null){
                    currentNodes[2*j] = null;
                    currentNodes[(2*j)+1] = null;
                }else {
                    k =1;
                    currentNodes[2*j] = rootNode[j].leftNode;
                    currentNodes[(2*j) + 1] = rootNode[j].rightNode;
                }
            }
            if(k == 0){
                return;
            } else{
                for(int j=0; j<=currentNodes.length-1; j++){
                    if(currentNodes[j] != null) {
                        System.out.print(currentNodes[j].key + "  ");
                    }
                }
                System.out.println();
                displayTree_withNode(currentNodes, i+1);

            }


    }
}
