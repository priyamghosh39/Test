package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import StepDefinition.ScreenshotUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class DiscountStepDefinition 

{

WebDriver driver;

@Given("^Open browser and start application$")
public void setUp() throws IOException 
{
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32_V2.41\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/"); 
	  ScreenshotUtility.captureScreenshots(driver, "Page opened");
}

@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void testNodiscount(String weight, String distance) throws IOException
{
	driver.findElement(By.id("weight")).sendKeys(weight);
	driver.findElement(By.id("distance")).sendKeys(distance);
	ScreenshotUtility.captureScreenshots(driver, "Inputs Provided");
	driver.findElement(By.id("submit")).click();
	ScreenshotUtility.captureScreenshots(driver, "Message Displayed");
}

@Then("^Validate the output \"([^\"]*)\"$")
public void validateResult(String Msg)
{
	String expected_msg= driver.findElement(By.id("result")).getText();
	Assert.assertEquals(expected_msg, Msg);
}

@After
public void close_browser() throws IOException
{
driver.quit();	
}
}
