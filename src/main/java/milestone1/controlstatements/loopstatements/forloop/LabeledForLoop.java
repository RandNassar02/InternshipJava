package milestone1.controlstatements.loopstatements.forloop;

public class LabeledForLoop {

    public static void main(String[] args) {
        aa:
        for (int a = 0; a < 4; a++) {
            bb:
            for (int b = 0; b < 4; b++) {
                if (a  == 2&& b == 2) {
                    break aa;
                }
                System.out.println(a + " " + b );
            }
        }
System.out.println("Break bb");
        aa:
        for(int i=0;i<=3;i++){
            bb:
            for(int j=0;j<=3;j++){
                if(i==2&&j==2){
                    break bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
