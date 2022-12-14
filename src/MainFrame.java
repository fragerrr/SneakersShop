import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public static AdminMenu adminMenu;
    public static NewAdmin newAdmin;
    public static NewProduct newProduct;
    public static ClientMenu clientMenu;
    public MainFrame(){
        setBounds(275,75,1000, 700);
        setLayout(null);
        setTitle("SneakersShop - S&S");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainMenu = new MainMenu();
        add(mainMenu);

        adminMenu = new AdminMenu();
        adminMenu.setVisible(false);
        add(adminMenu);

        newAdmin = new NewAdmin();
        newAdmin.setVisible(false);
        add(newAdmin);

        newProduct = new NewProduct();
        newProduct.setVisible(false);
        add(newProduct);

        clientMenu = new ClientMenu();
        clientMenu.setVisible(false);
        add(clientMenu);

    }

}
