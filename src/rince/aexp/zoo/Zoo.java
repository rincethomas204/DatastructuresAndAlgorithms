package rince.aexp.zoo;

public class Zoo {
    public static void main(String[] args){

        Animals animal1 = new Animals("Lion", 10, 100, 90);

        animal1.sleep();
        animal1.eat();
        System.out.println(animal1);

        Fish fish1 = new Fish("Shark", 10, 200, 65);
        fish1.sleep();
        fish1.eat();
        fish1.swim();
        System.out.println(fish1);

        Bird bird1 = new Bird("Sparrow", 50, 1, 5);
        bird1.sleep();
        bird1.eat();
        bird1.fly();
        System.out.println(bird1);

    }
}
