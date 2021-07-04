package learning.algorithms.binarysearch;

public class BinarySearch {
    public static void main (String[] args){

        int[] array = new int[] {1, 5, 9, 24, 45, 89, 90, 99, 103};
        System.out.println(binarySearch( 103,array));
        System.out.println(binarySearchRecursive( 0, array.length-1,array, 11));

    }

    public static int binarySearch(int value, int[] a){
        int p = 0;
        int r = a.length-1;

        while (p <= r){
            int q = (p+r)/2;
            if(value < a[q]){
                r = q-1;
            } else if(value > a[q]){
                p = q+1;
            } else return q;
        }
        return -1;
    }

    public static int binarySearchRecursive(int p, int r, int[] a, int value) {
        System.out.println("[ "+ p + "..." + r + " ]");
        if (p>r) return -1;
        else {
            int q = (p+r)/2;
            if(a[q] == value) return q;
            else if (a[q] > value) return binarySearchRecursive(p,q-1, a, value);
            else return binarySearchRecursive(q+1, r, a, value);
        }
    }

}
