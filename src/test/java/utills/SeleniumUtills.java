package utills;

/**
 * Created by sarveshreddy on 21/05/17.
 */
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SeleniumUtills {

    final static Logger log = Logger.getLogger(SeleniumUtills.class);


    WebDriver driver;
    PropertiesConfiguration CONFIG;
    String configPath = "/src/test/java/config/config.properties";


    public SeleniumUtills() {

        System.out.println("Inside SeleniumUtills Constructor");
        try {
            CONFIG = new PropertiesConfiguration(System.getProperty("user.dir")+configPath);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void openBrowser(){
        log.debug("About to open a Browser");
        System.out.println("Inside Method OpenBrowser()");
        System.out.println("Current Working Directory: "+System.getProperty("user.dir"));

        System.out.println("AUT URL: "+CONFIG.getProperty("AutUrl").toString());
    }


    public void navigateToAut(){
        System.out.println("Current AUT URL:");
    }

    public void setConfigProperty(String propertyName, String key){
        CONFIG.setProperty(propertyName, key);

    }
    public String getConfigProperty(String propertyName){
        return CONFIG.getProperty(propertyName).toString();
    }
}
