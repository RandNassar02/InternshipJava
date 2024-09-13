package milestone2.exceptionhandling.multicatch;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
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
