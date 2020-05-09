package lab12.transport;

/**
 *  Паспорт на транспортное средство.
 */

public class Passport {

    int number;
    String autoName;
    String color;
    int registrationDate;
    String ownerName;


    public Passport(int number, String autoName, String color, int registrationDate, String ownerName) {
        this.number = number;
        this.autoName = autoName;
        this.color = color;
        this.registrationDate = registrationDate;
        this.ownerName = ownerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number = " + number +
                ", autoName = '" + autoName + '\'' +
                ", color = '" + color + '\'' +
                ", registrationDate = " + registrationDate + " March" +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}