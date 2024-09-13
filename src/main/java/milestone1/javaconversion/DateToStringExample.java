package milestone1.javaconversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample {
    public static void main(String[] args) {
        Date dateTest = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strDateTest = dateFormat.format(dateTest);
        System.out.println("Converted String: " + strDateTest);


        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
    }
}
