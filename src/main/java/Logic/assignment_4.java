package Logic;

import static Logic.LaunchBrowsers.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.assignment4_page;

public class assignment_4 {

	 public static void iframes() throws InterruptedException {
	    	Thread.sleep(3000);

	    	
	    	WebElement iframe = driver.findElement(assignment4_page.single_frame);
	    
	 	    int size = driver.findElements(By.xpath("SingleFrame")).size();
	 	    System.out.println(size);

	    	//Switch to the frame
	    	driver.switchTo().frame(0);
	    	Thread.sleep(3000);
	    
	    	driver.findElement(assignment4_page.single_frame_text_field).sendKeys("Hema.c");
	     	Thread.sleep(3000);

			
		}
	    
	
}
