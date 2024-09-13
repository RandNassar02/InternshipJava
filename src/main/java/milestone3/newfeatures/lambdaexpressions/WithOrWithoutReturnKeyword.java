package milestone3.newfeatures.lambdaexpressions;

interface Addable2{
    int add (int a,int b);
}
public class WithOrWithoutReturnKeyword {
    public static void main(String[] args) {
        Addable2 ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        Addable2 ad2=(int a,int b)->{
            return (a+b);
        };
        System.out.println(ad1.add(10,20));


    }
}
