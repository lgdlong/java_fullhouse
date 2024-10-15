package Test;

public class Dog extends Cat {
    private String color;

    public Dog () {

    }

    public Dog(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Dog [color=%s]", color);
    }
}
