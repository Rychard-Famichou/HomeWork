package homework;

import java.util.Scanner;

public class A6MethodStart {
    public static void main(String[] args) {
        // Invite
        System.out.println("\"Home calculation calories\"");
        System.out.println();
        // Data input via scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the large pizza: ");
        double l = sc.nextDouble();
        System.out.print("Enter the diameter of the small pizza: ");
        double s = sc.nextDouble();
        sc.close();
        System.out.println();
        // Create method
        A6MethodBody o = new A6MethodBody();
        l = o.Body(l);
        s = o.Body(s);
        System.out.println("Calorie difference: " + (l - s));
        // Seeing off
        System.out.println();
        System.out.println("The end");
        System.out.println("Please restart to enter other data");
    }
}
