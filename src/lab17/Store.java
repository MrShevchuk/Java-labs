package lab17;

import java.util.Arrays;

public class Store extends User {

    String shopName;
    String url;
    EmployeePositions[] allUsers;
    static String authorizedUser;



    public Store(String login, String password, String name, EmployeePositions role) {
        super(login, password, name, role);
    }

    public Store(User user1, User user2, User user3, User user5, User user4) {
        super(user1, user2, user3, user4, user5);
    }

    public static boolean login (String login, String password){

        for (EmployeePositions pos:EmployeePositions.values()) {
            if (!login.equals(pos.name()) && !password.equals(pos.name())) {
                System.out.println("Login or password aren't correct.");
            } else {
                login = authorizedUser;
                System.out.println("Authorisation's complete.");
            }

//            if (password != pos.name()) {
//                System.out.println("Password isn't correct.");
//            } else {
//                password = authorizedUser;
//                System.out.println("Authorisation's complete.");
//            }
        }

        return false;
    }

    public void getCurrentUserRights() {

        switch (getRole()) {
            case ANONYMOUS:
                System.out.println("Анонимный пользователь, может покупать товары и/или авторизоваться");
                break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами");
                break;
            case CLIENT:
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                break;
            case DIRECTOR:
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
                break;
            case ADMINISTRATOR:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            default:
                System.out.println("Error");
        }
    }


    public void logout() {
        authorizedUser = null;
        System.out.println("Пользователь вышел из системы");

    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EmployeePositions[] getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(EmployeePositions[] allUsers) {
        this.allUsers = allUsers;
    }

    public String getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(String authorizedUser) {
        Store.authorizedUser = authorizedUser;
    }

    @Override
    public String toString() {
        return "Store{" +
                "shopName='" + shopName + '\'' +
                ", url='" + url + '\'' +
                ", allUsers=" + Arrays.toString(allUsers) +
                ", authorizedUser='" + authorizedUser + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}


