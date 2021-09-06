package learning.exercises.employeebadging;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        List<StudentSwipeRecord> studentBadging = Arrays.asList(
                new StudentSwipeRecord("Paul",1355),
                new StudentSwipeRecord("Jennifer", 1910),
                new StudentSwipeRecord("Jennifer", 1335),
                new StudentSwipeRecord("Jennifer", 730),
                new StudentSwipeRecord("Jennifer", 5),
                new StudentSwipeRecord("John", 835),
                new StudentSwipeRecord("John", 830),
                new StudentSwipeRecord("John", 1615),
                new StudentSwipeRecord("John", 1640),
                new StudentSwipeRecord("John", 855),
                new StudentSwipeRecord("John", 930),
                new StudentSwipeRecord("John", 915),
                new StudentSwipeRecord("John", 730),
                new StudentSwipeRecord("John", 940),
                new StudentSwipeRecord("John", 1630),
                new StudentSwipeRecord("Paul", 1315),
                new StudentSwipeRecord("Paul", 1405),
                new StudentSwipeRecord("Paul", 1849),
                new StudentSwipeRecord("Paul", 1905)
        );

        displayMultiEnterantStudents(studentBadging);


    }

// We want to find employees who badged into our secured room unusually often.
// We have an unordered list of names and entry times over a single day.
// Access times are given as numbers up to four digits in length using 24-hour time, such as "800" or "2250".
//
// Write a function that finds anyone who badged into the room three or more times in a one-hour period.
// Your function should return each of the employees who fit that criteria, plus the times that they badged in during the one-hour period.
// If there are multiple one-hour periods where this was true for an employee, just return the first one.

    public static void displayMultiEnterantStudents(List<StudentSwipeRecord> allStudents){
        Map<String,List<Integer>> newHashMap = new HashMap<>();
        for (StudentSwipeRecord student :
            allStudents) {
            if(newHashMap.containsKey(student.name)){
                newHashMap.get(student.name).add(student.timeIn);
            }else{
                newHashMap.put(student.name,new ArrayList<Integer>());
                newHashMap.get(student.name).add(student.timeIn);
            }
        }

        System.out.println(newHashMap.entrySet().stream()
                .filter( e -> e.getValue().size()>=3)
                .filter( e -> findHourEnterant(e.getValue()))
                .map(e-> e.getKey().toString() + displayHourEnterant(e.getValue()))
                .collect(Collectors.toList()));

    }

    public static boolean findHourEnterant(List<Integer> timeInt){
        Collections.sort(timeInt);

        for (int i=0; i< timeInt.size()-2; i++){
            if(timeInt.get(i+2)-timeInt.get(i) <= 100)
                return true;
        }
        return false;
    }

    public static String displayHourEnterant(List<Integer> timeInt){

        Collections.sort(timeInt);

        for (int i=0; i< timeInt.size()-2; i++){
            if(timeInt.get(i+2)-timeInt.get(i) <= 100)
                return " -> " + timeInt.get(i) + " " + timeInt.get(i+1) + " " + timeInt.get(i+2) ;
        }
        return "";
    }
}
