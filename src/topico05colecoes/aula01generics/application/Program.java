package topico05colecoes.aula01generics.application;

import topico05colecoes.aula01generics.models.services.PrintService;

public class Program {
    public static void main(String[] args) {
        PrintService<Integer> printServiceInt = new PrintService<Integer>();

        try {
            printServiceInt.add(10);
            printServiceInt.add(20);
            printServiceInt.add(30);
            System.out.println(printServiceInt.first());
            printServiceInt.print();
        } catch (Exception e) {
            System.out.println("An error ocurred: " + e.getMessage());
        }
    }
}
