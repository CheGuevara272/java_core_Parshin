package hometasks.lesson11.lvlB.task1;

import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        while (true) {
            try {
                BuyProduct.buySmth(myBankAccount);
                TimeUnit.SECONDS.sleep(1);
            } catch (NotEnoughMoneyException e) {
                System.err.println(e.getMessage());
                break;
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
