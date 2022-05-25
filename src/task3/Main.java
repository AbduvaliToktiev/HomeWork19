package task3;

import task3.product.Compound;
import task3.product.Milk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk();
        Compound compound1 = new Compound();
        Compound compound2 = new Compound();
        Compound compound3 = new Compound();
        Compound compound4 = new Compound();
        Compound compound5 = new Compound();
        Compound[] compounds = new Compound[5];
        compound1.setName("Вода");
        compounds[0] = compound1;
        compound2.setName("Жир");
        compounds[1] = compound2;
        compound3.setName("Белки");
        compounds[2] = compound3;
        compound4.setName("Лактоза");
        compounds[3] = compound4;
        compound5.setName("Соли");
        compounds[4] = compound5;
        System.out.println(Arrays.toString(compounds));


        milk.setName("Белая река");
        milk.setPrice(0.9);
        milk.setShelfLife(9);
        System.out.println(milk);

    }
}
