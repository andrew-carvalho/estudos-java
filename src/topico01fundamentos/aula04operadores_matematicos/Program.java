package topico01fundamentos.aula04operadores_matematicos;

public class Program {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        System.out.printf("%d + %d = %d\n", x, y, (x + y));
        System.out.printf("%d - %d = %d\n", x, y, (x - y));
        System.out.printf("%d / %d = %d\n", x, y, (x / y));
        System.out.printf("%d * %d = %d\n", x, y, (x * y));

        // Casting de dados
        y = 3;

        System.out.printf("%d / %d = %.2f\n", x, y, ((double) x / y));
    }
}
