import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DiscoverFlow {
    @Test(priority = 1)
    public void CloseAd() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }
    @Test(priority = 2)
    public void verifyThatClickingFurnitureButtonOpensTheFurniturePage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getFurnitureElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getFurnitureElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getFurnitureElement().click();
        DiscoverFlowPOM.getFurnitureElement().click();
    }
    @Test(priority = 3)
    public void verifyThatFurniturePageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Furniture"));
    }
    @Test(priority = 4)
    public void CloseAdFurniture() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }
    @Test(priority = 5)
    public void verifyThatClickingOutdoorButtonOpensTheOutdoorPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getOutdoorElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getOutdoorElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getOutdoorElement().click();
        DiscoverFlowPOM.getOutdoorElement().click();
    }
    @Test(priority = 6)
    public void verifyThatOutdoorPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Outdoor"));
    }
    @Test(priority = 7)
    public void CloseAdOutdoor() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }
    @Test(priority = 8)
    public void verifyThatClickingRugsButtonOpensTheRugsPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getRugsElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getRugsElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getRugsElement().click();
        DiscoverFlowPOM.getRugsElement().click();
    }
    @Test(priority = 9)
    public void verifyThatRugsPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Rugs"));
    }
    @Test(priority = 10)
    public void CloseAdRugs() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }
    @Test(priority = 11)
    public void verifyThatClickingDecorButtonOpensTheDecorPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getDecorAndPillowsElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getDecorAndPillowsElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getDecorAndPillowsElement().click();
        DiscoverFlowPOM.getDecorAndPillowsElement().click();
    }
    @Test(priority = 12)
    public void verifyThatDecorPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Home Decor & Pillows"));
    }
    @Test(priority = 13)
    public void CloseAdDecor() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }

    @Test(priority = 14)
    public void verifyThatClickingLightingButtonOpensTheLightingPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getLightingElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getLightingElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getLightingElement().click();
        DiscoverFlowPOM.getLightingElement().click();
    }
    @Test(priority = 15)
    public void verifyThatLightingPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Lighting"));
    }
    @Test(priority = 16)
    public void CloseAdLighting() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }

    @Test(priority = 17)
    public void verifyThatClickingWallDecorButtonOpensTheWallDecorPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getWallDecorAndMirrorsElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getWallDecorAndMirrorsElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getWallDecorAndMirrorsElement().click();
        DiscoverFlowPOM.getWallDecorAndMirrorsElement().click();
    }
    @Test(priority = 18)
    public void verifyThatWallDecorPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Wall Decor & Mirrors"));
    }
    @Test(priority = 19)
    public void CloseAdWallDecor() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }

    @Test(priority = 20)
    public void verifyThatClickingKitchenButtonOpensTheKitchenPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getKitchenElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getKitchenElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getKitchenElement().click();
        DiscoverFlowPOM.getKitchenElement().click();
    }
    @Test(priority = 21)
    public void verifyThatKitchenPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Kitchen"));
    }
    @Test(priority = 22)
    public void CloseAdKitchen() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }


    @Test(priority = 23)
    public void verifyThatClickingDiningButtonOpensTheDiningPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getDiningElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getDiningElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getDiningElement().click();
        DiscoverFlowPOM.getDiningElement().click();
    }
    @Test(priority = 24)
    public void verifyThatDiningPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Dining"));
    }
    @Test(priority = 25)
    public void CloseAdDining() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }

    @Test(priority = 26)
    public void verifyThatClickingFoodButtonOpensTheFoodPage() {
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getFoodAndDrinkElement()));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getFoodAndDrinkElement()));
        Setup.driver.manage().deleteAllCookies();

        DiscoverFlowPOM.getFoodAndDrinkElement().click();
        DiscoverFlowPOM.getFoodAndDrinkElement().click();
    }
    @Test(priority = 27)
    public void verifyThatFoodPageIsDisplayed() {
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Setup.wait.until(ExpectedConditions.visibilityOfAllElements(DiscoverFlowPOM.getCategoryPageHeader()));

        Assert.assertTrue(DiscoverFlowPOM.getCategoryPageHeader().getText().equals("Food & Drink"));
    }
    @Test(priority = 28)
    public void CloseAdFood() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }



}
