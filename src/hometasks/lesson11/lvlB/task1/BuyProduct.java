package hometasks.lesson11.lvlB.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class BuyProduct {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static Random random = new Random();

    public static void buySmth(BankAccount bankAccount) throws NotEnoughMoneyException {
        Double cost = generateCost();
        if (bankAccount.getBalance() < cost) {
            System.out.println("You tried buy something for " + cost + "$. You have only " + String.format("%,.2f", bankAccount.getBalance()) + "$ left");
            throw new NotEnoughMoneyException("Not enough money for that purchase");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() - cost);
            System.out.println("You bought something for " + cost + "$. You have " + String.format("%,.2f", bankAccount.getBalance()) + "$ left");
            // условие задачи: После каждой покупки выводить в консоль информацию о состоянии баланса.
        }
    }

    private static Double generateCost() {
        BigDecimal cost = BigDecimal.valueOf(random.nextDouble() * 95 + 5).setScale(2, RoundingMode.HALF_UP);
        return cost.doubleValue();
    }
}
