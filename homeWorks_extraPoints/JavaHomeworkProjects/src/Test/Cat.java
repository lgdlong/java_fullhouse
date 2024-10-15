package Test;

public class Cat {
    private String sound;
    private double weight;

    public Cat() {
    }

    public Cat(String sound, double weight) {
        this.sound = sound;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Cat [sound=%s, weight=%f]", sound, weight);
    }
}
