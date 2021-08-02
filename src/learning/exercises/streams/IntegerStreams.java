package learning.exercises.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerStreams {
    public static void main(String[] args){
        List<Integer> newArray =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(newArray.stream()
                .filter(c -> c%2==0)
                .mapToInt(c -> c*2)
                .sum());
    }
}
