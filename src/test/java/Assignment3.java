import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class Assignment3 extends TestBase {

    public Assignment3(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
    }


    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {
        driver.get(prop.getProperty("url3"));
        Thread.sleep(4000);
        WebElement webElement;

        String []list={"frame-left","frame-middle","frame-right"};
        for(int i=0;i<list.length;i++){
            if(list[i]=="frame-middle"){
                driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
                driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='" + list[i] + "']")));
                webElement = driver.findElement(By.xpath("//div[@id='content']"));
                System.out.println("---------------------------" + webElement.getText());
                driver.switchTo().defaultContent();
            }else {
                driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
                driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='" + list[i] + "']")));
                webElement = driver.findElement(By.xpath("//body"));
                System.out.println("---------------------------" + webElement.getText());
                driver.switchTo().defaultContent();
            }
        }
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        webElement = driver.findElement(By.xpath("//body"));
        System.out.println("---------------------------" + webElement.getText());

    }


    @AfterClass
    public void tearDown(){
        exit();
    }
}
