package test;

public class Exceptions {

//        static void procedure() throws IllegalAccessException {
//            System.out.println(" inside procedure");
//            throw new IllegalAccessException("demo");
//        }
//        public static void main(String args[]) {
//            try {
//                procedure();
//            } catch (IllegalAccessException e) {
//                System.out.println("caught " + e);
//            }
//        }

    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("procA's finally");
        }
    }
    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        }
        finally {
            System.out.println("procB's finally");
        }
    }
    public static void main(String args[]) {
        try { procA(); }
        catch (Exception e) {
            procB();
        }
    }
}

