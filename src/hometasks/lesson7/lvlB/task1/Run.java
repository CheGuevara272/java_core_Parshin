package hometasks.lesson7.lvlB.task1;

import java.math.BigDecimal;

/*Создать класс BankAccount, который представляет банковский счет. Каждый банковский счет имеет
уникальный номер и баланс. Класс BankAccount должен содержать внутренний класс Transaction,
который представляет транзакцию на счете. Внутренний класс Transaction должен иметь методы для
пополнения счёта и снятия средств с баланса, а также для получения информации о текущем балансе.*/

public class Run {
    public static void main(String[] args) {
        BankAccount.AccountIdGen accountIdGen = new BankAccount.AccountIdGen();
        BankAccount ivanov = new BankAccount(accountIdGen);
        BankAccount petrov = new BankAccount(accountIdGen);


        ivanov.transaction.topUp(BigDecimal.valueOf(200.05));
        ivanov.transaction.accountInfo();

        petrov.transaction.accountInfo();

        ivanov.transaction.transferTo(petrov, BigDecimal.valueOf(103.87));

        petrov.transaction.accountInfo();
        ivanov.transaction.accountInfo();

        ivanov.transaction.withdrawFromAccount(BigDecimal.valueOf(50));
        ivanov.transaction.accountInfo();
    }
}
