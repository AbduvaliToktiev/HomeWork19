package task2.product;

import task1.Product;

public class Milk extends Product {
    @Override
    public String toString() {
        return "Product: Milk " + "\n" +
                "name = " + getName() + "\n" +
                "price = " + getPrice() + " $\n"+
                "shelfLife = " + getShelfLife() + " month";
    }
}
