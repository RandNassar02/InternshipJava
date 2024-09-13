package milestone2.oopsmisc.math;

public class MathExample {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;
        // return the maximum of two numbers
        System.out.println("Maximum :" + Math.max(x, y));

        // return the Minimum of two numbers
        System.out.println("Minimum :" + Math.min(x, y));

        // return the maximum of two numbers
        System.out.println("Square root of y" + Math.sqrt(y));

        //returns 28 power of 4
        System.out.println("Power:" + Math.pow(x, y));

        // return the logarithm of given value
        System.out.println("Logarithm of x:" + Math.log(x));
        System.out.println("Logarithm of y:" + Math.log(y));

        // return the logarithm of given value when base is 10
        System.out.println("Log10 of x:" + Math.log10(x));
        System.out.println("Log10 of y:" + Math.log10(y));

        // return the log of x + 1
        System.out.println("log1 of x:"+Math.log1p(x));
        System.out.println("log1 of y:"+Math.log1p(y));

        // return a power of 2
        System.out.println("exp of x:"+Math.exp(x));
        System.out.println("exp of y:"+Math.exp(y));

        // return (a power of 2)-1
        System.out.println("expm1 of x:"+Math.expm1(x));
        System.out.println("expm1 of y:"+Math.expm1(y));

    }
}
