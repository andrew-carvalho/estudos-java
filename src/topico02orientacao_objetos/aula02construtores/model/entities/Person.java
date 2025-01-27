package topico02orientacao_objetos.aula02construtores.model.entities;

public class Person {
    public String name;
    public int age;
    public double height;
    public boolean isProgrammer;

    public Person(String name, int age, double height, boolean isProgrammer) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isProgrammer = isProgrammer;
    }

    public void say(String phrase) {
        System.out.println(this.name + ": " + phrase);
    }
}
