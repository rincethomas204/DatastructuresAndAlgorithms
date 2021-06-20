package learning.datastructures.stack;

public class Stack {
    private int maxLength;
    private char[] stackArray;
    private int currentPosition;

    public Stack(int maxLength){
        this.maxLength = maxLength;
        this.stackArray = new char[maxLength];
        currentPosition = -1;
    }

    public void push(char value){
        if (!isFull()) {
            this.currentPosition++;
            this.stackArray[this.currentPosition] = value;
        }
    }

    public char pop(){
        if(!isEmpty()) {
            return this.stackArray[this.currentPosition--];
        } else return '0';
    }

    public char peek(){
        return this.stackArray[this.currentPosition];
    }

    public boolean isEmpty(){
        return currentPosition == -1;
    }

    public boolean isFull(){
        return (maxLength -1) == currentPosition;
    }
}
