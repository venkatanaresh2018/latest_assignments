package Logic;

import static Logic.LaunchBrowsers.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import Pages.assignment5_pages;

public class assignment_5 {

	
	public static void anz() throws InterruptedException {
		
		Thread.sleep(3000);
		

	
		
		System.out.print("venkat1");

		Thread.sleep(3000);
		
		// number of dependencies
		
		Select number_of_dependencies = new Select(driver.findElement(assignment5_pages.numberof_dependens));
		
		number_of_dependencies.selectByIndex(0);
	 
		Thread.sleep(3000);
	
	   //annual income before tax 
		
		driver.findElement(assignment5_pages.annual_income).sendKeys("80000");
		Thread.sleep(3000);
	
		//annual other income 
	
		driver.findElement(assignment5_pages.other_annual_income).sendKeys("10000");
		
		//Monthly living expenses Tooltip
		driver.findElement(assignment5_pages.monthly_living_expenses).sendKeys("500");

		//Current home loan monthly repayments
		
		Thread.sleep(3000);
		driver.findElement(assignment5_pages. home_loan).sendKeys("0");

		//Other loan monthly repayments Tooltip
		driver.findElement(assignment5_pages.other_loans).sendKeys("100");
		
		//Other monthly commitments Tooltip
		
		driver.findElement(assignment5_pages.other_monthly_commitments).sendKeys("0");
		Thread.sleep(3000);
		//otal credit card limits
		
		driver.findElement(assignment5_pages.credit_card_limit).sendKeys("100000");
		
		Thread.sleep(5000);
	
		driver.findElement(assignment5_pages.sub_button).click();
		Thread.sleep(5000);
		
		
	}
    		 
    
    

  
  
    
    
    
    
    

}
