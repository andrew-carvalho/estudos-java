package topico02orientacao_objetos.aula07composicao.model.entities;

import topico02orientacao_objetos.aula07composicao.model.enums.OrderStatus;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private double totalValue;
    private Instant creationDate;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    public Order(Instant creationDate, OrderStatus status, Client client, ArrayList<OrderItem> items) {
        this.creationDate = creationDate;
        this.status = status;
        this.client = client;
        this.items = items;
        this.calculateTotalValue();
    }

    public Order(Instant creationDate, OrderStatus status, Client client) {
        this.creationDate = creationDate;
        this.status = status;
        this.client = client;
    }

    public Order(OrderStatus status, Client client) {
        this.creationDate = Instant.now();
        this.status = status;
        this.client = client;
    }

    public Order(Client client) {
        this.creationDate = Instant.now();
        this.status = OrderStatus.PENDING_PAYMENT;
        this.client = client;
    }

    @Override
    public String toString() {
        return String.format("""
                        Order Status: %d (%s)\
                        
                        Created at: %s\
                        
                        Client: %s\
                        
                        Total Value: %.2f\
                        """,
                this.status.ordinal(), this.status,
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()).format(this.creationDate),
                this.client,
                this.totalValue);
    }

    private void calculateTotalValue() {
        double calculatedValue = 0;
        for (OrderItem item : this.items) {
            calculatedValue += item.getPrice();
        }
        this.totalValue = calculatedValue;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
        this.calculateTotalValue();
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public double getTotalValue() {
        return totalValue;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
