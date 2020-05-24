package lab13;

/**
 * Work with Wrappers.
 * Create variables and initialize them different ways.
 */

public class WrapperTest {

        public static void main(String[] args) {

            Integer i1 = 10;
            Integer i2 = Integer.valueOf(10);
            Integer i3 = new Integer(10);
            Integer i4 = Integer.parseInt("10");

            Double d = 44.4;
            byte b = d.byteValue();
            short s = d.shortValue();
            int i = d.intValue();
            float f = d.floatValue();
            long l = d.longValue();

            /**
             * Create and check variable "Is NaN or Infinite".
             */

            Double d2 = 0.0;
            Double nanValue = d2/d;
            Double infinityValue = d2/d2;

            System.out.println(nanValue);
            System.out.println(infinityValue);

            if (Double.isNaN(infinityValue)){
                System.out.println("Variable " + infinityValue + " = NaN");
            }

            if (Double.isInfinite(nanValue)) {
                System.out.println("Variable " + nanValue + " = Infinity");
            }

            if (Double.isNaN(nanValue)) {
                System.out.println("Variable " + infinityValue + " = NaN");
            }

            if (Double.isInfinite(infinityValue)) {
                System.out.println("Variable " + nanValue + " = Infinity");
            }

            Long l1 = 1200L;
            Long l2 = 1200L;

            System.out.println(l1.equals(l2));
            System.out.println(l1==l2);
        }
    }

