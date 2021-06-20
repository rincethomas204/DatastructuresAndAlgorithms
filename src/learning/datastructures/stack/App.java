package learning.datastructures.stack;

public class App {

    public static void main(String args[]){
//        Stack newStack = new Stack(3);
//        newStack.push(21);
//        newStack.push(22);
//        newStack.push(56);
//        newStack.push(88);

        reverse("Rincethomas");

    }

    public static void reverse(String newString){
        char newCharArray[] = newString.toCharArray();
        Stack newCharStack = new Stack(newCharArray.length);

        for(char x : newCharArray){
            newCharStack.push(x);
        }
        for(char x : newCharArray){
            System.out.print(newCharStack.pop());
        }

    }
}
