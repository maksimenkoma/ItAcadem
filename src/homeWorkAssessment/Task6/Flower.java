package homeWorkAssessment.Task6;

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
}

