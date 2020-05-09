package lab17;

import java.util.Arrays;

public class Store {

    String shopName;
    String url;
    EmployeePositions[] allUsers;
    String authorizedUser;

    public void login (String name, String password) {


    }

    public void getCurrentUserRights() {

        EmployeePositions employeePositions = EmployeePositions.ADMINISTRATOR;
        switch (employeePositions){
            case MANAGER:
                System.out.println();

        }
    }

    public void logout() {
        this.authorizedUser = null;
        System.out.println("Пользователь вышел из системы");

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
