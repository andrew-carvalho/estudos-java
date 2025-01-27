package topico01fundamentos.aula07arrays;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
