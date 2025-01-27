package topico02orientacao_objetos.aula01classes.model.entities;

public class Person {
    public String name;
    public int age;
    public double height;
    public boolean isProgrammer;

    public void say(String phrase) {
        System.out.println(this.name + ": " + phrase);
    }
}
