package milestone1.controlstatements;

public class Statement {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        System.out.println("---if statements---");
//        Simple if statement:
        if (x + y > 20) {
            System.out.println("x + y is greater than 20");
        }

        System.out.println("---------");

//        if-else statement
        if (x + y < 10) {
            System.out.println("x + y is less than 10");
        } else {
            System.out.println("x + y is greater than 10");
        }

        System.out.println("---------");

//        if-else-if ladder
        String myChar = "R";
        if (myChar == "A") {
            System.out.println("myChar is A");
        } else if (myChar == "B") {
            System.out.println("myChar is B");
        } else if (myChar == "C") {
            System.out.println("myChar is C");
        } else {
            System.out.println("myChar is " + myChar);
        }

        System.out.println("---------");

//        Nested if-statement
        String address = "Amman, Jordan";
        if (address.endsWith("Jordan")) {
            if (address.contains("X")) {
                System.out.println("Your city is X");
            } else if (address.contains("Y")) {
                System.out.println("Your city is Y");
            } else {
                System.out.println(address.split(",")[0]);
            }
        } else {
            System.out.println("You are not living in Jordan");
        }

        System.out.println("--- switch statement ---");
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("num is 0");
                break;
            case 1:
                System.out.println("num is 1");
                break;
            default:
                System.out.println("num is " + num);
        }

        System.out.println("--- for loop ---");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

        System.out.println("--- for-each loop ---");
        String[] names = {"Java", "C++", "Python"};
        System.out.println("The content of array :-");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--- while loop ---");
        int i = 0;
        System.out.println("The even numbers :-");
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("--- do-while loop ---");
        int d = 0;
        System.out.println("The even numbers :-");
        do {
            System.out.println(d);
            d += 2;
        }
        while (d <= 10);

        System.out.println("--- break statement ---");
//        with for loop
        for (int b = 0; b < 10; b++) {
            System.out.println(b);
            if (b == 5) {
                break;
            }
        }

        System.out.println("---------");

//        with labeled for loop
        a:
        for (int h = 0; h <= 10; h++) {
            b:
            for (int j = 0; j <= 15; j++) {
                c:
                for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 6) {
                        break a;
                    }
                }
            }
        }

        System.out.println("--- continue statement ---");
        for (int r = 0; r <= 2; r++) {
            for (int a = r; a <= 5; a++) {
                if (a == 2) {
                    continue;
                }
                System.out.println(a);
            }
        }
        System.out.println("---------");
    }
}
