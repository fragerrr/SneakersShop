import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAdmin extends Container {
    private JTextField log;
    private JTextField pass;
    private JButton signUp;
    public NewAdmin(){
        setSize(1000,700);
        setLayout(null);

        log = new JTextField("ENTER LOGIN");
        log.setBounds(300,175,400,50);
        add(log);

        pass = new JPasswordField("ENTER PASSWORD");
        pass.setBounds(300, 250, 400, 50);
        add(pass);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 325, 400 ,50);
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String login = log.getText();
                String password = pass.getText();
                boolean check = false;

                for (User user : Main.shop.users) {
                    if (user.getLogIn().equalsIgnoreCase(login)) {
                        check = true;
                    }
                }
                if (check) {
                    JOptionPane.showMessageDialog(null,"YOU'VE ENTERED WRONG DATA!");
                }else{
                    Main.shop.users.add(new Managers(login, password));
                    JOptionPane.showMessageDialog(null,"SUCCESFULLY!");
                }
                Main.WriteObject(Main.shop);
            }
        });
        add(signUp);

        JButton back = new JButton("BACK");
        back.setBounds(25,25,80,15);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.newAdmin.setVisible(false);
                MainFrame.adminMenu.setVisible(true);
            }
        });
        add(back);

    }
}
