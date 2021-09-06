package learning.lambda.practicals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public static void main(String [] args){
        List<Car> Cars =Arrays.asList(
                new Car ("Honda", "Accord", "Red", 22350),
                new Car ("Honda", "Civic", "Blue", 19350),
                new Car ("Toyota", "Corola", "Black", 18050),
                new Car ("Hyundai", "Santro", "Blue", 16500),
                new Car ("Chrysler", "Pacifica", "White", 30350),
                new Car ("Nissan", "Altima", "Silver", 19950),
                new Car ("Jeep", "Bigone", "Red", 33350),
                new Car ("BMW", "Bestone", "Black", 42350),
                new Car ("Ferrari", "MostExp", "Blue", 78350)
        );

        System.out.println("Print Blue cars...");
        getCars(Cars, (c)->c.color.equals("Blue"));

        System.out.println("Print price range cars...");
        getCars(Cars, (c)->c.getPrice()>20000 && c.getPrice() <=50000);

        System.out.println("Print all car, price range & color...");
        printSomeCars(Cars,(c)->"Price = " + c.getPrice() + ", and Color = " + c.getColor());


    }
    public static void getCars(List<Car> Cars, Predicate<Car> predicate){
        for(Car c: Cars){
            if(predicate.test(c))
                c.printCar();
        }
    }

    public static void printSomeCars(List<Car> Cars, Function<Car,String > function){
        for(Car c: Cars){
            System.out.println(function.apply(c));
        }
    }
}
