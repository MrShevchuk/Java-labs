package lab15.abstracts;

public class DiaPhone extends Phone{

    protected Boolean hasAnswerPhone;

    protected void powerOn() {

        System.out.println("Подключаем телефон к розетке. Передвигаем кнопку в положение" + " вкл.");

    }

    protected void powerOff() {

        System.out.println("Передвигаем кнопку в положение выкл и выключаем телефон с розетки." );

    }

    void call () {

        System.out.println("Поднимаем трубку, набираем номер, звоним.");

    }

    void  autoAnswer () {

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
}
