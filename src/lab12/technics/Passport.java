package lab12.technics;

import java.util.Date;


/**
 *  Паспорт на технику.
 */

public class Passport {

    int number;
    String description;
    String color;
    String country;
    Date warrantyStartDate;

    public Passport(int number, String description, String color, String country) {
        this.number = number;
        this.description = description;
        this.color = color;
        this.country = country;
        this.warrantyStartDate = new Date();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", warrantyStartDate='" + warrantyStartDate + '\'' +
                '}';
    }
}