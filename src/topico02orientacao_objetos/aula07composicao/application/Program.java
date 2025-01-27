package topico02orientacao_objetos.aula07composicao.application;

import topico02orientacao_objetos.aula07composicao.model.entities.Client;
import topico02orientacao_objetos.aula07composicao.model.entities.Order;
import topico02orientacao_objetos.aula07composicao.model.entities.OrderItem;
import topico02orientacao_objetos.aula07composicao.model.entities.Product;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Andrew", "andrewignacio@outlook.com.br");

        Product banana = new Product("Banana", 1.50);
        Product apple = new Product("Apple", 2.50);

        Order order = new Order(client);
        order.addItem(new OrderItem(banana, 2));
        order.addItem(new OrderItem(apple, 5));

        System.out.println(order);
    }
}
