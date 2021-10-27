package homeWorkAssessment.Task6;

import java.util.Objects;

public class Orchid extends Flower {

    private int lifeExpectancyOfDays;

    public Orchid(String madeIn, int shelfLife, double price, String color, int lifeExpectancyOfDays) {
        super(madeIn, shelfLife, price, color);
        this.lifeExpectancyOfDays = lifeExpectancyOfDays;
    }

    public Orchid(String madeIn, int shelfLife, double price, String color) {
        super(madeIn, shelfLife, price, color);
    }

    public Orchid() {
    }

    public Orchid(int lifeExpectancyOfDays) {
        this.lifeExpectancyOfDays = lifeExpectancyOfDays;
    }

    public int getLifeExpectancyOfDays() {
        return lifeExpectancyOfDays;
    }

    public void setLifeExpectancyOfDays(int lifeExpectancyOfDays) {
        this.lifeExpectancyOfDays = lifeExpectancyOfDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orchid orchid = (Orchid) o;
        return lifeExpectancyOfDays == orchid.lifeExpectancyOfDays;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifeExpectancyOfDays);
    }

    @Override
    public String toString() {
        return "Orchid{" +
               "lifeExpectancyOfDays=" + lifeExpectancyOfDays +
               "} " + super.toString();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
