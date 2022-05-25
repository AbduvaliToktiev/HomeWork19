package task3.product;


public class Milk extends Product{
    private double shelfLife;

    public Milk() {

    }

    public Milk(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "shelfLife = " + shelfLife +
                ", name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }
}
