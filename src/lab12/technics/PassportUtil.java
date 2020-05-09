package lab12.technics;

/**
 *  Утилита к паспорту на технику.
 */

import java.util.Date;

public class PassportUtil {

    private PassportUtil() {
        System.out.println("Закрытый конструктор");
    }

    public static void warrantyReplace(Passport asus) {

        Date warrantyStartDate = new Date();
        System.out.println( "Need to warranty replace: " + warrantyStartDate + " or 14 days later.");

    }
}