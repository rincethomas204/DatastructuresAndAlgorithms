package learning.exercises.loopstrings;

public class LoopsPractice {
    public static void main(String[] args){

        String str = " we can get some category:apple thats not good. "
                + "category:mango category:orange";

        printCategories(str);

    }

    public static void printCategories(String str){
        int startReferenceIndex = 0, endReferenceIndex;

        while (true) {
            startReferenceIndex = str.indexOf("category:", startReferenceIndex);
            endReferenceIndex = str.indexOf(" ", startReferenceIndex);
            if(startReferenceIndex < 0) break;
            else {
                if(endReferenceIndex < 0) endReferenceIndex = str.length();
                System.out.println(str.substring(startReferenceIndex+9,endReferenceIndex));
                startReferenceIndex++;
            }

        }

    }

}
