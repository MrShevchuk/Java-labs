package lab15.abstracts;

public class Oven extends AbstractCooker {

    void initTimer (int handle) {
        this.initTimer(1);
        System.out.println("Выставляем ручку таймера на нужное нам время.");

    }

    public void cook(){

        System.out.println("Готовится еда.");

    }


    @Override
    protected void powerOn() {
        System.out.println("Включаем духовку:");
        super.powerOn();
    }

    @Override
    protected void powerOff() {
        super.powerOff();
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
