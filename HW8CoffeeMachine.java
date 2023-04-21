package homework;

import java.util.Scanner;

public class HW8CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter drink number (1-espresso, 2-americano, 3-cappuccino, 4-tea): ");
        byte numberDrink = sc.nextByte();
        sc.close();
        HW8Algorithm algorithm = new HW8Algorithm();
//        if (numberDrink == 1) {
//            algorithm.Glass();
//            algorithm.Espresso();
//            algorithm.Ready();
//        } else if (numberDrink == 2) {
//            algorithm.Glass();
//            algorithm.Americano();
//            algorithm.Ready();
//        } else if (numberDrink == 3) {
//            algorithm.Glass();
//            algorithm.Cappuccino();
//            algorithm.Ready();
//        } else if (numberDrink == 4) {
//            algorithm.Glass();
//            algorithm.Tea();
//            algorithm.Ready();
//        } else algorithm.Incorrect();
        switch (numberDrink) {
            case 1, 2, 3, 4 -> algorithm.Glass();
            default -> algorithm.Incorrect();
        }
        switch (numberDrink) {
            case 1 -> algorithm.Espresso();
            case 2 -> algorithm.Americano();
            case 3 -> algorithm.Cappuccino();
            case 4 -> algorithm.Tea();
        }
        switch (numberDrink){
            case 1, 2, 3, 4 -> algorithm.Ready();
        }
    }
}
