package topico02orientacao_objetos.aula04heranca.model.entities;

public class Account {
    protected int number;
    protected String holder;
    protected double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(double value) {
        if (this.balance - value < 0) {
            return;
        }
        this.balance -= value;
    }

    public void deposit(double value) {
        this.balance += value;
    }

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
