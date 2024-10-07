package stepdefinition;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;


public class Step  extends BaseTest {
	
	
	 
	 @Test(priority = 1)

	@When("I verify the title of the page")
	public void i_verify_the_title_of_the_page() {
		 String title = driver.getTitle();
	        Assert.assertEquals(title, "The Internet");	 
	        System.out.println("Page title verified successfully.");
	    
	}
	 
	 @Test(priority = 2)
	 
	@And("I click on A\\/B Testing link")
	public void i_click_on_a_b_testing_link() {
		driver.findElement(By.linkText("A/B Testing")).click();
		 System.out.println("Clicked on A/B Testing link.");
	    
	}
	
	 @Test(priority = 3)
	
	@Then("I verify the text on the A\\/B Testing page")
	public void i_verify_the_text_on_the_a_b_testing_page() {
		 String text = driver.findElement(By.tagName("h3")).getText();
	        Assert.assertEquals(text, "A/B Test Variation 1");
	        System.out.println("Text verified successfully.");
	   
	}
	 

	 @Test(priority = 4)
	 
	@When("I navigate back to the home page")
	public void i_navigate_back_to_the_home_page() {
		driver.navigate().back();
		 System.out.println("Navigated back to the home page.");
	    
	}
	
	 @Test(priority = 5)

	@And("I click on the dropdown link")
	public void i_click_on_the_dropdown_link() {
		driver.findElement(By.linkText("Dropdown")).click();
		System.out.println("Clicked on the dropdown link.");
	   
	}
     
	 @Test(priority = 6)
     
	@And("I select Option {int}")
	public void i_select_option(Integer int1) {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        dropdown.findElement(By.xpath("//option[text()='Option 1']")).click();
        System.out.println("Selected Option 1 from the dropdown.");
        	    
	}
	 
	
	 @Test(priority = 7)
	 
	@Then("I confirm the selection")
	public void i_confirm_the_selection() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
        String selectedOption = dropdown.findElement(By.cssSelector("option:checked")).getText();
        Assert.assertEquals(selectedOption, "Option 1");
        System.out.println("Selection confirmed successfully.");
	    
	}
	
	 @Test(priority = 8)

	@And("I click on Frames")
	public void i_click_on_frames() {
		 driver.findElement(By.linkText("Frames")).click();
		 System.out.println("Clicked on Frames link.");	   
	}
	
	 @Test(priority = 9)

	@Then("I verify the presence of nested frames and iframe links")
	public void i_verify_the_presence_of_nested_frames_and_iframe_links() {
		Assert.assertTrue(driver.findElements(By.linkText("Nested Frames")).size() > 0);
        Assert.assertTrue(driver.findElements(By.linkText("iFrame")).size() > 0);
        System.out.println("Verified presence of nested frames and iframe links.");
        	   
	}
	
	
	}





