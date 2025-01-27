package topico02orientacao_objetos.aula01classes.application;

import topico02orientacao_objetos.aula01classes.model.entities.Person;

public class Program {
    public static void main(String[] args) {
        Person andrew = new Person();

        andrew.name = "Andrew";
        andrew.age = 21;
        andrew.height = 1.74;
        andrew.isProgrammer = true;

        System.out.printf("%s %d %.2f %b\n", andrew.name, andrew.age, andrew.height, andrew.isProgrammer);
        andrew.say("Hello!");
    }
}
