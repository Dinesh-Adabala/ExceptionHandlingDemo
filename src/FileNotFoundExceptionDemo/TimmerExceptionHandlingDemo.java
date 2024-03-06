package FileNotFoundExceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TimmerExceptionHandlingDemo {
    ;

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        //LocalDateTime expCalendar = LocalDateTime.of(2024, 3, 6, 14, 00);
        LocalDateTime expTime = LocalDateTime.of(LocalDateTime.now().toLocalDate(),
                java.time.LocalTime.of(14, 51));
        while (currentTime.isBefore(expTime)) {
            try {
                FileInputStream fileInputStream = new FileInputStream("C:\\ADS\\New folder\\aaaaaaa.jav.txt");
                System.out.println("File found");
               break;
            } catch (FileNotFoundException f) {
               currentTime = LocalDateTime.now();
                System.out.println(" File Not Found  : "+f.getMessage());
            }
        }

    }

}


