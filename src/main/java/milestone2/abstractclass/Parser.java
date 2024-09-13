package milestone2.abstractclass;

public abstract class Parser {

    int e;
    public int t;
    public static int y;

    public void parse(String s) {
        System.out.println("Parse Successfully");
    }

    public void autoCorrection() {
        System.out.println("Read Document Automatically and fix typo errors");
    }

    public abstract void print();


    static class XML extends Parser {
        @Override
        public void print() {
            System.out.println("Print XML Document");
        }
    }

    static class JSON extends Parser {

        @Override
        public void print() {
            System.out.println("Print JSON Document");
        }
    }

    public static void main(String[] args) {
        XML xml = new XML();
        xml.parse("Test");
        xml.print();
        xml.autoCorrection();

        JSON json = new JSON();
        json.parse("Test2");
        json.print();
        json.autoCorrection();
    }
}