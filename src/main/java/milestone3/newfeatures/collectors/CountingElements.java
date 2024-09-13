package milestone3.newfeatures.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product5{
    int id;
    String name;
    float price;

    public Product5(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
public class CountingElements {
    public static void main(String[] args) {
        List<Product5>productList=new ArrayList<Product5>();

        productList.add(new Product5(1,"HP Laptop",25000f));
        productList.add(new Product5(2,"Dell Laptop",30000f));
        productList.add(new Product5(3,"Lenevo Laptop",28000f));
        productList.add(new Product5(4,"Sony Laptop",28000f));
        productList.add(new Product5(5,"Apple Laptop",90000f));

        Long noOfElements = productList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements : "+noOfElements);
    }
}
