package milestone1.controlstatements.decisionmakingstatements.switchstatement;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 20;
        switch (num) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not 10,20 or 30");
        }
    }
}
