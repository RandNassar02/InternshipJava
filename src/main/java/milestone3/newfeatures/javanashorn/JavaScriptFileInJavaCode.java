package milestone3.newfeatures.javanashorn;


import javax.script.*;
import java.io.*;

public class JavaScriptFileInJavaCode {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

        // Reading Nashorn file
        ee.eval(new FileReader("src/newfeatures/nashorn/js/hello.js"));
    }
}
