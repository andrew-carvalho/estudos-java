package topico02orientacao_objetos.aula03encapsulamento.application;

import topico02orientacao_objetos.aula03encapsulamento.model.entities.Person;

public class Program {
    public static void main(String[] args) {
        Person andrew = new Person("Andrew", 21, 1.74, true);
        andrew.setAge(-10);
        System.out.printf("%s %d %.2f %b\n", andrew.getName(), andrew.getAge(), andrew.getHeight(), andrew.isProgrammer());
    }
}
