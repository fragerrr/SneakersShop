import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends Container {
    private JButton addNewAdmin;
    private JButton addNewProduct;

    public AdminMenu(){
        setSize(1000, 700);
        setLayout(null);

        addNewAdmin = new JButton("ADD NEW ADMIN");
        addNewAdmin.setBounds(300,225,400,50);
        addNewAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.adminMenu.setVisible(false);
                MainFrame.newAdmin.setVisible(true);
            }
        });
        add(addNewAdmin);

        addNewProduct = new JButton("ADD NEW PRODUCT");
        addNewProduct.setBounds(300, 300, 400, 50);
        addNewProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.adminMenu.setVisible(false);
                MainFrame.newProduct.setVisible(true);
            }
        });
        add(addNewProduct);

        JButton back = new JButton("BACK");
        back.setBounds(25,25,80,15);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.adminMenu.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });
        add(back);

    }
}
