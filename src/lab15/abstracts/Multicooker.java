package lab15.abstracts;

public class Multicooker extends AbstractCooker {

    protected void switchProgram (int button) {
        switchProgram(1);
        System.out.println("При нажатии разных кнопок на дисплее выбираем режим готовки.");
    }

    @Override
    public void cook() {
        System.out.println("Готовится еда.");
    }

    @Override
    public void powerOn() {
        System.out.println("Включаем мультиварку:");
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
