package learning.algorithms.linearsearch;

public class LinearSearch {
    public static void main(String[] args){

        int[] array = new int[] {1, 9, 8, 8};
        System.out.println(linearSearch(array, 9));
        System.out.println(linearSearchRecursive(array, 0, 9));


    }

    public static int linearSearch(int[] a, int key ){
        for(int temp =0; temp < a.length; temp++){
            if (a[temp] == key)
                return temp;
        }
        return -1;
    }

    public static int linearSearchRecursive(int[] a, int i , int key){
        if(i> (a.length-1)) return -1;
         else if(a[i] == key) return i;
         else {
             System.out.println("index at: "+ i);
             return linearSearchRecursive(a,i+1, key);
        }
    }
}
