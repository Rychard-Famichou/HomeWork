package homework;
import java.util.Random;
public class HM7Scoreboard {
    public static void main(String[] args) {
        Random random = new Random();
        int second = random.nextInt(0,28801);
        System.out.println("Seconds left: " + second);
        byte hour = (byte) (second / 3600);
        System.out.println("Hours left: " + hour);
    }
}
