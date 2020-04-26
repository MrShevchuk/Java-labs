package lab15.abstracts;

public class Mobile extends Phone {

    protected Integer simCount;
    protected String display;

    protected void powerOn() {

        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается");

    }


    protected void powerOff() {

        System.out.println("Зажимаем кнопку выключения. Мобильный телефон выключается");

    }

    void call () {

        System.out.println("Выбираем контакт из меню, звоним");

    }

    public Integer getSimCount() {
        return simCount;
    }

    public void setSimCount(Integer simCount) {
        this.simCount = simCount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
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

