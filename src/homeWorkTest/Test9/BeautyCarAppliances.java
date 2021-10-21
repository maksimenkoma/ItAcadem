package homeWorkTest.Test9;

import java.util.Objects;

public class BeautyCarAppliances extends HomeAppliances{

    private double cordLength;
    private int speed;

    public BeautyCarAppliances(String name, double power, double serviceTime, boolean mainsPower, double weight, double cordLength, int speed) {
        super(name, power, serviceTime, mainsPower, weight);
        this.cordLength = cordLength;
        this.speed = speed;
    }

    public BeautyCarAppliances(double cordLength, int speed) {
        this.cordLength = cordLength;
        this.speed = speed;
    }

    public BeautyCarAppliances() {
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void plugIn() {
        System.out.println("Включаем в резектку "+getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BeautyCarAppliances that = (BeautyCarAppliances) o;
        return Double.compare(that.cordLength, cordLength) == 0 && speed == that.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cordLength, speed);
    }

    @Override
    public String toString() {
        return "BeautyCarAppliances{" +
               "cordLength=" + cordLength +
               ", speed=" + speed +
               "} " + super.toString();
    }
}
