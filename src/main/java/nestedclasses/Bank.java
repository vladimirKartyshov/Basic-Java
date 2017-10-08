package nestedclasses;

import accounts.Accounts;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

//создаем банк
public class Bank {

    public class Account{// внутренний класс
        private String id;// идентификатор человека
        private String name;// имя человека
        private int money;// кол-во денег на счету
        private ArrayList<AccountOperation> operations = new ArrayList<AccountOperation>();

      //  создание счета чтобы пользователь мог открыть счет самостоятельно
        public Account(String id, String name, int amount){
            this.id = id;
            this.name = name;
            this.money = amount;
        }

        public void open(){
          accounts.put(id, this);//кладем самого себя в account класса ОБОЛОЧКИ тк имеем доступ к его полям
        }

        public void close(){
            accounts.remove(id);//удаляем ссылку на самого себя
        }
    }

    public static class Banker{// создаем банкира
        public Bank createBank(){// фун-я банкира создать банк
            return new Bank();
        }
    }

    private Bank(){// такая констру-я означает что класс банк нельзя создать через new
                   // в другой части программы кроме самого этого класса
    }

    // чтобы иметь возможность по индефикатору доставать тот или иной счет
   private HashMap<String, Account> accounts = new HashMap<String, Account>();

 // public void openAccount(String id, String name){// открываем счет
  //    Account account = new Account();// создаем счет
   //   account.id = id;// присваиваем ид
   //   account.name = name;// присваиваем имя
    //  accounts.put(id, account);// кладем этот счет в наш список счетов

  //  }


    public void putMoney(String id, final int amount){// кладем на счет
        Account account = accounts.get(id);// для того чтобы положить на счет из списка счетов достаем счет котор соотв
                                           //   данному идентификатору
        if (account == null){// проверяем если счета нет
            return;// то ничего не делаем
        }
        // account.money += amount;//если счет есть то кол-во денег увеличиваем на кол-во перед-е в параметре

        AccountOperation operation = new AccountOperation() {  // чтобы не класть деньги на прямую
            public Date getdate() {
                return new Date();
            }

            public int amount() {
                return amount;
            }
        };
        account.operations.add(operation);//добавляем эту операцию в список операций

    }

    public void getMoney(String id, final int amount){// снимаем со счета
       Account account = accounts.get(id);
        if (account == null){
            return;
        }
     //   account.money -= amount;// здесь только кол-во денег уменьшаем
        AccountOperation operation = new AccountOperation() {  // чтобы не класть деньги на прямую
            public Date getdate() {
                return new Date();
            }

            public int amount() {
                return -amount;
            }
        };
        account.operations.add(operation);//добавляем эту операцию в список операций

    }

    }


