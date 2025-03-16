package votingsystem.model;

public class Login_Logout {

    private int id;
    private int email;
    private String password;
    private int login_id;


    public Login_Logout(){}

    public Login_Logout(int email, int id, int login_id, String password) {
        this.email = email;
        this.id = id;
        this.login_id = login_id;
        this.password = password;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogin_id() {
        return login_id;
    }

    public void setLogin_id(int login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login_Logout{" +
                "email=" + email +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", login_id=" + login_id +
                '}';
    }
}
