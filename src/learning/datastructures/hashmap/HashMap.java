package learning.datastructures.hashmap;

public class HashMap {
    private String[] hashMapKey;
    private String[] hashMapValue;
    private int size, mapFullSize;

    public HashMap(int length){
        this.mapFullSize = length;
        int newPrime = getPrime(this.mapFullSize);
        if(newPrime != this.mapFullSize){
            this.mapFullSize = newPrime;
            System.out.println("The HashMap size should be Prime, update size to:" + newPrime);
        }
        hashMapKey = new String[this.mapFullSize];
        hashMapValue = new String[this.mapFullSize];
        this.size = 0;
    }

    private int getPrime(int value){
        boolean primeFlag;
        for(int newPrime = value; true; newPrime++){
            primeFlag = true;
            for(int i=2; i*i <= newPrime; i++){
                if(newPrime%i == 0) {
                    primeFlag = false;
                    break;
                }
            }
            if(primeFlag) return newPrime;
        }
    }

    public void insert(String key, String value){
        if(isFull()) return;

        int index, step, trueIndx;
        index = hashFunc1(key);
        step = hashFunc2(key);
        trueIndx = index;

        while (hashMapKey[trueIndx] != null){
            trueIndx = index + step;
            trueIndx = trueIndx % mapFullSize;
        }

        hashMapKey[trueIndx] = key;
        hashMapValue[trueIndx] = value;
        this.size++;

    }

    public String findKey(String word){
        int index, step, trueIndx;
        index = hashFunc1(word);
        step = hashFunc2(word);
        trueIndx = index;

        while (hashMapKey[trueIndx] != null){
            if(hashMapKey[trueIndx].equals(word)) return hashMapValue[trueIndx];
            trueIndx = index + step;
            trueIndx = trueIndx % mapFullSize;
        }
        return hashMapValue[trueIndx];
    }

    private int hashFunc1(String key){
        int index = key.hashCode();
        index = index % mapFullSize;
        if(index < 0){
            index = mapFullSize + index;
        }
        return index;
    }

    private int hashFunc2(String key){
        int step = key.hashCode();
        step = step % mapFullSize;
        if(step < 0){
            step = mapFullSize + step;
        }
        return (3 - step % 3);
    }

    public void displayTable(){
        System.out.println("Table: ");
        for (int i=0; i<mapFullSize; i++){
            if(hashMapKey[i] != null){
                System.out.print(hashMapKey[i] + "  " + hashMapValue[i]);
            }else {
                System.out.print("***");
            }
            System.out.println();
        }
    }

    private boolean isFull(){
        return (mapFullSize == size);
    }

}
