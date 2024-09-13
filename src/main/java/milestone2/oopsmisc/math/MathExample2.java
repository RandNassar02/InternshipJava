package milestone2.oopsmisc.math;

public class MathExample2 {
    public static void main(String[] args) {
        double a = 30;

        // converting values to radian
        double b = Math.toRadians(a);

        // return the trigonometric sine of a
        System.out.println("Sine :"+Math.sin(a));

        // return the trigonometric cosine value of a
        System.out.println("Cosine :"+Math.cos(a));

        // return the trigonometric tangent value of a
        System.out.println("Tangent :"+Math.tan(a));

        // return the trigonometric arc sine of a
        System.out.println("Sine :"+Math.asin(a));

        // return the trigonometric arc cosine value of a
        System.out.println("Cosine :"+Math.acos(a));

        // return the trigonometric arc tangent value of a
        System.out.println("Tangent :"+Math.atan(a));

        // return the hyperbolic sine of a
        System.out.println("Sine :"+Math.sinh(a));

        // return the hyperbolic cosine value of a
        System.out.println("Cosine :"+Math.cosh(a));

        // return the hyperbolic tangent value of a
        System.out.println("Tangent :"+Math.tanh(a));
    }
}
