import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.NestedFrame;

import java.util.ArrayList;
import java.util.List;


public class Assignment3 extends TestBase {

    NestedFrame nestedFrame;
    public Assignment3(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
        nestedFrame=new NestedFrame();
    }


    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {
        nestedFrame.openUrl();
        nestedFrame.printValuesForNestedFrame();

    }


    @AfterClass
    public void tearDown(){
        exit();
    }
}
