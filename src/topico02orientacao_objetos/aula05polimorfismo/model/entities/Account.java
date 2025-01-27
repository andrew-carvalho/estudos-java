package topico02orientacao_objetos.aula05polimorfismo.model.entities;

// Classes abstratas não podem ser instanciadas, apenas herdadas
public abstract class Account {
    protected int number;
    protected String holder;
    protected double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    // Metodo da classe Object (superclasse de todas as classes)
    @Override
    public String toString() {
        return String.format("%d -> %s: R$%.2f\n", this.number, this.holder, this.balance);
    }

    public void withdraw(double value) {
        if (value > this.balance) {
            System.out.println("Insufficient funds");
            return;
        }

        this.balance -= value;
    }

    // Métodos abstratos DEVEM ser sobrescritos pelas subclasses
    public abstract void deposit(double value);

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
}
