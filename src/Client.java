import kuchner.homework.finance.Bank;

public abstract class Client {
    public String name;
    public int age;
    public int salary;

    public Client(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract int calcSavings(Bank bank, int years);

}

