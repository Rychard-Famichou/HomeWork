package HomeWork;
// Check import
import java.util.Scanner;

public class A5VCalculatorStart {
    public static void main(String[] args) {
        // Invite
        System.out.println("\"Home Volume Calculator\"");
        System.out.println();
        // Data input via scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length (integer): ");
        int a = sc.nextInt();
        System.out.print("Enter width (integer): ");
        int b = sc.nextInt();
        System.out.print("Enter height (integer): ");
        int h = sc.nextInt();
        System.out.println();
        sc.close();
        // Create new thing
        A5VCalculatorBox box1 = new A5VCalculatorBox(a,b,h);
        // Seeing off
        System.out.println("The end");
        System.out.println();
        System.out.println("Please restart to enter other data");
    }
}