package topico02orientacao_objetos.aula03encapsulamento.model.entities;

public class Person {
    private String name;
    private int age;
    private double height;
    private boolean isProgrammer;

    public Person(String name, int age, double height, boolean isProgrammer) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isProgrammer = isProgrammer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return isProgrammer;
    }

    public void setProgrammer(boolean programmer) {
        isProgrammer = programmer;
    }
}
