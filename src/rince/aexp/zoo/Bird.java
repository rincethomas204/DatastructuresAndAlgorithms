package rince.aexp.zoo;

public class Bird extends Animals{

    public Bird(String name, int age, int weightInLbs, int heightInInches) {
        super(name, age, weightInLbs, heightInInches);
    }

    public void fly(){
        System.out.println("Flying right now...");
    }

}
