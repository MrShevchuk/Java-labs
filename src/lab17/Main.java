package lab17;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("user1", "1230", "Ivan", EmployeePositions.ADMINISTRATOR);
        User user2 = new User("user2", "1234", "Alina", EmployeePositions.DIRECTOR);
        User user3 = new User("user3", "1235", "Senya", EmployeePositions.CLIENT);
        User user4 = new User("user4", "1236", "Vasily", EmployeePositions.ANONYMOUS);
        User user5 = new User("user5", "1237", "Anastasia", EmployeePositions.MANAGER);


        Store store = new Store("","","",EmployeePositions.ADMINISTRATOR);

        store.shopName = "Java shop";
        store.url = "687464";
        store.allUsers = new EmployeePositions[]{EmployeePositions.DIRECTOR, EmployeePositions.ADMINISTRATOR, EmployeePositions.CLIENT, EmployeePositions.MANAGER, EmployeePositions.ANONYMOUS};
        store.login("Ivan", "1230");
        store.getCurrentUserRights();
        store.logout();
        System.out.println(store);

    }

    public static void tryLogin (Store store) {

    }

}
