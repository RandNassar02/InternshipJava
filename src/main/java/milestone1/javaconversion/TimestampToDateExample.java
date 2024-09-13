package milestone1.javaconversion;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDateExample {
    public static void main(String[] args) {
        // Assuming you have a Timestamp object
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // Convert Timestamp to Date
        Date date = new Date(timestamp.getTime());

        // Display the original Timestamp and the converted Date
        System.out.println("Original Timestamp: " + timestamp);
        System.out.println("Converted Date: " + date);

        Timestamp ts2=new Timestamp(System.currentTimeMillis());
        Date date2=ts2;
        System.out.println(date2);

    }
}
