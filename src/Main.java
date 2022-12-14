import java.io.*;
import java.util.Scanner;

public class Main {
    public static Shop shop = (Shop)ReadObject();
    static {
        Managers admin = new Managers("Dias", "1234");
        shop.users.add(admin);
    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        WriteObject(shop);
    }

    public static void WriteObject(Object object) {
        try {
            FileOutputStream fos = new FileOutputStream("shop.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(object);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object ReadObject() {
        Object object = new Object();
        try {
            FileInputStream fis = new FileInputStream("shop.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            object = ois.readObject();

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  object;
    }

    public static Shop getShop(){
        return shop;
    }
}
