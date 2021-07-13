package learning.datastructures.heap;

public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int size){
        this.maxSize = size;
        currentSize = 0;
        heapArray = new Node[size];
    }

    public int getSize(){
        return currentSize;
    }
    public boolean isEmpty(){
        return (currentSize == 0);
    }

    // Insert method
    public boolean insert(int key){
    if(currentSize == maxSize){
        return false;
    }
    Node newNode = new Node(key);
    heapArray[currentSize] = newNode;

    trickleUp(currentSize);
    currentSize++;

    return true;
    }

    // Trickle up
    public void trickleUp(int trickleUpPoint){
        int parentIdx = (trickleUpPoint-1)/2;
        Node nodeToInsert = heapArray[trickleUpPoint];

        while (trickleUpPoint > 0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()){
            heapArray[trickleUpPoint] = heapArray[parentIdx];
            trickleUpPoint = parentIdx;
            parentIdx = (parentIdx-1)/2;
        }
        heapArray[trickleUpPoint] = nodeToInsert;
    }

    public Node delete(){
        Node nodeToDelete = heapArray[0];
        if(currentSize == 0) return null;
        else if(currentSize==1){
            currentSize =0;
            heapArray[0] = null;
            return nodeToDelete;
        }

        heapArray[0] = heapArray[currentSize-1];
        currentSize--;

        trickleDown(0);

        return nodeToDelete;

    }

    private void trickleDown(int pId){
        int lId, rId, largerId;
        Node newNode = heapArray[pId];

        while (pId < currentSize/2){
            lId = 2 * pId + 1;
            rId = 2 * pId + 2;
            if(rId < currentSize && heapArray[lId].getKey() > heapArray[rId].getKey()){
                heapArray[pId] = heapArray[lId];
                pId = lId;
            }else {
                heapArray[pId] = heapArray[rId];
                pId = rId;
            }
        }
        heapArray[pId]=newNode;
    }
}
