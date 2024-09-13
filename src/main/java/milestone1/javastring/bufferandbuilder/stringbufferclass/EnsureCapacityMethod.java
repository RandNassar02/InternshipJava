package milestone1.javastring.bufferandbuilder.stringbufferclass;

public class EnsureCapacityMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16

        sb.ensureCapacity(50);
        System.out.println("Updated Capacity: " + sb.capacity());//50

        sb.append(" java is my favourite language");
        System.out.println("Final String: " + sb.toString());


    }
}
