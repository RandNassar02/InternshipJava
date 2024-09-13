package milestone1.controlstatements.loopstatements.forloop;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
