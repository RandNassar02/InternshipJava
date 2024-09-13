package milestone1.controlstatements.decisionmakingstatements.switchstatement;

public class NestedSwitch {
    public static void main(String[] args) {
        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear) {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("OS,Java,Data");
                        break;
                    case 'E':
                        System.out.println("Micro, Logic");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;

            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals,  Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}
