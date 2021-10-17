package homeWorkAssessment.Task6;

public class Tulips extends Flower{
    private String color;
    private String weight;

    public Tulips(String madeIn, int shelfLife, double price, String color, String weight) {
        super(madeIn, shelfLife, price);
        this.color = color;
        this.weight = weight;
    }

    public Tulips(String color, String weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
