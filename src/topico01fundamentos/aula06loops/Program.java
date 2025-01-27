package topico01fundamentos.aula06loops;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number [0 to quit]: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;
            System.out.print("Number [0 to quit]: ");
            number = scanner.nextInt();
        }

        System.out.println("Sum: " + sum);

        System.out.println();

        System.out.print("How many numbers? ");
        int quantity = scanner.nextInt();

        sum = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Sum: " + sum);

        System.out.println();

        sum = 0;
        do {
            System.out.print("Number [0 to quit]: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum: " + sum);
    }
}
