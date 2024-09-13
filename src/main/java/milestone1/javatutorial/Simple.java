package milestone1.javatutorial;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }

    public void testPublic(){

    }

    protected void testProtected(){

    }

    private void testPrivate(){

    }

    void testPackagePrivate(){

    }

    public static class BSimple extends Simple{
        @Override
        protected void testProtected() {
            super.testProtected();
        }
    }

}



//Valid Java main() method signature

//public static void main(String[] args)
//public static void main(String []args)
//public static void main(String args[])
//public static void main(String... args)
//static public void main(String[] args)
//public static final void main(String[] args)
//final public static void main(String[] args)
//final strictfp public static void main(String[] args)