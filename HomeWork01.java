public class HomeWork01 {
    public static void main(String[] args) {
        short q = 365;
        short a = (short) (q / 100);
        short w = (short) (q % 100);
        short s = (short) (w / 10);
        short e = (short) (w % 10);

        System.out.print("Сотни = ");
        System.out.println(a);
        System.out.print("Десятки = ");
        System.out.println(s);
        System.out.print("Единицы = ");
        System.out.println(e);

    }

}
