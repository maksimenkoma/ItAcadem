package homeWorkAssessment.Task6;

public class Orchid extends Flower {
    private String color;
    private int lifeExpectancyOfDays;

    public Orchid(String madeIn, int shelfLife, double price, int lifeExpectancyOfDays) {
        super(madeIn, shelfLife, price);
        this.lifeExpectancyOfDays = lifeExpectancyOfDays;
    }

    public Orchid(String madeIn, int shelfLife, double price, String color, int lifeExpectancyOfDays) {
        super(madeIn, shelfLife, price);
        this.color = color;
        this.lifeExpectancyOfDays = lifeExpectancyOfDays;
    }

    @Override
    public String getColor() {
        return color;
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
}
