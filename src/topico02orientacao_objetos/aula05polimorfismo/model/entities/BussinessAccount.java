package topico02orientacao_objetos.aula05polimorfismo.model.entities;

public class BussinessAccount extends Account {
    private double loanLimit;

    public BussinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double value) {
        if (value > this.loanLimit) {
            return;
        }
        this.deposit(value);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount + 5;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
