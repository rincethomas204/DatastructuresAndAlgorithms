package rince.aexp.zoo;

public class Animals {
    String name;
    int age;
    int weightInLbs;
    int heightInInches;

    public Animals(String name, int age, int weightInLbs, int heightInInches) {
        this.name = name;
        this.age = age;
        this.weightInLbs = weightInLbs;
        this.heightInInches = heightInInches;
    }

    @Override
    public String toString() {
        return "Animals {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weightInLbs=" + weightInLbs +
                ", heightInInches=" + heightInInches +
                '}';
    }

    public void eat(){
        System.out.println("eating now...");
    }

    public void sleep(){
        System.out.println("sleeping now...");
    }
}
