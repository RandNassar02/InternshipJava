package milestone3.stream;

import java.util.ArrayList;
import java.util.List;

class Product6{
    int id;
    String name;
    float price;
    public Product6(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class MaxAndMin {
    public static void main(String[] args) {
        List<Product6> productsList = new ArrayList<Product6>();
        //Adding Products
        productsList.add(new Product6(1,"HP Laptop",25000f));
        productsList.add(new Product6(2,"Dell Laptop",30000f));
        productsList.add(new Product6(3,"Lenevo Laptop",28000f));
        productsList.add(new Product6(4,"Sony Laptop",28000f));
        productsList.add(new Product6(5,"Apple Laptop",90000f));
        // max() method to get max Product price
        Product6 productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product6 productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productB.price);

    }
}
