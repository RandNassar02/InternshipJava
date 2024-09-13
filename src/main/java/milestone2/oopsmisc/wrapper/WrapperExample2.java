package milestone2.oopsmisc.wrapper;
class Javatpoint{
    private int i;
    Javatpoint(){}
    Javatpoint(int i){
        this.i=i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=i;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
public class WrapperExample2 {
    public static void main(String[] args) {
        Javatpoint j=new Javatpoint(10);
        System.out.println(j);
    }
}
