package pojo;

import java.io.Serializable;

public class Paper implements Serializable {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "size=" + size +
                '}';
    }

    public Paper() {
    }

    public Paper(int size) {

        this.size = size;
    }
}
