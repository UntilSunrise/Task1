package Task4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class NewJava {
    private WebDriver driver;
    private String url = "https://www.softserveinc.com/uk-ua/";
    String word = "мовна школа";

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("The setup process is completed");
    }

    @BeforeTest
    public void profileSetup(){
        driver.manage().window().maximize();
        System.out.println("The profile setup process is complited");
    }

    @BeforeClass
    public void appSetup(){
        driver.get(url);
        System.out.println("The app setup process is completed");
    }

    @Test(groups = {"NewJava"})
    public void secondTest() throws InterruptedException{
        driver.navigate().refresh();

        WebElement searchLink = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/header/div[1]/div/a")));
        searchLink.click();

        WebElement elementEnter = driver.findElement(By.xpath("//*[@id=\"p_lt_ctl04_pageplaceholder_p_lt_ctl01_SmartSearchBox_txtWord\"]"));

        elementEnter.sendKeys(word);
        elementEnter.sendKeys(Keys.ENTER);

        WebElement pressButtonClick = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit' and @value='Пошук']")));
        pressButtonClick.click();

    }

    @AfterClass
    public void closeUp(){
        driver.quit();
        System.out.println("The close_up process is completed");
    }
}
