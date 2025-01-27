package topico02orientacao_objetos.aula06enumeracao.model.entities;

import topico02orientacao_objetos.aula06enumeracao.model.enums.OrderStatus;

public class Order {
    private int productCode;
    private int quantity;
    private double unitValue;
    private double totalValue;
    private OrderStatus status;

    public Order(int productCode, int quantity, double unitValue, OrderStatus status) {
        this.productCode = productCode;
        this.quantity = quantity;
        this.unitValue = unitValue;
        this.status = status;
        updateTotalValue();
    }

    public Order(int productCode, int quantity, double unitValue) {
        this(productCode, quantity, unitValue, OrderStatus.WAITING_PAYMENT);
    }

    @Override
    public String toString() {
        return String.format("Order:\nStatus: %d (%s)\nProduct: %s\nQuantity: %d\nUnit value: %.2f\nTotal value: %.2f",
                this.status.ordinal(),
                this.status,
                this.productCode,
                this.quantity,
                this.unitValue,
                this.totalValue);
    }

    public void updateTotalValue() {
        this.totalValue = unitValue * quantity;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateTotalValue();
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
        updateTotalValue();
    }

    public double getTotalValue() {
        return totalValue;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
