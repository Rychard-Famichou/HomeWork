package HomeWork;

public class A4Char {
    public static void main(String[] args) {
        System.out.println("Task 1");
        // Given symbol
        char q = '9';
        System.out.println("Symbol: " + q);
        // Method .value0f() class String & method .parseInt() class Integer
        int qInt = Integer.parseInt(String.valueOf(q));
        // OutputCheck
        System.out.println("Convert to Integer, + 1 for check: " + (qInt + 1));

        System.out.println();

        System.out.println("Tack 2");
        // Given symbol
        char w = '9';
        System.out.println("Symbol: " + w);
        // Method .getNumericValue() class Character
        int wInt = Character.getNumericValue(w);
        // OutputCheck
        System.out.println("Convert to Integer, - 1 for check: " + (wInt - 1));

        System.out.println();
        System.out.println("The end");
    }
}
