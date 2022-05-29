package Pages;

import org.openqa.selenium.By;

public class assignment1_page {

	
	

	
	public static By   my_account =By.xpath("//a[normalize-space()='My Account']");

	//registering process 
	
	 
	public static By E_mail_address= By.xpath("//input[@id='reg_email']");
	
	
	public static By  Password=By.xpath("//input[@id='reg_password']");
	
	
	public static By Register_button=By.xpath("//input[@name='register']");
	
	
	public static By Address_button=By.xpath("//a[normalize-space()='Addresses']");
	
	
	
	public static By    Edit=By.xpath("//a[@href='http://practice.automationtesting.in/my-account/edit-address/billing']");
	
	
	public static By  First_Name=By.xpath("//input[@id='billing_first_name']");
	
	
	public static By Last_Name=By.xpath("//input[@id='billing_last_name']");
	
	public static By   Company_Name=By.xpath("//input[@id='billing_company']");
	
	//public static By  Email Address =By.xpath(""
	
	public static By    Phone =By.xpath("//input[@id='billing_phone']");
	
	
	public static By   Country =By.xpath("//input[@id='s2id_autogen1_search']");

	
	public static By   street_Address =By.xpath("//input[@id='billing_address_1']");

	
	public static By appartmemt_address=By.xpath("//input[@id='billing_address_2']");

	
	public static By town_address=By.xpath("//input[@id='billing_city']");
	
	public static By  State =By.xpath("//span[@id='select2-chosen-2']");
	
	public static By  Postcode =By.xpath("//input[@id='billing_postcode']");

	public static By  save_address =By.xpath( "//input[@name='save_address']");
	
	public static By  Log_out =By.xpath("//a[normalize-space()='Logout']");
	
	
	
	//Login_process
	
	public static By   Login_Username  =By.xpath("//input[@id='username']");
	
	public static By    Login_Password=By.xpath("//input[@id='password']");
	
	public static By     Login_button=By.xpath("//input[@name='login']");
	
	
}
