package task2.product;

import task1.Product;

class Tea extends Product {
    @Override
    public String toString() {
        return "Product: Tea " + "\n" +
                "name = " + getName() + "\n" +
                "price = " + getPrice() + " $\n"+
                "shelfLife = " + getShelfLife() + " month";
    }
}
