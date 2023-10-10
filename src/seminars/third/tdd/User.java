package seminars.third.tdd;

public class User {

    public String name;
    public String password;

    public boolean isAuthenticated;
    public boolean isAdmin;

    public User(String name, String password, boolean isAdmin, boolean isAuthenticated) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isAuthenticated = isAuthenticated;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}