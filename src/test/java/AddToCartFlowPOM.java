import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddToCartFlowPOM {
    public static ChromeDriver driver;
    public static WebDriverWait wait;
    @Test(priority = 1)
    public void setUp() {
        ChromeOptions options= new ChromeOptions();
        // options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 60);
        driver.get("https://www.worldmarket.com/product/milan+round+white+marble+and+metal+coffee+table.do?sortby=ourPicks&from=fn");
    }
    public static WebElement getItemCounterElement(){
        return driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/div[2]/div[8]/div[1]/div[1]/div[2]"));
    }

    public static WebElement getItemCounterPlusButton(){
        return driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/div[2]/div[8]/div[1]/div[1]/div[2]/span[2]/div/div/span[2]/button"));
    }

    public static WebElement getItemCounterMinusButton(){
        return driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/div[2]/div[8]/div[1]/div[1]/div[2]/span[2]/div/div/span[1]/button"));
    }

    public static WebElement getAddToCartButton(){
        return driver.findElement(By.xpath("//*[@id=\"addToBasket448984\"]"));
    }

    public static WebElement getCartTitle(){
        return driver.findElement(By.xpath("//*[@id=\"sideCartRail\"]/div[2]/div[2]/div/span"));
    }

    public static WebElement getCheckOutButton(){
        return driver.findElement(By.xpath("//*[@id=\"sideCartRail\"]/div[3]/div/div[4]/div/button"));
    }

}
