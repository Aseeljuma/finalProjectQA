import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchFlow {
    @Test(priority = 1)
    public void CloseAd() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }
    @Test(priority = 2)
    public void verifySearchViewIsDisplayed() {
        Assert.assertTrue(SearchFlowPOM.getSearchView().isDisplayed());
    }

    @Test(priority = 3)
    public void verifySearchBoxIsEditable() {
        Assert.assertTrue(SearchFlowPOM.getSearchBox().isEnabled());
    }
    @Test(priority = 4)
    public void verifyThatWhenClickOnSearchButtonSearchResultDisplayed() {
        SearchFlowPOM.getSearchBox().sendKeys(TestData.SearchData.testSearchText);
        Setup.driver.manage().deleteAllCookies();

        SearchFlowPOM.getSearchButton().click();

        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(SearchFlowPOM.getSearchResult().getText().contains(TestData.SearchData.SuccessText)  );
    }

    @Test(priority = 5)
    public void verifySearchButtonIsClickable() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchFlowPOM.getSearchButton()));
        Setup.driver.manage().deleteAllCookies();

        SearchFlowPOM.getSearchButton().click();
    }


}
