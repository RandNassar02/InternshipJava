package milestone3.designpatterns.templatepattern.example2;

abstract public class PhoneOrder {
    final void createOrder() {
        selectProduct();
        packProduct();
        makePayment();
        deliverProduct();
    }

    abstract void selectProduct();

    abstract void packProduct();

    void makePayment() {
        System.out.println("paking the product");
    }

    abstract void deliverProduct();

}
