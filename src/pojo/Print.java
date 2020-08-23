package pojo;

import java.io.Serializable;

public class Print implements Serializable {
    private Box box;
    private Paper paper;

    public void work(){
        System.out.println("打印");
    }

    @Override
    public String toString() {
        return "Print{" +
                "box=" + box +
                ", paper=" + paper +
                '}';
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Print() {

    }

    public Print(Box box, Paper paper) {

        this.box = box;
        this.paper = paper;
    }
}
