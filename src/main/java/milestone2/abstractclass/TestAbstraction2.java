package milestone2.abstractclass;

abstract class Bank{
    abstract int getRateOfInterest();

}

class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

public class TestAbstraction2 {

    public static void main(String[] args) {
        Bank bank ;
        bank= new SBI();
        System.out.println(bank.getRateOfInterest());
        bank= new PNB();
        System.out.println(bank.getRateOfInterest());
    }
}
