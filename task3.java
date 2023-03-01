package homework2;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter amount with 3 numbers (example '123'):");
        int a = scanner.nextInt();
        int x = a / 100;
        int yPart = a / 10;
        int y = yPart % 10;
        int z = a % 10;

        System.out.println("The summary from 3 numbers is: " + (x + y + z));
        System.out.println("App finished work.");
    }
}
