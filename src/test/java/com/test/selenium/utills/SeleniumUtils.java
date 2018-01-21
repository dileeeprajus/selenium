package com.test.selenium.utills;

/**
 * Created by sarveshreddy on 21/05/17.
 */


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
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

            System.out.println("Browser is Safari");
             driver = new SafariDriver();
             driver.manage().window().maximize();
             driver.get("http://www.facebook.com");



        }
        System.out.println("Inside Method OpenBrowser()");
        System.out.println("Current Working Directory: "+System.getProperty("user.dir"));
        System.out.println("AUT URL: "+CONFIG.getProperty("AutUrl").toString());
    }








}
