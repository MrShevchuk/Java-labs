package lab12.test;

import lab12.transport.Passport;
import lab12.transport.PassportUtil;

public class TransportMain {

    public static void main(String[] args) {

        Passport mercedes = new lab12.transport.Passport(98746, "Mercedes CLA", "white",5,"Nastya");
        System.out.println("Nastya car: " + mercedes);

        PassportUtil.changeOwner(mercedes, "is Slava.");
    }

}