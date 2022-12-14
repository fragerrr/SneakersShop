import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    public MainMenu(){
        setSize(1000,700);
        setLayout(null);

        JLabel welcome = new JLabel("WELCOME TO OUR SHOP");
        welcome.setBounds(415,175,400,50);
        add(welcome);

        JTextField log = new JTextField("ENTER LOGIN");
        log.setBounds(300, 250, 400, 50);
        add(log);

        JTextField pass = new JPasswordField("ENTER PASS");
        pass.setBounds(300,325,400,50);
        add(pass);

        JButton signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 400, 175, 50);
        add(signUp);

        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = log.getText();
                String password = pass.getText();
                boolean check = false;
                for( User user : Main.shop.users){
                    if(login.equalsIgnoreCase(user.getLogIn()) && password.equalsIgnoreCase(user.getPass())){
                        check = true;
                    }
                }
                if(!check) {
                    Main.shop.users.add(new Client(login,password));
                    JOptionPane.showMessageDialog(null,"SUCCESFULLY");
                }else {
                    JOptionPane.showMessageDialog(null,"YOU'VE ENTERED WRONG DATA");
                }
                Main.WriteObject(Main.shop);
            }
        });

        JButton signIn = new JButton("SIGN IN");
        signIn.setBounds(525,400, 175,50);
        add(signIn);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = log.getText();
                String password = pass.getText();
                for( User user : Main.shop.users){
                    if(login.equalsIgnoreCase(user.getLogIn()) && password.equalsIgnoreCase(user.getPass())){
                        if(user instanceof Managers) {
                            MainFrame.mainMenu.setVisible(false);
                            MainFrame.adminMenu.setVisible(true);
                        }
                        if(user instanceof Client){
                            MainFrame.mainMenu.setVisible(false);
                            MainFrame.clientMenu.setVisible(true);
                        }
                    }
                }

            }
        });




    }

}

