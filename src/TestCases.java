import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.WebElement;

public class TestCases {
	
	ParameterClass myObject = new ParameterClass();
	
	
	@BeforeTest
	
	public void myBeforeTest() {
		
		myObject.driver.get(myObject.TheWebSite);
		myObject.driver.manage().window().maximize();
		
	}
	
	@Test(description = "Qustion 2 : test number 1",priority = 1)
	public void CheckTheLanguage() {
		String TheActualLanguage = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
		
		myObject.myAssert.assertEquals(TheActualLanguage, myObject.ExpctedLanguageArabic);
	}
	
	@Test(description = "Qustion 2 : test number 2",priority = 2)
	
	public void CheckTheCurrency() {
		
		String TheActualCurrency = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
		
		myObject.myAssert.assertEquals(TheActualCurrency, myObject.ExpectedCurrency);
		
	}
	
	@Test(description = "Qustion 2 : test number 3",priority = 3)
	
	public void CheckTheContactNumber() {
		String TheActualContactNumber = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
	
	myObject.myAssert.assertEquals(TheActualContactNumber, myObject.ExpectedContactNumber);
	}
	
	@Test(description = "Qustion 2 : test number 4",priority = 4)
	
	public void CheckTheQitafLogo() {
		WebElement MyFooter = myObject.driver.findElement(By.tagName("footer"));
		
		String TheActualQitafLogo = MyFooter.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR")).getAttribute("data-testid");
		
		myObject.myAssert.assertEquals(TheActualQitafLogo, myObject.ExpectedQitafLogo);
		
	   }
	
	@Test(description = "Qustion 2 : test number 5",priority = 5)
	
	public void CheckTheHotelIsNotSelected() {
		WebElement MyBody = myObject.driver.findElement(By.tagName("body"));
		
		String TheActualHotelButtonStateStr = MyBody.findElement(By.id("uncontrolled-tab-example-tab-hotels")).getAttribute("aria-selected");
		
		boolean TheActualHotelButtonState = Boolean.parseBoolean(TheActualHotelButtonStateStr);
		
		myObject.myAssert.assertEquals(TheActualHotelButtonState, myObject.ExpectedHotelButtonState);
	}
	
	@Test(description = "Qustion 2 : test number 6",priority = 6)
	
	public void FlightDepartureDate() {
		WebElement MyBody = myObject.driver.findElement(By.tagName("body"));
		
		String Month = MyBody.findElement(By.className("sc-cFlXAS")).getText();
		String Monthweb= Month .substring(0, 3);
		String Day   = MyBody.findElement(By.className("sc-hcnlBt")).getText();
		String TheActualDepartureDate = 	Day+"/"+Monthweb;
		//System.out.print(TheActualDepartureDate); 
		myObject.myAssert.assertEquals(TheActualDepartureDate, myObject.ExpectedDepartureDate);
		}
	
	@Test(description = "Qustion 2 : test number 7",priority = 7)
	
	public void FlightReturnDate() {
	WebElement MyBody = myObject.driver.findElement(By.tagName("body"));
		
		String Month = MyBody.findElement(By.className("sc-cFlXAS")).getText();
		String Monthweb= Month .substring(0, 3);
		//String Day   = MyBody.findElement(By.className("sc-hcnlBt")).getText();
		WebElement Day = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"));
		String Dayweb = Day.getText();
		String TheActualReturnDate = 	Dayweb+"/"+Monthweb;
		myObject.myAssert.assertEquals(TheActualReturnDate, myObject.ExpectedReturnDate);
		}
	
	@Test(description = "Qustion 3" , priority = 8)
	
	public void RandomCheckTheWebsiteLanguage() {
		
		myObject.driver.get(myObject.myWebSiteURLs[myObject.myIndex]);
		
		if(myObject.driver.getCurrentUrl().contains("ar")) {
			
			String lang = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
			
			myObject.myAssert.assertEquals(lang, myObject.ExpctedLanguageEnglish);
			
	}
		else {
			
			String lang = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
			
			myObject.myAssert.assertEquals(lang, myObject.ExpctedLanguageArabic);
		}
		
	}
	
	@Test(description = "Qustion 4" , priority = 9)
	
	public void Test_The_hotel_tab() throws InterruptedException {
		myObject.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		myObject.driver.get(myObject.myWebSiteURLs[myObject.myIndex]);
		
		if(myObject.driver.getCurrentUrl().contains("ar")) {
			
			WebElement hotel_tab = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			hotel_tab.click();
			Thread.sleep(2000);
			WebElement searchbar = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			WebElement search_button = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			searchbar.sendKeys(myObject.ArabicCountiries[myObject.ArabicIndex]+ Keys.ARROW_DOWN);
			Thread.sleep(2000);
			search_button.click();
			
			
	}
		else {
			
			WebElement hotel_tab = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			hotel_tab.click();
			Thread.sleep(2000);
			WebElement searchbar = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			WebElement search_button = myObject.driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			
			searchbar.sendKeys(myObject.EnglishCountiries[myObject.EnglishIndex]+ Keys.ARROW_DOWN);
			Thread.sleep(2000);
			search_button.click();
			
			
		}
		
	}
	
    @Test(description = "Qustion 5 " , priority = 10)
    public void Randomly_select_number_of_vistor() {
    	WebElement number_of_vistor = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));
    	Select myselector = new Select(number_of_vistor);
    	myselector.selectByIndex(myObject.myIndex);
    }
		
    @Test(description = "Qustion 6 " , priority = 11)
    public void search_hotel(){
    	WebElement search_button = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[4]/button"));
    	search_button.click();
    }
    
    @Test(description = "Qustion 7 " , priority = 12)
    public void done_searching() {
    	myObject.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	
    	WebElement search_result = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span"));
    	
    	String text_of_the_search_result = search_result.getText();
    	
    	boolean Actual_result_in_the_web_site = text_of_the_search_result.contains("found")||text_of_the_search_result.contains("وجدنا");
    	
    	myObject.myAssert.assertEquals(Actual_result_in_the_web_site, true);
    	
    	
    }
    
    @Test(description = "Qustion 8 " , priority = 13)
    public void sorting_from_lowe_to_hight() throws InterruptedException {
    	WebElement lowest_price = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]"));
    	lowest_price.click();
    	Thread.sleep(3000);
    	WebElement right_side = myObject.driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[2]/div[1]"));
    	List<WebElement> the_price = right_side.findElements(By.className("Price__Value"));
    	
    		String price_on_the_web_site_of_the_first_element = the_price.get(0).getText();
    		String price_on_the_web_site_of_the_last_element  = the_price.get(the_price.size()-1).getText();
    		int first_item_int = Integer.parseInt(price_on_the_web_site_of_the_first_element);
    		int last_item_int  = Integer.parseInt(price_on_the_web_site_of_the_last_element);
    		
    		myObject.myAssert.assertEquals(first_item_int<last_item_int, true);
    	
    	
    }
	
	@AfterTest
	
	public void afterTest() {
		
	}
	
	

}
