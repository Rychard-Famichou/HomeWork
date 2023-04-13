package homework;

public class A6MethodBody {
    // Create basic method
    public double Body(double x) {
        double y = c(s(rs(r(x))));
        return y;
    }
    // Return radius
    private double r (double x) {
        return x / 2;
    }
    // Return radius squared
    private double rs (double x){
        return Math.pow(x,2);
    }
    // Return S
    private double s (double x){
        return x * Math.PI;
    }
    // Return calorie
    private double c (double x){
        return x * 40;
    }
}
