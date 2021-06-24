package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ShadowDom extends TestBase {

    @FindBy(xpath = "//span[@slot='my-text']")
    WebElement text1;

    @FindBy(xpath = "//li[normalize-space()=\"Let's have some different text!\"]")
    WebElement text2;



    public ShadowDom(){
        PageFactory.initElements(driver,this);
    }


    public void openUrl() {
        try {
            driver.get(prop.getProperty("url2"));
            System.out.println("Url Opened");
        }catch(Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to Open the expected url");
        }
    }

    public void listOfTextAndPrint() {
        try{

            List<String> list=new ArrayList<String>() ;
            list.add(text1.getText());
            list.add(text2.getText());
            for(String s :list){
                System.out.println("------------------------------------");
                System.out.println(s);
            }
            System.out.println("Text Printed");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Text not Printed");
        }
    }
}
