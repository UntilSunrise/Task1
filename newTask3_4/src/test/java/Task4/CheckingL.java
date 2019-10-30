package Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class CheckingL {
    private WebDriver driver;
    private String url = "https://www.softserveinc.com/uk-ua/";
    private List<WebElement> serviceE;
    private List<String> serviceL;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

        serviceL = new ArrayList<String>();
        serviceL.add("Програмне забезпечення");
        serviceL.add("Хмарні технології");
        serviceL.add("Великі дані");
        serviceL.add("Штучний інтелект");
        serviceL.add("Інтернет речей (IoT)");
        serviceL.add("Сервісний дизайн");
        serviceL.add("Кібербезпека");
        serviceL.add("Цифрові платформи");
        serviceL.add("Розширена реальність (XR)");

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

    @Test
    public void resultList() {
        serviceE = driver.findElements(By.className("service-nav-link"));

        if(serviceE != null)
            Assert.assertEquals(serviceE.size(), serviceL.size()); //compare Elements and Elements in my List
        else
        {
            System.out.println("Error, elements not compare");
        }
    }

    @AfterClass
    public void closeUp(){
        driver.quit();
        System.out.println("The close_up process is completed");
    }

}
