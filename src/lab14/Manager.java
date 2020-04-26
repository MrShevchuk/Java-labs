package lab14;

import java.util.Objects;

public class Manager extends Employee {

    String department;

    public Manager(String name, String birthday, String phoneNumber) {
        super(name, birthday, phoneNumber);
    }


    public void consult() {
        System.out.println("Manager consult customers about the product.");
    }

    public void tellAboutDiscounts() {
        System.out.println("Manager telling customers about the our company' discounts ");
    }

    public void advise () {
        System.out.println("Manager advise something.");
    }

    @Override
    public void doingWork (){
        super.doingWork();
        System.out.println("Doing manager work.");
    }

    @Override
    public void comeAtWork() {
        System.out.println("Manager:");
        super.comeAtWork();
    }

    @Override
    public void haveABreakfast() {
        System.out.println("Manager:");
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
        return "Manager{" +
                "department='" + department + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                ", isPresent=" + isPresent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }
}
