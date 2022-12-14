import java.io.Serializable;

public class Managers implements Serializable, User {
    private String login;
    private String pass;
    public Managers(){

    }

    public Managers( String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getPass(){
        return this.pass;
    }

    @Override
    public String getLogIn() {
        return this.login;
    }

    @Override
    public String toString() {
        return "Managers{" +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
