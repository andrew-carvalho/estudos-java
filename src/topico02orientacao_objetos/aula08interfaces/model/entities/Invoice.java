package topico02orientacao_objetos.aula08interfaces.model.entities;

public class Invoice {
    private double basicPayment;
    private double taxAmount;

    public Invoice(double basicPayment, double taxAmount) {
        this.basicPayment = basicPayment;
        this.taxAmount = taxAmount;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalPayment() {
        return getBasicPayment() + getTaxAmount();
    }
}
