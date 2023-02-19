import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToCartFlow {

    @Test(priority = 1)
    public void verifyThatItemCounterIsDisplayed() {
        AddToCartFlowPOM.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getItemCounterElement()));

        Assert.assertTrue(AddToCartFlowPOM.getItemCounterElement().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyThatItemCounterPlusButtonIsDisplayed() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getItemCounterPlusButton()));

        Assert.assertTrue(AddToCartFlowPOM.getItemCounterPlusButton().isDisplayed());
    }
    @Test(priority = 3)
    public void verifyThatItemCounterPlusButtonIsClickable() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getItemCounterPlusButton()));
        AddToCartFlowPOM.getItemCounterPlusButton().click();
        AddToCartFlowPOM.getItemCounterPlusButton().click();
    }
    @Test(priority = 4)
    public void verifyThatItemCounterMinusButtonIsDisplayed() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getItemCounterMinusButton()));
        Assert.assertTrue(AddToCartFlowPOM.getItemCounterMinusButton().isDisplayed());
    }

    @Test(priority = 5)
    public void verifyThatItemCounterMinusButtonIsClickable() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getItemCounterMinusButton()));
        AddToCartFlowPOM.getItemCounterMinusButton().click();
    }

    @Test(priority = 6)
    public void verifyThatAddToCartButtonIsDisplayed() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getAddToCartButton()));
        Assert.assertTrue(AddToCartFlowPOM.getAddToCartButton().isDisplayed());
    }

    @Test(priority = 7)
    public void verifyThatAddToCartButtonIsClickable() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getAddToCartButton()));
        AddToCartFlowPOM.driver.manage().deleteAllCookies();

        AddToCartFlowPOM.getAddToCartButton().click();
    }

    @Test(priority = 8)
    public void verifyThatCartIsDisplayed() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getCartTitle()));
        Assert.assertTrue(AddToCartFlowPOM.getCartTitle().isDisplayed());
    }

    @Test(priority = 9)
    public void verifyThatTheItemAddedToCartSuccessfully() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getCartTitle()));
        Assert.assertTrue(AddToCartFlowPOM.getCartTitle().getText().equals(TestData.AddToCartData.SuccessText));

    }

    @Test(priority = 10)
    public void verifyThatCheckOutButtonIsDisplayed() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getCheckOutButton()));
        Assert.assertTrue(AddToCartFlowPOM.getCheckOutButton().isDisplayed());
    }

    @Test(priority = 11)
    public void verifyThatCheckOutButtonIsClickable() {
        AddToCartFlowPOM.wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartFlowPOM.getCheckOutButton()));
        AddToCartFlowPOM.driver.manage().deleteAllCookies();

        AddToCartFlowPOM.getCheckOutButton().click();

    }


}
