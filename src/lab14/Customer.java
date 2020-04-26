package lab14;

import java.util.Objects;

public class Customer extends Human {

    int discount;
    double amountOfMoney;

    public Customer(String name,  String phoneNumber) {
        super(name, phoneNumber);
    }

    public void findOutAboutItem() {
        System.out.println("Check something about the product.");
    }

    public void buy() {
        System.out.println("Buy the product.");
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "discount=" + discount +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return discount == customer.discount &&
                Double.compare(customer.amountOfMoney, amountOfMoney) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount, amountOfMoney);
    }
}

