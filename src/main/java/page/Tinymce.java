package page;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tinymce extends TestBase {

    @FindBy(xpath = "//*[@id=\"tinymce\"]//p")
    WebElement para;

    @FindBy(xpath = "//button[@title='Bold']")
    WebElement bold;

    @FindBy(xpath = "//div[@role='menubar']//button[4]")
    WebElement format;


    @FindBy(xpath = "//div[contains(text(),'Font sizes')]")
    WebElement fontSize;

    @FindBy(xpath = "//div[@title='24pt']")
    WebElement size24;



    public Tinymce(){
        PageFactory.initElements(driver,this);
    }

    public void openUrl(){
        try {
            driver.get(prop.getProperty("url1"));
            System.out.println("Url Opened");
        }catch(Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to Open the expected url");
        }
    }
    public void switchToFrameAndClear() {

        try {
            driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
            para.click();
            para.clear();
            System.out.println("Cleared Textbox");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to Cleared Textbox");
        }

    }
    public void addTextInTextbox(String s){
        try{
            para.sendKeys(s);
            System.out.println("Able to Enter text ");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to Enter text ");

        }
    }

    public void addEnterInTextBox(){
        try{
            para.sendKeys(Keys.ENTER);
            System.out.println("Enter pressed ");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to Press Enter");

        }
    }

    public void switchToMainPage(){
        try{
        driver.switchTo().defaultContent();
        System.out.println("Focus changed to Default page");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Focus not changed to Default page");
        }
    }

    public void clickBold(){
        try{
            bold.click();
            System.out.println("Clicked on Bold");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Bold is not click");
        }
    }


    public void clickFormatSelectFontSize(){
        try{
            format.click();
            fontSize.click();
            size24.click();
            System.out.println("Size selected 24");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("Not able to select size");
        }
    }









}
