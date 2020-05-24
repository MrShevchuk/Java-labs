package lab17;

import lab14.Employee;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            User user1 = new User("user1", "1234", "Slava", EmployeePositions.DIRECTOR);
            User use2 = new User("user2", "1233", "Nastya", EmployeePositions.ADMINISTRATOR);
            User use3 = new User("user3", "1232", "Roman", EmployeePositions.MANAGER);
            User use4 = new User("user4", "1231", "Alina", EmployeePositions.CLIENT);
            User use5 = new User("user5", "1230", "Michael", EmployeePositions.ANONYMOUS);

            Store store = new Store("Starbucks", "https://www.starbucks.com/");
            store.setUsers(Store.userList(user1, use2, use3, use4, use5));
            for (; ; ) tryLogin(store);
        }

        static void tryLogin(Store store) {

            System.out.println("Enter login: ");
            Scanner inputLogin = new Scanner(System.in);
            Scanner inputPassword = new Scanner(System.in);
            String login = inputLogin.nextLine();
            System.out.println("Enter password: ");
            String password = inputPassword.nextLine();

            if (store.login(login, password)) {
                store.getCurrentUserRights();
                store.logout();
            }
        }
    }


