package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "/Users/vikasmehra/Downloads/chromedriver");

        //Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Navigate to web page
        driver.get("https://google.com/");
        Thread.sleep(4000);
        driver.quit();

    }

}
