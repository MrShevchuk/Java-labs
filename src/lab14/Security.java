package lab14;

public class Security extends Employee {


    public Security(String name, String birthday, String phoneNumber) {
        super(name, birthday, phoneNumber);
    }

    public void speakTransmitter () {
        System.out.println("The security speaks on the walkie-talkie.");
    }

    @Override
    public void doingWork () {
        super.doingWork();
        System.out.println("The guard keeps order.");
    }

    @Override
    public void comeAtWork() {
        System.out.println("Guard:");
        super.comeAtWork();
    }

    @Override
    public void haveABreakfast() {
        System.out.println("Guard:");
        super.haveABreakfast();
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayGoodbye() {
        super.sayGoodbye();
    }

    @Override
    public String toString() {
        return "Security{" +
                "hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                ", isPresent=" + isPresent +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}
