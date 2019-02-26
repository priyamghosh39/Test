package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

//Bapi bari jaa

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Feature", glue={"StepDefinition"})
public class CompanyJunit 
{

}
