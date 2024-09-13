package milestone2.oopsmisc.strictfpkeyword;

public class IllegalCode {

//    cannot be applied on abstract methods, variables or constructors

    class A {
//        strictfp abstract void m();//Illegal combination of modifiers
    }

    class B {
//        strictfp int data=10;//modifier strictfp not allowed here
    }

    class C {
//        strictfp B(){}//modifier strictfp not allowed here
    }
}
