package lab17;

public class User {

    public String login;
    public String password;
    public String name;
    public EmployeePositions role = EmployeePositions.ANONYMOUS;

    public User(String login, String password, String name, EmployeePositions role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public static User [] userList(User... users) {
        for (User user : users) {
        }
        return users;
    }

    public User(User user1, User user2, User user3, User user4, User user5) {
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeePositions getRole() {
        return role;
    }

    public void setRole(EmployeePositions role) {
        this.role = role;
    }


    public void setAllUsers(User[] userList) {
    }
}
