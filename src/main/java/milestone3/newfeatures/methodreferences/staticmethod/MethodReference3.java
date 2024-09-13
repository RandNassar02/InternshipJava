package milestone3.newfeatures.methodreferences.staticmethod;

import java.util.function.BiFunction;

class Aithmetic{
    public static int add(int a,int b){
        return a+b;
    }
}
public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder=Aithmetic::add;

        int result=adder.apply(10,20);

        System.out.println(result);
    }
}
