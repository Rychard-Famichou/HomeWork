package HomeWork;

public class A5VCalculatorBox {
    // Create fields
    public int length;
    public int width;
    public int height;
    // Create constructor (variable)
    public A5VCalculatorBox(int a, int b, int h){
        // Equality
        length = a;
        width = b;
        height = h;
        // Volume calculation
        int v = a * b * h;
        // Output
        System.out.println("The volume of this box: " + v);
    }
}
