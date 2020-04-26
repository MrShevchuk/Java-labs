package lab15.abstracts;

public abstract class AbstractDevice {

   private String name;
   private Integer serialNumber;


    protected abstract void powerOn ();
    protected abstract void powerOff ();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

}
