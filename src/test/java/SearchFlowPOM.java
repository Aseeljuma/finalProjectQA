import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchFlowPOM {


    public static WebElement getSearchView(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"searchDiv\"]"));
    }

    public static WebElement getSearchBox(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"navsearchbox\"]"));
    }

    public static WebElement getSearchButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
    }

    public static WebElement getSearchResult(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"productTab\"]"));
    }

}
