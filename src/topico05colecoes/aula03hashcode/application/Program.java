package topico05colecoes.aula03hashcode.application;

import topico05colecoes.aula03hashcode.model.entities.Person;

public class Program {
    public static void main(String[] args) {
        Person andrew = new Person("Andrew", "andrew@test.com");
        Person beatriz = new Person("Beatriz", "beatriz@test.com");
        Person andrewCopy = new Person("Andrew", "andrew@test.com");

        if (andrew.hashCode() == beatriz.hashCode()) {
            System.out.println("The objects are equal!");
        } else {
            System.out.println("The objects are different!");
        }

        if (andrew.hashCode() == andrewCopy.hashCode()) {
            System.out.println("Two Andrews!");
        } else {
            System.out.println("Only one real Andrew!");
        }
    }
}
