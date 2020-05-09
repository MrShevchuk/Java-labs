package lab17;

public class User {

    String login;
    String password;
    String name;
    EmployeePositions role;

    public User(String login, String password, String name, EmployeePositions role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
