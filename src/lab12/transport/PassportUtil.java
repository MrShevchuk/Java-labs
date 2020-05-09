package lab12.transport;

/**
 *  Утилита к паспорту на транспортное средство.
 */

public class PassportUtil {

    private PassportUtil() {
        System.out.println("Закрытый конструктор");
    }

    public static Passport changeOwner (Passport mercedes, String ownerName){

        Passport m = new Passport(98746, "Mercedes CLA", "white", 20, "Slava");
        System.out.println("new owner Mercedes " + ownerName);
        System.out.println("Transport: " + m);
        return m;
    }
}