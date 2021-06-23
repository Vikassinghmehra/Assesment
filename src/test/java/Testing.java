import base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing extends TestBase{

    public Testing(){
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

    }


    @AfterClass
    public void tearDown(){
        exit();
    }


}
