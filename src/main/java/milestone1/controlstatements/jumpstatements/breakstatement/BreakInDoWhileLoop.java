package milestone1.controlstatements.jumpstatements.breakstatement;

public class BreakInDoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
