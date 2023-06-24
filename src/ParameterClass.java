import java.time.LocalDate;
import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class ParameterClass {

	
	
	String TheWebSite = "http://www.almosafer.com/en";
	
	WebDriver driver = new ChromeDriver();
	
	Assertion myAssert = new Assertion();
	
	String ExpctedLanguageArabic ="العربية";
	
	String ExpctedLanguageEnglish ="English";
	
	String ExpectedCurrency = "SAR";
	
	String ExpectedContactNumber = "+966554400000";
	
	String ExpectedQitafLogo = "Footer__QitafLogo";
	
	boolean ExpectedHotelButtonState = false;
	
	LocalDate CurrentDateplus1 = LocalDate.now().plusDays(1);
    java.util.Date date = Date.from(CurrentDateplus1.atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MMM");
    String ExpectedDepartureDate = dateFormatter.format(date);		
	
   
    LocalDate CurrentDateplus2 = LocalDate.now().plusDays(2);
    java.util.Date date1 = Date.from(CurrentDateplus2.atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
    SimpleDateFormat dateFormatter1 = new SimpleDateFormat("dd/MMM");
    String ExpectedReturnDate = dateFormatter1.format(date1);	 
    
    Random rand = new Random();
    
    String [] myWebSiteURLs = {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
    
    int myIndex = rand.nextInt(0, 2);
    
    String [] ArabicCountiries= {"دبي","جدة"};
    int ArabicIndex = rand.nextInt(0,2);
    String [] EnglishCountiries= {"dubai","jeddah","riyadh"};
    int EnglishIndex = rand.nextInt(0,2);
    
    
    
    
    
       
	
	
	
}
