package learning.algorithms.mergesort;

public class App {
    public static void main(String [] args){
        int[] myArray = new int[] {0,9,8,4,6,2,7,6,8,3,11,13,10};
        MergeSort sorter = new MergeSort();
        sorter.sort(myArray);

       for(int i=0; i<myArray.length;i++) {
           System.out.println(myArray[i]);
       }
    }
}
