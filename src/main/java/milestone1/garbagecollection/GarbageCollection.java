package milestone1.garbagecollection;

public class GarbageCollection {
    public static void main(String[] args){

//    1) By nulling a reference:
        GarbageCollection g=new GarbageCollection();
        g=null;

//        2) By assigning a reference to another:
        GarbageCollection g1=new GarbageCollection();
        GarbageCollection g2=new GarbageCollection();
        g1=g2;//now the first object referred by e1 is available for garbage collection

//        3) By anonymous object:
        new GarbageCollection();
}}

