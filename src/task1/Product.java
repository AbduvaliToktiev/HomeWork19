package task1;

public class Product {
    private String name;
    private double price;
    private double shelfLife;

    public Product() {

    }

    public Product(String name, double price, double shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
        this.price = price;
        } else {
            System.out.println("Ошибка! Цена не должна равнятся нулю");
        System.exit(0);
        }
    }

    public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        if (shelfLife > 0){
        this.shelfLife = shelfLife;
        } else {
            System.out.println("Ошибка! Срок годности не должен равнятся нулю");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Product: " + "\n" +
                "name = " + name + "\n" +
                "price = " + price + " $\n"+
                "shelfLife = " + shelfLife + " month";
    }
}
