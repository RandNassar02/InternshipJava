package milestone1.javatutorial;

public class Simple2 {
    public static void main(String[] args) {
        Simple.BSimple bSimple = new Simple.BSimple();
        bSimple.testProtected();

        Simple simple = new Simple();
        simple.testProtected();
        simple.testPackagePrivate();
    }
}
