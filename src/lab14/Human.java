package lab14;

import java.util.Objects;

public class Human {

    String name;
    String birthday;
    String phoneNumber;


    public Human(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }



    public void sayHello(){
        System.out.println("Hello everybody");

    }

    public void sayGoodbye(){
        System.out.println("Goodbye");

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return phoneNumber == human.phoneNumber &&
                Objects.equals(name, human.name) &&
                Objects.equals(birthday, human.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, phoneNumber);
    }
}
