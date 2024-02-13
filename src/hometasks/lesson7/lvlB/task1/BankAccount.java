package hometasks.lesson7.lvlB.task1;

import java.math.BigDecimal;

public class BankAccount {
    Transaction transaction = new Transaction();
    private final long accountId;
    private BigDecimal balance = BigDecimal.valueOf(0.0);

    BankAccount(AccountIdGen accountIdGen) {
        accountId = accountIdGen.nextAccountId;
        accountIdGen.generateNextAccountId();
    }

    public static class AccountIdGen {
        private long nextAccountId = 1;

        private void generateNextAccountId() {
            nextAccountId++;
        }
    }

    class Transaction {
        //Перевести деньги на другой счёт
        public void transferTo(BankAccount receiver, BigDecimal moneyAmount) {
            receiver.transaction.topUp(moneyAmount);
            balance = balance.add(moneyAmount.negate());
        }

        //Пополнить текущий счёт на сумму
        public void topUp(BigDecimal moneyAmount) {
            balance = balance.add(moneyAmount);
        }

        //Информация о текущем счёте
        public void accountInfo() {
            System.out.println("Owner account ID: " + accountId + '\n'
                    + "Account balance: " + balance);
        }

        //Снять со счёта сумму
        public void withdrawFromAccount(BigDecimal moneyAmount) {
            balance = balance.add(moneyAmount.negate());
        }
    }
}
