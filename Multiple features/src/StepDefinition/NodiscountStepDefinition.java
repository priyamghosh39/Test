package StepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NodiscountStepDefinition 

{

	WebDriver driver;
	
//	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void testNodiscount(String weight, String distance)
	{
		driver.findElement(By.id("weight")).sendKeys(weight);
		driver.findElement(By.id("distance")).sendKeys(distance);
		driver.findElement(By.id("submit")).click();
		
	}

//	@Then("^Validate the output \"([^\"]*)\"$")
	public void validateResult(String Msg)
	{
		String expected_msg= driver.findElement(By.id("result")).getText();
		Assert.assertEquals(expected_msg, Msg);
	}

}
