package lab12.citizen;

/**
 *  Утилита для паспорта гражданина:
 */

public class PassportUtil {

    private PassportUtil() {
        System.out.println("Закрытый конструктор");
    }

    public static void marriageRegistrate (Passport husband, Passport wife) {

        husband.setSpouseId(wife.getId());
        wife.setSpouseId(husband.getId());

        System.out.println("spouse Id for Nastya: " + husband.getSpouseId());
        System.out.println("spouse Id for Slava: " + wife.getSpouseId());

    }
}