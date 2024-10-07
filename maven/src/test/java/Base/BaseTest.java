package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class BaseTest {
	
	protected static WebDriver driver;
	
	 @BeforeClass
	
	@Given("I launch the application")
	public void i_launch_the_application() {
	    driver = new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("http://the-internet.herokuapp.com/");
	    System.out.println("Application launched successfully.");
	   
	}
	 
	 @AfterClass
		
		@And ("close the browser")
		public void close_the_browser() {
			driver.close();
		    System.out.println("Browser closed successfully.");
	 }

}
