package topico02orientacao_objetos.aula07composicao.model.entities;

public class OrderItem {
    private Product product;
    private int quantity;
    private double price;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.setQuantity(quantity);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.price = this.product.getPrice() * this.quantity;
    }

    public double getPrice() {
        return price;
    }
}
