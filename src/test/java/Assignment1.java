import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Tinymce;

public class Assignment1 extends TestBase{
    Tinymce tinymce;


    public Assignment1(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
        tinymce=new Tinymce();
    }


    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {

        tinymce.openUrl();
        tinymce.switchToFrameAndClear();
        tinymce.addTextInTextbox("test1");
        tinymce.addEnterInTextBox();
        tinymce.addTextInTextbox("test2");
        tinymce.switchToMainPage();
        tinymce.clickBold();
        tinymce.clickFormatSelectFontSize();

    }


    @AfterClass
    public void tearDown(){
        exit();
    }


}
