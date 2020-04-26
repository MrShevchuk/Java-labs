package lab14;

public class ShopTest {

    public static void main(String[] args) {

        Shop shop = new Shop();
        Employee manager = new Manager("Slava", "04/03/95", "0999074918");
        Employee cashier = new Cashier("Svetlana", "12/09/75", "0665404654");
        Employee security = new Security("Ivan", "4/5/92", "0674532532");
        Customer customer = new Customer("Elizaveta", "0957569578");


        //first chain:

        shop.adress = "Soborny Avenue";
        shop.openShop();
        manager.comeAtWork();
        cashier.comeAtWork();
        security.comeAtWork();


        // second chain:

        shop.doingWork();
        customer.sayHello();
        customer.findOutAboutItem();
        manager.doingWork();
        customer.buy();
        cashier.doingWork();
        security.doingWork();


        // third chain:

        shop.closeShop();
        manager.haveABreakfast();
        security.haveABreakfast();
        cashier.haveABreakfast();






    }

}
