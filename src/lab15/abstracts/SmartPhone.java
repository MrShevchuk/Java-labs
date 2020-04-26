package lab15.abstracts;

import lab15.intefaces.Caller;
import lab15.intefaces.EmailSender;

public class SmartPhone extends  Mobile implements Caller, EmailSender {

    private String os;


    public void runApp () {
        System.out.println("Run");
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void powerOn() {
        System.out.println("Запускаем смартфон:");
        super.powerOn();
    }

    @Override
    protected void powerOff() {
        super.powerOff();
    }

    @Override
    public Integer getSimCount() {
        return super.getSimCount();
    }

    @Override
    public void setSimCount(Integer simCount) {
        super.setSimCount(simCount);
    }

    @Override
    public String getDisplay() {
        return super.getDisplay();
    }

    @Override
    public void setDisplay(String display) {
        super.setDisplay(display);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Integer getSerialNumber() {
        return super.getSerialNumber();
    }

    @Override
    public void setSerialNumber(Integer serialNumber) {
        super.setSerialNumber(serialNumber);
    }

    @Override
    public String editMail(String mail) {
        return null;
    }

    @Override
    public String createMail(String mail) {
        return mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отправляем письмо со смартфона: " + mail);

    }

    @Override
    public void call() {
        System.out.println("Звоним со сматрфона");
    }
}
