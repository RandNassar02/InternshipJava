package milestone3.reflection.creatingyourownappletviewer;//package reflection.creatingyourownappletviewer;
//
//import java.applet.Applet;
//import java.awt.Frame;
//import java.awt.Graphics;
//
//import java.awt.*;
//
//public class MyViewer extends Frame {
//    public static void main(String[] args) {
//        Class c=Class.forName(args[0]);
//
//        MyViewer v=new MyViewer();
//        v.setSize(400,400);
//        v.setLayout(null);
//        v.setVisible(true);
//
//        Applet a=(Applet)c.newInstance();
//        a.start();
//        Graphics g=v.getGraphics();
//        a.paint(g);
//        a.stop();
//    }
//
//}
