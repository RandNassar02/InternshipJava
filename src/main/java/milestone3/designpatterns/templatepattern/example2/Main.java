package milestone3.designpatterns.templatepattern.example2;

public class Main {
    public static void main(String[] args) {
        PhoneOrder offlineOrder=new OfflineOrder();
        offlineOrder.createOrder();
        System.out.println("------");
        PhoneOrder on=new OnlineOrder();
        on.createOrder();
    }
}
