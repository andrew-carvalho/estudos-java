package topico01fundamentos.aula02saida_de_dados;

public class Program {
    public static void main(String[] args) {
        // Exibindo strings
        System.out.println("Hello world!");

        // Exibindo variáveis (concatenação)
        int age = 21;
        System.out.println("The age is: " + age);
        System.out.println("I'm " + age + " years old.");

        // Exibindo variáveis de forma formatada
        double height = 1.74;
        System.out.printf("I'm %.2f meters tall!", height);
    }
}
