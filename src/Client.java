import java.io.Serializable;
import java.text.CollationKey;

public class Client implements Serializable, User {
    private String login;
    private String pass;

    public Client() {

    }

    public Client(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogIn() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
