package milestone2.abstractclass.interfacejava;

//Drawable interface has only one method


//Interface declaration: by first user
interface Drawable{
    void draw();
}
//Implementation: by second user
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
public class DrawableInterface {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.draw();
    }
}
