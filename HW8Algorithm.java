package homework;

public class HW8Algorithm {
    public void Glass(){
        System.out.println("Serve a glass");
    }
    public void Espresso() {
        System.out.println("Pour espresso");
    }
    public void Americano() {
        Espresso();
        System.out.println("Add water");
    }
    public void Cappuccino() {
        Espresso();
        System.out.println("Add frothed milk");
    }
    public void Tea(){
        System.out.println("Pour tea");
    }
    public void Ready(){
        System.out.println("You drink is ready");
    }
    public void Incorrect(){
        System.out.println("Incorrectly data");
    }
}
