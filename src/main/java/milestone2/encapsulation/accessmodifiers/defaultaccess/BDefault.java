package milestone2.encapsulation.accessmodifiers.defaultaccess;
import milestone2.encapsulation.accessmodifiers.defaultaccess.*;
class BDefault {
    public static void main(String[] args){
        ADefault obj = new ADefault();//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
