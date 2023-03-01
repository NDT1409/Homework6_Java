package homework2;

import java.util.Random;
public class Task2 {

    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(899) + 100;
        int x = a / 100;
        int yPart = a / 10;
        int y = yPart % 10;
        int z = a % 10;
        if (x > y && x > z) {
            System.out.println (x);
        } else if (y > x && y > z) {
            System.out.println (y);
        } else {
            System.out.println (z);
        }
    }
}
