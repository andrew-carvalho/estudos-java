package topico02orientacao_objetos.aula06enumeracao.application;

import topico02orientacao_objetos.aula06enumeracao.model.entities.Order;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(100, 10, 10);
        System.out.println(order);
    }
}
