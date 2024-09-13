package milestone2.exceptionhandling.multicatch;

public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];

            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
