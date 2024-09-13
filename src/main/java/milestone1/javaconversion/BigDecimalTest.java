package milestone1.javaconversion;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10000000000000.231");
        System.out.println(bigDecimal.toEngineeringString());
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.toPlainString());

        BigDecimal add = bigDecimal.add(BigDecimal.valueOf(99));
        System.out.println(add);
    }
}
