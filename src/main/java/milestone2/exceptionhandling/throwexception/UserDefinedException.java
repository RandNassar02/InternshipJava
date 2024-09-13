package milestone2.exceptionhandling.throwexception;

// class represents user-defined exception
class TestUserDefinedException extends Exception {
    public TestUserDefinedException(String str) {
        // Calling constructor of parent Exception
        super(str);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            // throw an object of user defined exception
            throw new TestUserDefinedException("This is user-defined exception");
        } catch (TestUserDefinedException ude) {
            System.out.println("Caught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}
