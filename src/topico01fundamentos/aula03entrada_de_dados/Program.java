package topico01fundamentos.aula03entrada_de_dados;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Lê a linha ignorada pelo nextInt() para o nextLine() seguinte funcionar

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Height: ");
        double height = scanner.nextDouble();

        System.out.print("Sex [m/f]: ");
        char sex = scanner.next().charAt(0);

        System.out.printf("%s is %d years old and %.2f meters tall!", name, age, height);
    }
}
