package topico02orientacao_objetos.aula05polimorfismo.application;

import topico02orientacao_objetos.aula05polimorfismo.model.entities.Account;
import topico02orientacao_objetos.aula05polimorfismo.model.entities.BussinessAccount;

public class Program {
    public static void main(String[] args) {
        Account account = new BussinessAccount(123, "Andrew", 0, 1000);
        account.deposit(10);
        account.withdraw(100);
        account.withdraw(5);
        System.out.println(account);
    }
}
