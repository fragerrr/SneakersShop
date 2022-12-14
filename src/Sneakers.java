import java.io.Serial;
import java.io.Serializable;

public class Sneakers implements Serializable, Product {
    private int id;
    private String name;
    private int cost;
    private String color;
    private int size;
    private String gender;
    public Sneakers(){

    }
    public Sneakers(int id, String name, int cost, String color, int size, String gender){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.color = color;
        this.size = size;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender + '\n';
    }
}
