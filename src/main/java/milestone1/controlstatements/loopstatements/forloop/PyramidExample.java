package milestone1.controlstatements.loopstatements.forloop;

public class PyramidExample {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("-----");
        int count =5;
        for (int i = 1; i < count; i++) {
            for (int j = count; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
