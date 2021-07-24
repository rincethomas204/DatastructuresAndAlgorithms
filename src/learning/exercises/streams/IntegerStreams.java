package learning.exercises.streams;

import java.util.Arrays;

public class IntegerStreams {
    public static void main(String[] args){
        int[] newArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0, sum1=0;

        for (int value: newArray
             ) {
            if(value%2 == 0){
                sum = sum + value*2;
            }
        }

        sum1 = Arrays.stream(newArray)
                .filter(c -> c%2==0)
                .map(c -> c*2)
                .reduce(0, (subtotal,c) -> subtotal + c);

        System.out.println(sum);
        System.out.println(sum1);
    }
}
