package HomeWork;

import java.util.Scanner;

public class A3ScanConvert {
    public static void main(String[] args) {
        // Create and on scanner
        Scanner sc = new Scanner(System.in);
        // Invite
        System.out.println("Disposable Home Convert");
        System.out.print("Enter integer: ");
        // Reception
        int q = sc.nextInt();
        // OutputConvert
        System.out.println("You binary: " + Integer.toBinaryString(q));
        System.out.println("The end");
        // Off scanner
        sc.close();
    }
}
