package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test

    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        //1.1 click on shipping link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Shipping')]"));
        //1.2 verify the text "shipping"
        String expectedverifyMessage ="Shipping";
        String actualverifyMessage = driver.findElement(By.xpath("//h1[@id='page-title']")).getText();
        Assert.assertEquals("Verify shipping",expectedverifyMessage,actualverifyMessage);

    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        //2.1 Click on the “New!” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]"));
        //2.2 Verify the text “New arrivals”
        String expectedNavigateMessage ="New arrivals";
        String actualNavigateMessage = driver.findElement(By.xpath("//h1[@id='page-title']")).getText();
        Assert.assertEquals("Not New Link!",expectedNavigateMessage,actualNavigateMessage);

    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        //3.1 Click on the “Coming soon” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Coming soon')]"));
        //3.2 Verify the text “Coming soon”
        String expectedCommingMessage = "Coming soon";
        String actualCommingMessage = driver.findElement(By.xpath("//h1[@class='title']")).getText();
        Assert.assertEquals("not commingsoon",expectedCommingMessage,actualCommingMessage);

    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        //4.1 Click on the “Contact us” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Contact us')]"));
        //4.2 Verify the text “Contact us”
        String expectedContactMessage = "Contact us";
        String actualContactMessage = driver.findElement(By.xpath("//h1[@id='page-title']")).getText();
        Assert.assertEquals("not commingsoon",expectedContactMessage,actualContactMessage);

    }
}
