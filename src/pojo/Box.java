package pojo;

import java.io.Serializable;

public class Box implements Serializable {
    private String color;

    public Box() {
    }

    public Box(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
