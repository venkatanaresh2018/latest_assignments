package Pages;

import org.openqa.selenium.By;

public class assignment3_page {

	

	
	
	public static By contactus_button =By.xpath("//a[@title='Contact Us']");
	
	public static By   subject_heading=By.xpath("//select[@id='id_contact']");
	
	
	public static By   cust_service=By.id("desc_contact2");

	
	public static By   conatct_mail_address=By.xpath("//input[@id='email']");
	
	public static By    order_reference =By.xpath("//input[@id='id_order']");
	
	public static By  Attach_file=By.xpath("//input[@id='fileUpload']");
	
	public static By  Message  =By.xpath("//textarea[@id='message']");
	
	
	public static By  send_button  =By.xpath("//span[normalize-space()='Send']");
	
	public static By  alert_assert=By.xpath("//p[@class='alert alert-success']");
	
	
}
