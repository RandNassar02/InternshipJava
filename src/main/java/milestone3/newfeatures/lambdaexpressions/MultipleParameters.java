package milestone3.newfeatures.lambdaexpressions;

interface Addable{
    int add(int a,int b);
}

public class MultipleParameters {
    public static void main(String[] args) {
        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        Addable ad2=(int a,int b)->(a+b);
        System.out.println(ad1.add(100,200));


    }
}
