import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1 extends TestBase{

    public Assignment1(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
    }


    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {
        driver.get(prop.getProperty("url1"));
        Thread.sleep(4000);
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        WebElement webElement=driver.findElement(By.xpath("//*[@id=\"tinymce\"]//p"));
        webElement.click();
        webElement.clear();
        webElement.sendKeys("test1");
        Thread.sleep(2000);
        webElement.sendKeys(Keys.ENTER);
        webElement.sendKeys("test2");
        driver.switchTo().defaultContent();
        WebElement webElement1=driver.findElement(By.xpath("//button[@title='Bold']"));
        webElement1.click();
        Thread.sleep(3000);
        webElement=driver.findElement(By.xpath("//div[@role='menubar']//button[4]"));
        webElement.click();
        Thread.sleep(2000);
        webElement= driver.findElement(By.xpath("//div[contains(text(),'Font sizes')]"));
        webElement.click();
        webElement= driver.findElement(By.xpath("//div[@title='24pt']"));
        webElement.click();
    }


    @AfterClass
    public void tearDown(){
        exit();
    }


}
