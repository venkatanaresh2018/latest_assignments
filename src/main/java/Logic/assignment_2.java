package Logic;

import static Logic.LaunchBrowsers.driver;

import org.openqa.selenium.By;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

import Pages.assignment2_page;





/*  assign ment 1 goto //http://automationpractice.com/index.php   click on sign in & create account and register  */







public class assignment_2 {

	
	
	
    public static void signin() throws InterruptedException {
    	
    	//we are going to create the various fake objectives by using the fake api 
    	
    	
    	Faker faker = new Faker();  
    	
    	
    	String mail= faker.internet().emailAddress(); 
    	
    	String ref_email=  faker.internet().emailAddress();
    	
   	    int  number =faker.number().numberBetween(10, 1000);
      	 System.out.println(number); 
   	  
   	     String F_name=faker.name().firstName();
   	   
   	     
   	     String L_name = faker.name().lastName();
   	     
   	     PhoneNumber  phone =faker.phoneNumber();
   	 
   	     
   	     Address address =faker.address();
   	     
   	     String phn=String.valueOf(phone);
   	    String addrs=String.valueOf(address);
   	    String adress_l2 = String.valueOf(faker.address());
    	   
   	  

		String city=faker.address().city();
		
		String country=faker.address().country();
		 String pin=faker.address().zipCode();
		 
		String state=faker.address().state();
		
   	    
    	 driver.findElement(assignment2_page.signin_xpath).click();
		 driver.findElement(assignment2_page.E_mail_form_address).sendKeys(mail);
		 Thread.sleep(2000);
		 System.out.println("clicking on the button");
		 driver.findElement(assignment2_page.create_account_button).click();
				 
		 
			driver.findElement(By.cssSelector("#id_gender1")).click();
			
			driver.findElement(assignment2_page.first_name_form).sendKeys(F_name);
			driver.findElement(assignment2_page.last_name).sendKeys(L_name);
			//driver.findElement(assignment2_page.objMail).sendKeys("suddulavenkatanareshylr@gmail.com");
			driver.findElement(assignment2_page.objPass).sendKeys("dwh$1234");
			driver.findElement(assignment2_page.objDrop1).sendKeys("09");
			driver.findElement(assignment2_page.objDrop2).sendKeys("november");
			driver.findElement(assignment2_page.objDrop3).sendKeys("1996");
			Thread.sleep(5000);
			
			driver.findElement(assignment2_page.objCheck1).click();
			driver.findElement(assignment2_page.objCheck2).click();
			driver.findElement(assignment2_page.objFName).sendKeys(F_name);
			driver.findElement(assignment2_page.objLName).sendKeys(L_name);
			driver.findElement(assignment2_page.objComp).sendKeys("IGS");
			driver.findElement(assignment2_page.objAddress).sendKeys(addrs);
			driver.findElement(assignment2_page.objAddressL2).sendKeys(adress_l2);
			// Thread.sleep(5000);
			
			
			driver.findElement(assignment2_page.objCity).sendKeys(city);
			driver.findElement(assignment2_page.objDrop4).sendKeys(country);
			driver.findElement(assignment2_page.objPIN).sendKeys(pin);
			driver.findElement(assignment2_page.objDrop5).sendKeys(state);
			driver.findElement(assignment2_page.objAddInfo).sendKeys("Hello World!!!!!..........");
			driver.findElement(assignment2_page.objHomePh).sendKeys(phn);
			driver.findElement(assignment2_page.objMobile).sendKeys(phn);
			driver.findElement(assignment2_page.objFutureRefe).sendKeys(ref_email);
			driver.findElement(assignment2_page.objRegButton).click();
			Thread.sleep(5000);
			// wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objCarouselCardOnPremiumTab));
		 
		
		 Thread.sleep(200000);
		 
    }
}
