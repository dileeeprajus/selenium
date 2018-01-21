package com.test.selenium.testcases;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.apache.commons.configuration.ConfigurationException;
import com.test.selenium.utills.SeleniumUtils;
import cucumber.api.java.en.Given;

/**
 * Created by sarveshreddy on 18/05/17.
 */
public class Launch {

   public SeleniumUtils selenium;

    public    Launch(){
        System.out.println("Launch Constructor");
        try {
            selenium = SeleniumUtils.getInstance();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Given("^I open AUT$")
    public void iOpenAUT() throws Throwable {
        System.out.println("Current Working Directory");
        selenium.openBrowser();
    }

    @And("^I test$")
    public void iTest() throws Throwable {

        System.out.println("Current Working Directory");
    }
}
