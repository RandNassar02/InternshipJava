package milestone3.generics.genericclass;

class MyGen <T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
