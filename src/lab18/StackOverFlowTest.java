package lab18;

public class StackOverFlowTest {

    static int count;

    static void test ()
    {
        System.out.println(count++);
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (StackOverflowError sofe) {
            System.out.println("Ошибка 'Рекурсия': " + sofe);
        }
    }
}

