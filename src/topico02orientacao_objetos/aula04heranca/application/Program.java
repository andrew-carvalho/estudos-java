package topico02orientacao_objetos.aula04heranca.application;

import topico02orientacao_objetos.aula04heranca.model.entities.Account;
import topico02orientacao_objetos.aula04heranca.model.entities.BussinessAccount;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(123, "Andrew", 0);
        account.deposit(100);
        account.withdraw(50);

        BussinessAccount bussinessAccount = new BussinessAccount(123, "Andrew", 0, 1000);
        bussinessAccount.deposit(100);
        bussinessAccount.loan(1000);
        bussinessAccount.withdraw(500);
    }
}
