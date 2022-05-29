package Pages;

import org.openqa.selenium.By;

public class assignment5_pages {
    
	
	
	//details
	
	
	 public static By  application_type1= By.xpath("//label[normalize-space()='Single']");  //button
	
	 
	 public static By  numberof_dependens= By.xpath("//select[@title='Number of dependants']");   //dropdown 

	 
	 
	 //yearly earnings
	 
	 public static By  annual_income = By.xpath("//body[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");

	 
	 public static By other_annual_income = By.xpath("//body[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]");

	 public static By second_annual_income = By.xpath("");
	 public static By second_other_annual_income = By.xpath("");
	 
	 
	 
	 //expenses 
	 
	 public static By monthly_living_expenses = By.xpath("//input[@id='expenses']"); 

	 
	 public static By home_loan = By.xpath("//input[@id='homeloans']");

	 
	 public static By other_loans  = By.xpath("//input[@id='otherloans']");

	 
	 public static By other_monthly_commitments = By.xpath("//body[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[4]/div[1]/input[1]");

	 
	 public static By  credit_card_limit= By.xpath("//input[@id='credit']");
 
	///workout how much i couldborrow button x_path 
	 public static By  sub_button= By.xpath("//button[@id='btnBorrowCalculater']");
	 
	 
	 
	 
	
			
	 
}




































