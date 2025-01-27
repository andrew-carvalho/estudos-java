package topico01fundamentos.aula08listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        char answer;

        do {
            System.out.print("Number: ");
            int number = scanner.nextInt();
            numbers.add(number);

            System.out.print("Want to continue [y/n]? ");
            answer = scanner.next().charAt(0);
        } while (answer == 'y' || answer == 'Y');

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
