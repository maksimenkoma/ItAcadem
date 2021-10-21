package homeWorkTest.Test9;

import java.util.Objects;

public class HomeAppliances {
    private String name;
    private double power;
    private double serviceTime;
    private boolean mainsPower ;
    private double weight;

    public HomeAppliances(String name, double power, double serviceTime, boolean mainsPower, double weight) {
        this.name = name;
        this.power = power;
        this.serviceTime = serviceTime;
        this.mainsPower = mainsPower;
        this.weight = weight;
    }

    public HomeAppliances() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }

    public boolean isMainsPower() {
        return mainsPower;
    }

    public void setMainsPower(boolean mainsPower) {
        this.mainsPower = mainsPower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void plugIn(){
        System.out.println("Включаем в резетку");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeAppliances that = (HomeAppliances) o;
        return Double.compare(that.power, power) == 0 && Double.compare(that.serviceTime, serviceTime) == 0 && mainsPower == that.mainsPower && Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, serviceTime, mainsPower, weight);
    }

    @Override
    public String toString() {
        return "HomeAppliances{" +
               "name='" + name + '\'' +
               ", power=" + power +
               ", serviceTime=" + serviceTime +
               ", mainsPower=" + mainsPower +
               ", weight=" + weight +
               '}';
    }
}
