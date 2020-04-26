package lab14;

import java.util.Objects;

public class Shop {

    String name = "24/7";
    String adress = "Soborny Avenue";
    String manager;
    String cashier;
    String security;
    String customer;


    public void openShop () {
        System.out.println("The shop is opening.");
    }

    public void doingWork () {
        System.out.println("The shop is ON");
    }

    public void closeShop () {
        System.out.println("Shop is closed for dinner");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", manager='" + manager + '\'' +
                ", cashier='" + cashier + '\'' +
                ", security='" + security + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(adress, shop.adress) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(security, shop.security) &&
                Objects.equals(customer, shop.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress, manager, cashier, security, customer);
    }
}
