package milestone3.designpatterns.templatepattern.example2;

public class OnlineOrder extends PhoneOrder{

    @Override
    void selectProduct() {
        System.out.println("selecting the product in online store");
    }

    @Override
    void packProduct() {
        System.out.println("making the payment in online store");
    }

    @Override
    void deliverProduct() {
        System.out.println("product delivered at home of the client");
    }
}
