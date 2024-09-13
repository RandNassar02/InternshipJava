package milestone3.designpatterns.templatepattern.example2;

public class OfflineOrder extends PhoneOrder{

    @Override
    void selectProduct() {
        System.out.println("selecting the product in offline store");
    }

    @Override
    void packProduct() {
        System.out.println("making the payment in offline store");
    }

    @Override
    void deliverProduct() {
        System.out.println("product deliverd in hands in offline store");
    }
}
