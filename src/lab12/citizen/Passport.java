package lab12.citizen;

import java.util.Objects;

/**
 *  Паспорт гражданина.
 */

public class Passport {

    int id;
    String name;
    String city;
    int age;
    String registration;
    int spouseId;

    public Passport(int id, String name, String city, int age, String registration) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.registration = registration;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", city = '" + city + '\'' +
                ", age = " + age + " years old" +
                ", registration = '" + registration + '\'' +
                ", spouseId = '" + spouseId + '\'' +
                '}';
    }
}
