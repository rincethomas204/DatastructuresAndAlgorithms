package learning.algorithms.mergesort;

public class MergeSort {
    public void sort(int[] array){
        sort(array, 0, array.length-1);
    }

    public static void sort(int[] array, int start, int end){
        if (end <= start) {
            return;
        }
        int mid = (end+start)/2;
        sort(array,start, mid);
        sort(array,mid+1, end);
        merge(array,start,mid,end);
    }

    public static void merge(int[] array, int start, int mid, int end){
        int arrayLeftLength = mid - start + 1;
        int arrayRightLength = end - mid;
        int[] leftArray = new int[arrayLeftLength+1];
        int[] rightArray = new int[arrayRightLength+1];

        for (int i=0; i < arrayLeftLength; i++){
            leftArray[i] = array[start+i];
        }
        leftArray[arrayLeftLength] = 2147483647;

        for (int i=0; i < arrayRightLength; i++){
            rightArray[i] = array[mid+i+1];
        }
        rightArray[arrayRightLength] = 2147483647;

        int leftReference = 0, rightReference = 0;
        for (int i=0; i<(end-start+1); i++){
            if (leftArray[leftReference] <= rightArray[rightReference]){
                array[start+i] = leftArray[leftReference];
                leftReference++;
            } else {
                array[start+i] = rightArray[rightReference];
                rightReference++;
            }
        }

    }
}
