package milestone3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product9 {
    int id;
    String name;
    float price;

    public Product9(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ConvertListIntoMap {
    public static void main(String[] args) {
        List<Product9> productsList = new ArrayList<Product9>();

        //Adding Products
        productsList.add(new Product9(1, "HP Laptop", 25000f));
        productsList.add(new Product9(2, "Dell Laptop", 30000f));
        productsList.add(new Product9(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product9(4, "Sony Laptop", 28000f));
        productsList.add(new Product9(5, "Apple Laptop", 90000f));

        // Converting Product List into a Map
        Map<Integer, String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p -> p.id, p -> p.name));

        System.out.println(productPriceMap);
    }

}
