package homeWorkAssessment.Task6;

public class Rose extends Flower{
    private String color;
    private double length;

    public Rose(String madeIn, int shelfLife, double price, String color, double length) {
        super(madeIn, shelfLife, price);
        this.color = color;
        this.length = length;
    }

    public Rose(String color, double length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
