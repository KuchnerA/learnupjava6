import kuchner.homework.finance.Bank;
import kuchner.homework.finance.JavaBank;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Saver("Maxim", 26, 30_000);

        Client client2 = new Splitter("Alex", 35, 40_000);

        Bank bank = new JavaBank();

        compare(client1, client2, bank, 34);

    }

    public static void compare(Client client1, Client client2, Bank bank, int years) {

        int amount = client1.calcSavings(bank, 34) - client2.calcSavings(bank, 34);   //amount_RUB

        System.out.println("Разность сумм накоплений: " + amount + " RUB");
    }
}
