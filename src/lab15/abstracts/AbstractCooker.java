package lab15.abstracts;

public abstract class AbstractCooker extends AbstractDevice {

    @Override
    public void powerOn() {
        System.out.println("Втыкаем вилку в розетку, печь включается.");
    }

    @Override
    protected void powerOff(){
        System.out.println("Печь выключается.");
    }

    abstract void cook ();

}
