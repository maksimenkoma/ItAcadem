package homeWorkTest.Test9;

import java.util.Objects;

public class KitchenAppliances extends HomeAppliances{

    private double cookingSpeed;

    public KitchenAppliances(String name, double power, double serviceTime, boolean mainsPower, double weight, double cookingSpeed) {
        super(name, power, serviceTime, mainsPower, weight);
        this.cookingSpeed = cookingSpeed;
    }

    public KitchenAppliances(double cookingSpeed) {
        this.cookingSpeed = cookingSpeed;
    }

    public KitchenAppliances() {
    }

    public KitchenAppliances(String s) {
    }

    public double getCookingSpeed() {
        return cookingSpeed;
    }

    public void setCookingSpeed(double cookingSpeed) {
        this.cookingSpeed = cookingSpeed;
    }

    @Override
    public void plugIn() {
        System.out.println("включаем в розетку "+ getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        KitchenAppliances that = (KitchenAppliances) o;
        return Double.compare(that.cookingSpeed, cookingSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cookingSpeed);
    }

    @Override
    public String toString() {
        return "KitchenAppliances{" +
               "cookingSpeed=" + cookingSpeed +
               "} " + super.toString();
    }

}
