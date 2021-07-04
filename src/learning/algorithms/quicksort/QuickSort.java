package learning.algorithms.quicksort;

public class QuickSort {

    public static void quickSort(int[] newArray){

        quickSort_new(newArray,0,newArray.length-1);
    }

    private static void quickSort_new(int[] newArray, int start, int end){

        if (end>start){
            int midpoint = partitionSort(newArray,start,end);

            quickSort_new(newArray, 0, midpoint-1);
            quickSort_new(newArray, midpoint+1, end);
        }
    }

    public static int partitionSort(int[] newArray, int start, int end){
        int counter1 = start-1, counter2;
        for(counter2 = start; counter2 <= end-1; counter2++){
            if(newArray[counter2] <= newArray[end]){
                counter1++;
                if(counter1 != counter2){
                    int temp = newArray[counter2];
                    newArray[counter2] = newArray[counter1];
                    newArray[counter1] = temp;
                }
            }
        }
        int temp = newArray[end];
        newArray[end] = newArray[counter1+1];
        newArray[counter1+1] = temp;
        return counter1+1;
    }
}
