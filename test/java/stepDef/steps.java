package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	 WebDriver driver;
	 String str="https://www.google.com";
	 
	@Given("user opn the browser")
  public void user_opn_the_browser()
	{
      driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	}

	@When("user nevigated to the app url")
  public void user_nevigated_to_the_app_url() 
	{
	  driver.get(str);  
	}
	
	@Then("user able to see application landing page")
   public void user_able_to_see_application_landing_page()
	{
		String title = driver.getTitle();
		Assert.assertEquals("String are not match", "Google", title);
		driver.quit();
	}


}
