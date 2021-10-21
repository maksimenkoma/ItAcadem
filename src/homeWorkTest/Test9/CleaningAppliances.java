package homeWorkTest.Test9;

import java.util.Objects;

public class CleaningAppliances extends HomeAppliances {

    double batteryLife;
    int speedCleaning;

    public CleaningAppliances(String name, double power, double serviceTime, boolean mainsPower, double weight, double batteryLife, int speedCleaning) {
        super(name, power, serviceTime, mainsPower, weight);
        this.batteryLife = batteryLife;
        this.speedCleaning = speedCleaning;
    }

    public CleaningAppliances() {
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getSpeedCleaning() {
        return speedCleaning;
    }

    public void setSpeedCleaning(int speedCleaning) {
        this.speedCleaning = speedCleaning;
    }

    @Override
    public void plugIn() {
        System.out.println("Включаем в розетку "+getName() );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CleaningAppliances that = (CleaningAppliances) o;
        return Double.compare(that.batteryLife, batteryLife) == 0 && speedCleaning == that.speedCleaning;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryLife, speedCleaning);
    }

    @Override
    public String toString() {
        return "CleaningAppliances{" +
               "batteryLife=" + batteryLife +
               ", speedCleaning=" + speedCleaning +
               "} " + super.toString();
    }
}
