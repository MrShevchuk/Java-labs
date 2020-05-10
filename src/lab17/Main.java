package lab17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user1 = new Store("user1", "1230", "Ivan", EmployeePositions.ADMINISTRATOR);
        User user2 = new Store("user2", "1234", "Alina", EmployeePositions.DIRECTOR);
        User user3 = new Store("user3", "1235", "Senya", EmployeePositions.CLIENT);
        User user4 = new Store("user4", "1236", "Vasily", EmployeePositions.ANONYMOUS);
        User user5 = new Store("user5", "1237", "Anastasia", EmployeePositions.MANAGER);


        Store store = new Store(user1, user2, user3, user4, user5);

        store.shopName = "Starbucks";
        store.url = "https://www.starbucks.com/";
        store.allUsers = new EmployeePositions[]{EmployeePositions.DIRECTOR, EmployeePositions.ADMINISTRATOR, EmployeePositions.CLIENT, EmployeePositions.MANAGER, EmployeePositions.ANONYMOUS};
        tryLogin(store);
        if (Store.login("user2", "1234")) {
            System.out.println("Loading...");
            store.getCurrentUserRights();
            System.out.println("User's finished his work.");
            store.logout();

        } else {
            System.out.println("Wrong login or password.");
        }

//        Store.login("user2", "1234");
//            System.out.println("Loading...");
//            store.getCurrentUserRights();
//            System.out.println("User's finished his work.");
//            store.logout();
//            System.out.println("Wrong login or password.");

        System.out.println(store);

        tryLogin(store);
    }

    public static void tryLogin(Store store) {

//        System.out.println("Введите логин");
//        Scanner sc = new Scanner(store.login);
//        String login = sc.next(store.login);
//        System.out.println("Введите пароль");
//        String pass = sc.next(store.password);
//        System.out.println(login + pass);
    }

}
