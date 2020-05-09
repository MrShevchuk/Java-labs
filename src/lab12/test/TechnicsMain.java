package lab12.test;

import lab12.technics.Passport;
import lab12.technics.PassportUtil;


public class TechnicsMain {

    public static void main(String[] args) {

        Passport asus = new Passport(123456, "monitor Asus with IPS screen and has diagonal 24' inhes", "black", "Indonesia");
        System.out.println("Item: " + asus);

        PassportUtil.warrantyReplace(asus);
    }
}