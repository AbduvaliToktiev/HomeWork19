package task2.product;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.setName("Greenfield");
        tea.setPrice(3.4);
        tea.setShelfLife(15);
        System.out.println(tea);
        System.out.println();
        Milk milk = new Milk();
        milk.setName("Белая река");
        milk.setPrice(0.8);
        milk.setShelfLife(6);
        System.out.println(milk);
    }
}
