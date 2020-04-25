package lab15.abstracts;

public class Main {

    public static void main(String[] args) {


        AbstractCooker cooker1 = new Multicooker();

        cooker1.setName("Redmond multi");
        cooker1.powerOn();
        cooker1.powerOff();

        AbstractCooker cooker2 = new Oven();

        cooker2.setName("Redmond");
        cooker2.powerOn();
        cooker2.powerOff();

        Phone mobile = new Mobile();

        mobile.setName("Device");
        mobile.powerOn();
        mobile.call();
        mobile.powerOff();

        Phone diaPhone = new DiaPhone();

        diaPhone.setName("Panasonic");
        diaPhone.powerOn();
        diaPhone.call();
        diaPhone.powerOff();

        Mobile smartPhone = new SmartPhone();
        smartPhone.setName("Google Pixel");
        smartPhone.getDisplay();
        smartPhone.getSimCount();
        smartPhone.powerOn();
        smartPhone.call();
        smartPhone.powerOff();

    }
}
