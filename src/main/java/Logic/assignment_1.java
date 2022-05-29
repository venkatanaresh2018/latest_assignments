package Logic;

import static Logic.LaunchBrowsers.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;



/*
Assignment Scenario

1)Navigate http://practice.automationtesting.in/

2)Click on My Account Tab and Register with mail id and password 

3)Click on Addresses and Add Billing address (provide data to all mandatory fields and click on save)

4)Click on LogOut   */




public class assignment_1 {



    // assignment1  http://practice.automationtesting.in/


	
   public static void myaccount() throws InterruptedException {
   	

   	Faker faker = new Faker();
   	String mail= faker.internet().emailAddress(); 

   	driver.findElement(Pages.assignment1_page.my_account).click();
   	
   	Thread.sleep(5000);
   	System.out.println("Enetering in the account section ");
   			
   	driver.findElement(Pages.assignment1_page.E_mail_address).sendKeys(mail);
   
   	driver.findElement(Pages.assignment1_page.Password).sendKeys("Dwh$1234jukl12");
   	
   	Thread.sleep(5000);

   	
   	driver.findElement(Pages.assignment1_page.Register_button).click();
   	Thread.sleep(3000);
   	
   	driver.findElement(Pages.assignment1_page.Address_button).click();
   	Thread.sleep(5000);

   	driver.findElement(Pages.assignment1_page.Edit).click();
   	
    
   	
   	Thread.sleep(5000);
   	
   	driver.findElement(Pages.assignment1_page.First_Name).sendKeys("naresh_venkat");
   	driver.findElement(Pages.assignment1_page.Last_Name).sendKeys("suddula");
   	
   	driver.findElement(Pages.assignment1_page.Company_Name).sendKeys("intactgreen service");
   	
   	
   	Thread.sleep(5000);
   	driver.findElement(Pages.assignment1_page.Phone).sendKeys("7676459705");
   	
   	driver.findElement(Pages.assignment1_page.street_Address).sendKeys("153,Ashok Nagar");
   	
   	driver.findElement(Pages.assignment1_page.appartmemt_address).sendKeys("ckb_layout");
   	driver.findElement(Pages.assignment1_page.town_address).sendKeys("kurnool");
   	
     	Thread.sleep(5000);
     	
     	
     	driver.findElement(By.id("s2id_billing_state")).click();
 
     WebElement dropdown=driver.findElement(By.id("s2id_autogen2_search"));
     dropdown.sendKeys("Karnataka");

     
     dropdown.sendKeys(Keys.ENTER);
     	
   
     	Thread.sleep(5000);
   	
   	driver.findElement(Pages.assignment1_page.Postcode).sendKeys("518573");
   	
   	Thread.sleep(5000);
   	
   	driver.findElement(Pages.assignment1_page.save_address).click();
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("window.scrollBy(0,350)", "");
   	
   	driver.findElement(Pages.assignment1_page.save_address).click();
   	
   	Thread.sleep(3000);

   	
   	driver.findElement(Pages.assignment1_page.Log_out).click();
   	Thread.sleep(3000);
   	
   	
   }
   
   
  //assignment1 http://practice.automationtesting.in/    

   public static void practice_automation_login() throws InterruptedException {
   	driver.findElement(Pages.assignment1_page.my_account).click();
   	
   	System.out.println("Enetering in the account section ");
   	driver.findElement(Pages.assignment1_page.Login_Username).sendKeys("suddulavenkatanaresh2018@gmail.com");
   	
   	driver.findElement(Pages.assignment1_page.Login_Password).sendKeys("Venkat@2468");
   	
   	driver.findElement(Pages.assignment1_page.Login_button).click();
   	System.out.println("Enetering in the address ection ");
   	driver.findElement(By.xpath("//a[normalize-space()='Addresses']")).click();
   	driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/edit-address/billing']")).click();
   	
   	Thread.sleep(2000);
   	
   	
   }            
   
	
}
