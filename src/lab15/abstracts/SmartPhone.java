package lab15.abstracts;

public class SmartPhone extends  Mobile{

    private String os;

    public void runApp () {

        System.out.println("Для запуска нужного приложения выбираем его из списка на дисплее телефон и нажимаем на его иконку");

    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    protected void powerOn() {
        super.powerOn();
    }

    @Override
    protected void powerOff() {
        super.powerOff();
    }

    @Override
    void call() {
        super.call();
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
}
