package milestone1.controlstatements.jumpstatements.continuestatement;

public class ContinueWithLabelledForLoop {
    public static void main(String[] args) {
        aa:
        for (int i = 0; i < 4; i++) {
            bb:
            for (int j = 0; j < 4; j++) {
                if (i == 2 && j == 2) {
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
