package corejava.practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; 

public class CalendarTest {

	public static void main(String[] args) {
		// Date getTime(): It is used to return a 
		// Date object representing this 
		// Calendar's time value. 

		
//			Calendar c = Calendar.getInstance(); 
//			System.out.println("The Current Date is:" + c.getTime()); 
//			
//		    Calendar calendar = Calendar.getInstance();
//		    calendar.set(Calendar.HOUR_OF_DAY, 24);
//		    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//		    
//		    Calendar now = Calendar.getInstance();
//		    System.out.println(now.getTime());
//
//		    System.out.println(now.get(Calendar.HOUR_OF_DAY));
		
		
		
//        // Displaying the current time zone 
//        String tz_name = calendar.getTimeZone() 
//                             .getDisplayName(); 
//  
//        System.out.println("The Current Time"
//                           + " Zone: " + tz_name); 
//  
//        TimeZone time_zone 
//            = TimeZone.getTimeZone("PST"); 
//  
//        // Modifying the time zone 
//        calendar.setTimeZone(time_zone); 
//  
//        // Displaying the modified zone 
//        System.out.println("Modified Zone: "
//                           + calendar.getTimeZone() 
//                                 .getDisplayName()); 
	
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
		Date date = null;
		long tms = 0;
        
		// Creating calendar object 
		Calendar calendar = Calendar.getInstance();
        // Displaying the current time zone 
        String tz_name = calendar.getTimeZone() 
                             .getDisplayName(); 
		System.out.println("current time zone is -->" + tz_name);
        TimeZone time_zone = TimeZone.getTimeZone("America/Anchorage"); 

//        // Modifying the time zone 
        calendar.setTimeZone(time_zone); 

        // Displaying the modified zone 
        System.out.println("Modified Zone: "
                       + calendar.getTimeZone() 
                             .getDisplayName()); 
        TimeZone.setDefault(TimeZone.getTimeZone("America/Anchorage"));
        System.out.println("The Current Date is:" + calendar.getTime()); 
		try {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Anchorage"));
//		calendar.add(Calendar.MINUTE, -1);
		date = calendar.getTime();
		System.out.println(date);
		Date d = (Date) sdf.parse(date.toString());
		System.out.println(date);
		calendar.setTime(d);
		System.out.println("The Current Date is:" + calendar.getTime()); 
		tms = calendar.getTimeInMillis();
		System.out.println("The Current time in milli seconds is:" + tms); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        
        
//     // Creating calendar object 
//        Calendar calendar1 = Calendar.getInstance(); 
//  
//        // Displaying the current time zone 
//        String tz_name1 = calendar1.getTimeZone() 
//                             .getDisplayName(); 
//  
//        System.out.println("The Current Time"
//                           + " Zone: " + tz_name1); 
//  
//        TimeZone time_zone1 
//            = TimeZone.getTimeZone("Pacific/Tahiti"); 
//  
//        // Modifying the time zone 
//        calendar1.setTimeZone(time_zone1); 
//  
//        // Displaying the modified zone 
//        System.out.println("Modified Zone: "
//                           + calendar1.getTimeZone() 
//                                 .getDisplayName()); 
        
//        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));

			} 
	}


