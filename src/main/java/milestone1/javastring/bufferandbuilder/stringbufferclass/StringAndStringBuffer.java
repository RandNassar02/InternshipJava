package milestone1.javastring.bufferandbuilder.stringbufferclass;

public class StringAndStringBuffer {

//    Performance Test of String and StringBuffer
//calculates the time required for concatenating a string using the String class and StringBuffer class.

    public static String concatWithString()    {
        String t = "Java";
        for (int i=0; i<10000; i++){
            t = t + "Tpoint";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
    }
}
