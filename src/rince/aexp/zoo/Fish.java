package rince.aexp.zoo;

public class Fish extends Animals {

    public Fish(String name, int age, int weightInLbs, int heightInInches) {
        super(name, age, weightInLbs, heightInInches);
    }

    public void swim(){
        System.out.println("Swimming right now...");
    }
}
