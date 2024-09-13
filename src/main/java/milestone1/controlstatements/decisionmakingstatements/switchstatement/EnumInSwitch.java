package milestone1.controlstatements.decisionmakingstatements.switchstatement;

public class EnumInSwitch {
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    public static void main(String[] args) {
        Day[] DayNow = Day.values();
        for (Day d : DayNow) {
            switch (d) {
                case Sun:
                    System.out.println(d);
                    break;
                case Mon:
                    System.out.println(d);
                    break;
                case Tue:
                    System.out.println(d);
                    break;
                case Wed:
                    System.out.println(d);
                    break;
                case Thu:
                    System.out.println(d);
                    break;
                case Fri:
                    System.out.println(d);
                    break;
                case Sat:
                    System.out.println(d);
                    break;

            }
        }
    }
}
