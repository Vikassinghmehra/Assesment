import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.ShadowDom;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 extends TestBase {

    ShadowDom shadowDom;
    public Assignment2(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
        shadowDom=new ShadowDom();
    }


    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {

        shadowDom.openUrl();
        shadowDom.listOfTextAndPrint();

    }


    @AfterClass
    public void tearDown(){
        exit();
    }
}
