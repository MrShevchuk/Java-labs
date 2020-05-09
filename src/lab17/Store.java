package lab17;

import java.util.Arrays;

public class Store extends User {

    String shopName;
    String url;
    EmployeePositions[] allUsers;
    String authorizedUser;

    public Store(String login, String password, String name, EmployeePositions role) {
        super(login, password, name, role);
    }


    public void login (String name, String password) {
        super.name = name;
        super.password = password;

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
        }
    }


    public void logout() {
        this.authorizedUser = null;
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
        this.authorizedUser = authorizedUser;
    }

    @Override
    public String toString() {
        return "Store{" +
                "shopName='" + shopName + '\'' +
                ", url='" + url + '\'' +
                ", allUsers=" + Arrays.toString(allUsers) +
                ", authorizedUser='" + authorizedUser + '\'' +
                '}';
    }
}
