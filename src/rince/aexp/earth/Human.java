package rince.aexp.earth;

public class Human {

    String name;
    int height;
    int weight;

    public Human(){
        this.name = "";
        this.height = 0;
        this.weight = 0;
    }

    public void speak(){
        System.out.println("My name is "+ this.name);
        System.out.println("Im "+ height + " feet tall. My weight is " + weight + "kg.");
    }
}
