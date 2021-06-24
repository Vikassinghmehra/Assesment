package page;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class NestedFrame extends TestBase {


    @FindBy(xpath = "//frame[@name='frame-top']")
    WebElement top_frame;

    @FindBy(xpath = "//div[@id='content']")
    WebElement div;

    @FindBy(xpath = "//frame[@name='frame-bottom']")
    WebElement bottom_frame;

    @FindBy(xpath = "//body")
    WebElement body;


    public NestedFrame(){
        PageFactory.initElements(driver,this);
    }


    public void openUrl() {
        try {
            driver.get(prop.getProperty("url3"));
            System.out.println("Url Opened");
        }catch(Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to Open the expected url");
        }
    }

    public void printValuesForNestedFrame(){
        try{
            String []list={"frame-left","frame-middle","frame-right"};
            for(int i=0;i<list.length;i++){
                if(list[i]=="frame-middle"){
                    driver.switchTo().frame(top_frame);
                    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='" + list[i] + "']")));
                    System.out.println("---------------------------" + div.getText());
                    driver.switchTo().defaultContent();
                }else {
                    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
                    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='" + list[i] + "']")));
                    //webElement = driver.findElement(By.xpath("//body"));
                    System.out.println("---------------------------" + body.getText());
                    driver.switchTo().defaultContent();
                }
            }

            driver.switchTo().frame(bottom_frame);
            System.out.println("---------------------------" + body.getText());


        }catch(Exception e){

        }
    }


}
