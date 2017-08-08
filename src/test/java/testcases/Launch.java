package testcases;

import utills.SeleniumUtills;
import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sarveshreddy on 18/05/17.
 */
public class Launch {

    SeleniumUtills selenium= new SeleniumUtills();

    public void Launch(){

     selenium = new SeleniumUtills();
    }


    @Given("^I open AUT$")
    public void iOpenAUT() throws Throwable {

        selenium.openBrowser();
    }
}
