import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class fileHandle {

	public static void fileHandleCode(long data) {
        String filePath = "C:\\new_wrkspce\\output.txt";
       
        //have long to loc dttim, n tostring
    LocalDateTime n= LocalDateTime.now();
        System.out.println(n);
        String dateToString= n.toString();
        System.out.println(dateToString);
        
        try (FileWriter writer = new FileWriter(filePath, true)) {
      //      String dataLine = String.valueOf(data) + " - " + getCurrentTime() + "\n";
        	// String dataLine = dateToString+ " - " + getCurrentTime() + "\n";
        	 String dataLine = dateToString+ "\n";

            writer.write(dataLine);
            System.out.println("Data written to the file: " + dataLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //try
    }

	public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
	
	
	

	public static void fileHandleCode1(long data) {
        String filePath = "C:\\new_wrkspce\\output.txt";
        
        
        Instant instant = Instant.ofEpochMilli(data);
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        String dateToString= localDateTime.toString();

  
        try (FileWriter writer = new FileWriter(filePath, true)) {
            String dataLine = dateToString + " - " + getCurrentTime() + "\n";
            writer.write(dataLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	 public static void main(String[] args) {
		 
		 LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
		
	        long date = zdt.toInstant().toEpochMilli();   // convert locdtetime to long
	     
		 fileHandleCode1(date); 
	    }
	
}
// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//
//long timestamp =session.getLastAccessedTime();
// Instant instant = Instant.ofEpochMilli(timestamp);
// ZoneId zoneId = ZoneId.systemDefault();
// LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
//	  System.out.println("LoginN Time-->"+dtf.format(localDateTime)); //dtf.format(localDateTime)
