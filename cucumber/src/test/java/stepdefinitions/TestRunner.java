package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sindhuja\\eclipse-workspace\\cucumber\\src\\main\\resources\\cucumber27\\google.feature",glue={"stepdefinitions"})

public class TestRunner {

}
