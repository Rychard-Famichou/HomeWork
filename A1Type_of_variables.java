package HomeWork;

class A1Type_of_variables {
    public static void main(String[] args) {
        
        // Given
        short q = 365;
        System.out.print("Number = ");
        System.out.println(q);
        // Select hundreds
        byte a = (byte) (q / 100);
        System.out.print("Hundreds = ");
        System.out.println(a);
        // Select tens
        byte w = (byte) (q % 100);
        byte s = (byte) (w / 10);
        System.out.print("Tens = ");
        System.out.println(s);
        // Select units
        byte e = (byte) (w % 10);
        System.out.print("Units = ");
        System.out.println(e);

        System.out.println();
        System.out.println("The End");
    }
}
