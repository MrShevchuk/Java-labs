package lab14;

import java.util.Objects;

public class Cashier extends Employee {

    String cashDeskNumber;

    public Cashier(String name, String birthday, String phoneNumber) {
        super(name, birthday, phoneNumber);
    }

    public void cashCount() {
        System.out.println("Counting the cash");
    }

    @Override
    public void doingWork () {
        super.comeAtWork();
        System.out.println("Doing cashier work");
    }

    @Override
    public void comeAtWork() {
        System.out.println("Cashier:");
        super.comeAtWork();
    }

    @Override
    public void haveABreakfast() {
        System.out.println("Cashier:");
        super.haveABreakfast();
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayGoodbye() {
        super.sayGoodbye();
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cashDeskNumber='" + cashDeskNumber + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                ", isPresent=" + isPresent +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cashier)) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return Objects.equals(cashDeskNumber, cashier.cashDeskNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashDeskNumber);
    }
}
