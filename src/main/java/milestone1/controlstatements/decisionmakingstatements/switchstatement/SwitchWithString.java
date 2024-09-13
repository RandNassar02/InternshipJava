package milestone1.controlstatements.decisionmakingstatements.switchstatement;

public class SwitchWithString {
    public static void main(String[] args) {
        String levelString = "Expert";
        int level = 0;

        switch (levelString) {
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
        }
        System.out.println(level);
    }
}