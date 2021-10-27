package homeWorkAssessment.Task6;

import java.util.Objects;

public class Rose extends Flower{

    private double length;

    public Rose(String madeIn, int shelfLife, double price, String color, double length) {
        super(madeIn, shelfLife, price, color);
        this.length = length;
    }

    public Rose(String madeIn, int shelfLife, double price, String color) {
        super(madeIn, shelfLife, price, color);
    }

    public Rose() {
    }

    public Rose(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return Double.compare(rose.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public String toString() {
        return "Rose{" +
               "length=" + length +
               "} " + super.toString();
    }
}
