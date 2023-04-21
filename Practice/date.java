import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class date {
    public static void main(String[] args) {
        String startStr = "25-08-1998";
        String endStr = "27.09.2020";
        
   
        LocalDate date1 = LocalDate.parse(startStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate date2 = LocalDate.parse(endStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        
        
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);
    }
}
