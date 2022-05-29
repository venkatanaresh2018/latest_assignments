package Logic;

import static Logic.LaunchBrowsers.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.github.javafaker.Faker;

import Pages.assignment2_page;


/*
Assignment Scenario

1)Navigate http://automationpractice.com/

2)Click on “Contact us” and fill all mandatory fields (upload a file for Attach File )

3)Click on Send and Verify Message “Your message has been successfully sent to our team.”


*/


public class assignment_3 {

	   //automationpractice.com///contactus_assignment
	    
	    public static void contact_us() throws InterruptedException {
	    	
	    	Thread.sleep(3000);
	    	
	    	Faker faker = new Faker();
	    	driver.findElement(Pages.assignment3_page.contactus_button).click();
	    	

	    	String mail= faker.internet().emailAddress(); 
	    	
	    	 int  number =faker.number().numberBetween(10, 1000);
	    	 System.out.println(number);
	 
	    	 String s=String.valueOf(number);  

	    	 System.out.println(mail);
	    	
	    	Select dropdown = new Select(driver.findElement(By.id("id_contact")));
	    	
	 
	    	dropdown.selectByIndex(2);


	    	Thread.sleep(1000);
	    	
	    	//mail
	    	 System.out.println(mail);
	    	 driver.findElement(Pages.assignment3_page.conatct_mail_address).sendKeys(mail);
	    	 Thread.sleep(1000);
	    	 
	    	driver.findElement(Pages.assignment3_page.order_reference).sendKeys(s);
	    	 
	       Thread.sleep(1000);
	    	 
	    	
	    	 //attach 
	    	 
	    	 
	    	 driver.findElement(Pages.assignment3_page.Attach_file).sendKeys("C:\\Users\\Suddulu_Naresh\\Downloads\\2014-04-22_14-44-49__Lecture1.pdf");

	    	
	    	 
	    	 //message 
	    	 
	    	 driver.findElement(Pages.assignment3_page.Message).sendKeys("good quality worth for money ");
	    	 
	    	 
	        Thread.sleep(1000);
	    	 
	    	 //send 
	    	 driver.findElement(Pages.assignment3_page.send_button).click();
	    	 
	    	 
	    	Thread.sleep(1000);
	    	 
	    	 
	    	 
	    	 
	    	 String expectedSuccessMsg = "Your message has been successfully sent to our team.";
	    	 String actualSuccessMsg = driver.findElement(Pages.assignment3_page.alert_assert).getText();

	    	  Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
	    	 System.out.println("TEST PASSED");
	    	    
	    	 System.out.println(actualSuccessMsg);

	    }
	    
	    
	    
}
