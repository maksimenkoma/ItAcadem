package homeWorkAssessment.Task6;

import java.util.Objects;

public class Flower {
    private String madeIn;
    private int shelfLife;
    private double price;
    private String color;

    public Flower(String madeIn, int shelfLife, double price, String color) {
        this.madeIn = madeIn;
        this.shelfLife = shelfLife;
        this.price = price;
        this.color = color;
    }

    public Flower() {
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return shelfLife == flower.shelfLife && Double.compare(flower.price, price) == 0 && Objects.equals(madeIn, flower.madeIn) && Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(madeIn, shelfLife, price, color);
    }

    @Override
    public String toString() {
        return "Flower{" +
               "madeIn='" + madeIn + '\'' +
               ", shelfLife=" + shelfLife +
               ", price=" + price +
               ", color='" + color + '\'' +
               '}';
    }
}

