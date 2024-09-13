package milestone1.controlstatements.decisionmakingstatements.switchstatement;

public class SwitchVowelExample {
    public static void main(String[] args) {

//        If the character is A, E, I, O, or U, it is vowel otherwise consonant. It is not case-sensitive.

        char ch = 'R';
        switch (ch) {
            case 'A':
                System.out.println("vowel");
                break;
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
