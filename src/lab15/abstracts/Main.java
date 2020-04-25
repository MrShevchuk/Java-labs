package lab15.abstracts;

public class Main {

    public static void main(String[] args) {


        AbstractCooker cooker1 = new Multicooker();
        cooker1.powerOn();
        cooker1.cook();
        cooker1.powerOff();

        AbstractCooker cooker2 = new Oven();
        cooker2.powerOn();
        cooker2.cook();
        cooker2.powerOff();


        Phone mobile = new Mobile();
        mobile.powerOn();
        mobile.call();
        mobile.powerOff();

        Phone dialPhone = new DialPhone();
        dialPhone.powerOn();
        dialPhone.call();
        dialPhone.powerOff();

        Mobile smartPhone = new SmartPhone();
        smartPhone.getDisplay();
        smartPhone.getSimCount();
        smartPhone.powerOn();
        smartPhone.call();
        smartPhone.powerOff();

    }
}
