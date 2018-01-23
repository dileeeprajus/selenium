package com.test.selenium.utills;

/**
 * Created by sarveshreddy on 21/05/17.
 */


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class SeleniumUtils {


    public static WebDriver driver;
    public static SeleniumUtils selenium;
    PropertiesConfiguration CONFIG;
    String configPath = "/src/test/java/com/test/selenium/config/config.properties";

    public SeleniumUtils() {

        try {
            CONFIG = new PropertiesConfiguration(System.getProperty("user.dir")+configPath);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }


    public static SeleniumUtils getInstance() throws ConfigurationException, InterruptedException {
        if (selenium == null){selenium = new SeleniumUtils();}
        return selenium;
    }


    public void setConfigProperty(String propertyName, String key){ CONFIG.setProperty(propertyName, key); }

    public String getConfigProperty(String propertyName){
        return CONFIG.getProperty(propertyName).toString();
    }



    public void openBrowser(){
        if(CONFIG.getProperty("Browsertype").equals("safari")){

            System.out.println("Opening Safari Browser...");
             driver = new SafariDriver();
             driver.manage().window().maximize();

        }
        if(CONFIG.getProperty("Browsertype").equals("chrome")){

            System.out.println("Opening Chrome Browser...");
            System.out.println("Chrome Driver Path: "+System.getProperty("user.dir")+"\\src\\test\\resource\\drivers\\chromedriver.exe");

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }
        System.out.println("Opening URL: "+CONFIG.getProperty("AutUrl").toString());
        driver.get(CONFIG.getProperty("AutUrl").toString());
    }

    public void quit(){
        if(driver != null){
            driver.quit();
        }
    }








}
