package lab14;

public class Employee extends Human {

    String hireDate;
    double salary;
    boolean isPresent;

    public Employee(String name, String birthday, String phoneNumber) {
        super(name, phoneNumber);
    }


    public void comeAtWork () {
        System.out.println("Came at work.");
    }

    public void haveABreakfast() {
        System.out.println("Having a dinner.");
    }

    public void doingWork() {
        System.out.println();
    }

}
