package accounts;

public class Accounts {

    public static final class Account{
        private float money;
        private String name;

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Account [] accounts = new Account[5];

        accounts[0] = new Account();
        accounts[0].setName("Homer Simpson");
        accounts[0].setMoney(500);


        accounts[1] = new Account();
        accounts[1].setName("Marsh Simpson");
        accounts[1].setMoney(1000);


        accounts[2] = new Account();
        accounts[2].setName("Bard Simpson");
        accounts[2].setMoney(300);


        accounts[3] = new Account();
        accounts[3].setName("Magy Simpson");
        accounts[3].setMoney(200);


        accounts[4] = new Account();
        accounts[4].setName("Lisa Simpson");
        accounts[4].setMoney(100);

        for (int i = 0; i<accounts.length; i++){
            float currentmoney = accounts[i].getMoney();//берем текущее кол-во денег на счету
            currentmoney = currentmoney + currentmoney * 0.1f;//увеличили текущее кол-во денег на счету на 10%
            accounts[i].setMoney(currentmoney);//присваиваем это значение переменной означающий счет

            }
            //убедимся что деньги начислены правильно
            for (int i = 0; i<accounts.length; i++){
                System.out.println("Name " + accounts[i].getName() + "money " + accounts[i].getMoney());
        }
    }
}
