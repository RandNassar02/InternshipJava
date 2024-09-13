package milestone2.oopsmisc.cloning;

class SimpleExample implements Cloneable {
    int rollno;
    String name;

    SimpleExample(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            SimpleExample s1 = new SimpleExample(101, "amit");

            SimpleExample s2 = (SimpleExample) s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }
}