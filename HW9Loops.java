package homework;

public class HW9Loops {
    public static void main(String[] args) {
        LoopFor();
        System.out.println();
        LoopWhile();
        System.out.println();
        LoopDoWhile();
    }

    static int[] massive = {0, 2, 4, 6, 8, 10};

    public static void LoopFor() {
        for (int i = 0; i < massive.length; i++)
            System.out.print(massive[i] + 1 + " ");
    }

    public static void LoopWhile() {
        int i = 0;
        while (i < massive.length) {
            System.out.print(massive[i] + 2 + " ");
            i++;
        }
    }

    public static void LoopDoWhile() {
        int i = 0;
        do {
            System.out.print(massive[i] + 1.1 + "  ");
            i++;
        } while (i < massive.length);
    }
}
