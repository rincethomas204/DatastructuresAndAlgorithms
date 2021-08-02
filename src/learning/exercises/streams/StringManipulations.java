package learning.exercises.streams;

import java.util.Arrays;
import java.util.HashMap;

public class StringManipulations {
    public static void main(String[] args){
        String a = "listen";
        String b = "silent";
        System.out.println(isAnagram2(a,b));
    }

    public static boolean isAnagram(String a, String b){

        if(a.length() != b.length()) return false;
        int[] newArray = new int[a.length()];

        for(int i=0; i < a.length(); i++){
            for ( int j=0; j<a.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    if(newArray[j] == 1) return false;
                    else {
                        newArray[j] = 1;
                        break;
                    }
                }
                if(j == a.length()-1)return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String a, String b){

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1, b1)) return true;
        else return false;

    }

/*    public static boolean isAnagram1(String a, String b){

        HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();


        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1, b1)) return true;
        else return false;

    }*/

}
