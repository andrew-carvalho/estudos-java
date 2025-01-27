package topico01fundamentos.aula05condicoes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("Can enter!");
        } else if (age < 0) {
            System.out.println("Invalid age.");
        } else {
            System.out.println("Cannot enter!");
        }

        System.out.print("Sex [M/F]: ");
        char sex = scanner.next().charAt(0);

        switch (sex) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        System.out.print("Height: ");
        double height = scanner.nextDouble();

        String message = (height > 1.85 ? "Tall" : "Normal");
        System.out.println(message);
    }
}
