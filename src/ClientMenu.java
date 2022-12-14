import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMenu extends Container {
    private JTextArea catalog;
    private JButton buy;
    private JTextField id;

    public ClientMenu(){
        setSize(1000,700);
        setLayout(null);

        catalog = new JTextArea();
        catalog.setBounds(200, 100,600,400);
        catalog.setText(Main.shop.products.toString());
        add(catalog);

        id = new JTextField("ENTER ID FOR BUY");
        id.setBounds(300,525,400,50);
        add(id);

        buy = new JButton("BUY");
        buy.setBounds(300,575,400,50);
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean check = false;
                int id1 = Integer.parseInt(id.getText());
                for(Product product : Main.shop.products){
                    if(product.getId() == id1){
                        check = true;
                        JOptionPane.showMessageDialog(null, "SUCCESFULLY!");
                    }
                }
                if(!check){
                    JOptionPane.showMessageDialog(null,"YOU'VE ENTERED WRONG DATA");
                }
                Main.WriteObject(Main.shop);
                MainFrame.clientMenu.setVisible(false);
                MainFrame.clientMenu.setVisible(true);
            }
        });
        add(buy);

        JButton back = new JButton("BACK");
        back.setBounds(25,25,80,15);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.clientMenu.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });
        add(back);
    }
}
