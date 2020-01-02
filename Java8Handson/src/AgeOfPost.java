import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class AgeOfPost {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); 
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy,HH:mm:ss a"); 
		
        
        LocalDateTime currentLocalDateTime = LocalDateTime.of(date,time);
        String currentDate = currentLocalDateTime.format(format);
        
        LocalDateTime postLocalDateTime = LocalDateTime.of(2019,8,05,9,00,22);
        String PostDate = postLocalDateTime.format(format);
        
        System.out.println("Current Date and Time" + currentDate);
        System.out.println("Post Date and Time" + PostDate);
        
        Duration duration = Duration.between(postLocalDateTime, currentLocalDateTime);
        System.out.println("Duration: " + duration);
        
        if(duration.toHours() > 1) {
        	System.out.println(duration.toHours() + " hours ago");
        }
        else if(duration.toMinutes() > 1) {
        	System.out.println(duration.toMinutes() + " minutes ago");
        }
        else {
        System.out.println(duration.getSeconds() + " seconds ago");
        }
        System.out.println(duration.toHours() + " hours ago");
	}

}
