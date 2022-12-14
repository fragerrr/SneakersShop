
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewProduct extends Container {
    private JTextField id;
    private JTextField name;
    private JTextField cost;
    private JTextField color;
    private JTextField size;
    private JTextField gender;
    private JButton add;

    public NewProduct() {
        setSize(1000, 700);
        setLayout(null);

        id = new JTextField("ENTER ID");
        id.setBounds(325, 100, 400, 50);
        add(id);

        name = new JTextField("ENTER NAME");
        name.setBounds(325, 175, 400, 50);
        add(name);

        cost = new JTextField("ENTER COST");
        cost.setBounds(325, 250, 400, 50);
        add(cost);

        color = new JTextField("ENTER COLOR");
        color.setBounds(325, 325, 400, 50);
        add(color);

        size = new JTextField("ENTER SIZE");
        size.setBounds(325, 400, 400, 50);
        add(size);

        gender = new JTextField("ENTER GENDER");
        gender.setBounds(325, 475, 400, 50);
        add(gender);

        add = new JButton("ADD NEW PRODUCT");
        add.setBounds(325, 550, 400, 50);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id1 = Integer.parseInt(id.getText());
                String name1 = name.getText();
                int cost1 = Integer.parseInt(cost.getText());
                String color1 = color.getText();
                int size1 = Integer.parseInt(size.getText());
                String gender1 = gender.getText();

                boolean check = false;

                for (Product product : Main.shop.products) {
                    if (product.getId() == id1) {
                        check = true;
                    }
                }
                if (check) {
                    JOptionPane.showMessageDialog(null, "YOU'VE ENTERED WRONG DATA!");
                } else {
                    Main.shop.products.add(new Sneakers(id1, name1, cost1, color1, size1, gender1));
                    JOptionPane.showMessageDialog(null, "SUCCESFULLY!");
                }
                Main.WriteObject(Main.shop);
            }
        });
        add(add);

        JButton back = new JButton("BACK");
        back.setBounds(25,25,80,15);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.newProduct.setVisible(false);
                MainFrame.adminMenu.setVisible(true);
            }
        });
        add(back);
    }
}
