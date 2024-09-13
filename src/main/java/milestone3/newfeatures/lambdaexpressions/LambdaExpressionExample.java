package milestone3.newfeatures.lambdaexpressions;
@FunctionalInterface
interface Drawable2{
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        Drawable2 d2=()->{
            System.out.println("Drawing"+width);
        };
        d2.draw();
    }
}
