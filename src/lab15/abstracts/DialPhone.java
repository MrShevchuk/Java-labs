package lab15.abstracts;

import lab15.intefaces.Caller;

public class DialPhone extends Phone implements Caller {

    private Boolean hasAnswerPhone;


    @Override
    public void powerOn() {
        System.out.println("Звоним с стационарного телефона: \nПодключаем телефон к розетке. Передвигаем кнопку в положение" + " вкл.");
    }

    @Override
    protected void powerOff() {
        System.out.println("Передвигаем кнопку в положение выкл и выключаем телефон с розетки." );
    }

    public void  autoAnswer() {
        System.out.println("Для уведомления о пропущенных сообщениях нажимаем на кнопку AutoAnswer");
    }


    public Boolean getHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(Boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
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
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }
}
