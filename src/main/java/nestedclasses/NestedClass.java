package nestedclasses;

import accounts.Accounts;

public class NestedClass {

    public static void main(String[] args) {
        // так делают потому что на практике тяжело создать реальный банк с помощью одного конструктора
        Bank.Banker banker = new Bank.Banker();// создаем банкира
        Bank bank = banker.createBank();// создаем банк

        Bank.Account account = bank.new Account("jhg", "vladimir", 10000000);//создается счет
        account.open();
        bank.putMoney("jhg", 1000);
        bank.getMoney("jhg", 1000);
        account.close();

    }
}
