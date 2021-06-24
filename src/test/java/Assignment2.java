import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 extends TestBase {

    public Assignment2(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
    }


    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {
        driver.get(prop.getProperty("url2"));
        Thread.sleep(4000);
        WebElement webElement=driver.findElement(By.xpath("//span[@slot='my-text']"));
        List <String> list=new ArrayList<String>() ;

        list.add(webElement.getText());
        webElement=driver.findElement(By.xpath("//li[normalize-space()=\"Let's have some different text!\"]"));
        list.add(webElement.getText());

        for(String s :list){
            System.out.println("------------------------------------");
            System.out.println(s);
        }

    }


    @AfterClass
    public void tearDown(){
        exit();
    }
}
