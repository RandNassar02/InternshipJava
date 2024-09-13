package milestone3.newfeatures.javanashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptCodeInJavaSourceFile  {
    public static void main(String[] args) throws ScriptException {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("nashorn");
        // Evaluating Nashorn code
        ee.eval("print('Hello Nashorn');");
    }
}
