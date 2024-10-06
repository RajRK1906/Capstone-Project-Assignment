package stepdefinition;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;


public class Step {
	
	static WebDriver driver;
	
	@Test
	
	@Given("I launch the application")
	public void i_launch_the_application() {
	    driver = new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("http://the-internet.herokuapp.com/");
	   
	}
	
	@Test

	@When("I verify the title of the page")
	public void i_verify_the_title_of_the_page() {
		 String title = driver.getTitle();
	        Assert.assertEquals(title, "The Internet");
	       
	    
	}
	
	@Test
	@And("I click on A\\/B Testing link")
	public void i_click_on_a_b_testing_link() {
		driver.findElement(By.linkText("A/B Testing")).click();
	    
	}
	
	@Test
	@Then("I verify the text on the A\\/B Testing page")
	public void i_verify_the_text_on_the_a_b_testing_page() {
		 String text = driver.findElement(By.tagName("h3")).getText();
	        Assert.assertEquals(text, "A/B Test Variation 1");
	   
	}

	@Test
	@When("I navigate back to the home page")
	public void i_navigate_back_to_the_home_page() {
		driver.navigate().back();
	    
	}
	
	@Test

	@And("I click on the dropdown link")
	public void i_click_on_the_dropdown_link() {
		driver.findElement(By.linkText("Dropdown")).click();
	   
	}

	@Test
	@And("I select Option {int}")
	public void i_select_option(Integer int1) {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        dropdown.findElement(By.xpath("//option[text()='Option 1']")).click();
	    
	}
	
	@Test

	@Then("I confirm the selection")
	public void i_confirm_the_selection() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
        String selectedOption = dropdown.findElement(By.cssSelector("option:checked")).getText();
        Assert.assertEquals(selectedOption, "Option 1");
	    
	}
	
	@Test

	@And("I click on Frames")
	public void i_click_on_frames() {
		 driver.findElement(By.linkText("Frames")).click();
	   
	}
	
	@Test

	@Then("I verify the presence of nested frames and iframe links")
	public void i_verify_the_presence_of_nested_frames_and_iframe_links() {
		Assert.assertTrue(driver.findElements(By.linkText("Nested Frames")).size() > 0);
        Assert.assertTrue(driver.findElements(By.linkText("iFrame")).size() > 0);
        	   
	}
	
	@Test
	
	@And ("close the browser")
	public void close_the_browser() {
		driver.close();
	}




}
