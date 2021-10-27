package homeWorkAssessment.Task6;

import java.util.Objects;

public class Tulips extends Flower{

    private String weight;

    public Tulips(String madeIn, int shelfLife, double price, String color, String weight) {
        super(madeIn, shelfLife, price, color);
        this.weight = weight;
    }

    public Tulips(String madeIn, int shelfLife, double price, String color) {
        super(madeIn, shelfLife, price, color);
    }

    public Tulips(String weight) {
        this.weight = weight;
    }

    public Tulips() {
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tulips tulips = (Tulips) o;
        return Objects.equals(weight, tulips.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Tulips{" +
               "weight='" + weight + '\'' +
               "} " + super.toString();
    }
}
