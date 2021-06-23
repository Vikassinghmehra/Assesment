package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestBase {

    protected static WebDriver driver;
    public static Properties prop;


    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void initialization(){
            String browserName = prop.getProperty("browser");

            if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "/Users/vikasmehra/Downloads/chromedriver");
                driver = new ChromeDriver();
            }
            else if(browserName.equals("FF")){
                System.setProperty("webdriver.gecko.driver", "/Users/vikasmehra/Downloads/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));

        }

}
