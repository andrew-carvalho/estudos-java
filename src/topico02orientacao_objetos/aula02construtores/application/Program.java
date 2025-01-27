package topico02orientacao_objetos.aula02construtores.application;

import topico02orientacao_objetos.aula02construtores.model.entities.Person;

public class Program {
    public static void main(String[] args) {
        Person andrew = new Person("Andrew", 21, 1.74, true);
        System.out.printf("%s %d %.2f %b\n", andrew.name, andrew.age, andrew.height, andrew.isProgrammer);
        andrew.say("Hello!");
    }
}
