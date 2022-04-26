package hotdeals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
@Test
    public void verifySaleProudctsArrangeAlphabetically() {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //1.2 Mouse hover on the “Sale”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']"));
        //1.3 Verify the text “Sale”
        String expectedTextMessage ="Sale";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Sale']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage,actualTextMessage);
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
       clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));
        //1.5 Verify that the product arrange alphabetically
        String expectedTextMessage1 ="Name A - Z";
        String actualTextMessage1 = driver.findElement(By.xpath("//span[text()='Name A - Z']")).getText();
        Assert.assertEquals("Not arranged alphabet", expectedTextMessage1,actualTextMessage1);
    }@Test
    public void verifySaleProudctsPriceArrangeLowTOHigh() {
        //2.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //2.2 Mouse hover on the “Sale”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']"));
        //2.3 Verify the text “Sale”
        String expectedTextMessage ="Sale";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Sale']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage,actualTextMessage);
        //2.4 Mouse hover on “Sort By” and select “Price Low-High”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        //2.5 Verify that the product’s price arrange Low to High
        String expectedTextMessage1 ="Price High - Low";
        String actualTextMessage1 = driver.findElement(By.xpath("//span[text()='Price High - Low']")).getText();
        Assert.assertEquals("Not Low to High", expectedTextMessage1,actualTextMessage1);
    }@Test
    public void verifySaleProudctsArrangeByRates() {
        //3.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //3.2 Mouse hover on the “Sale”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']"));
        //3.3 Verify the text “Sale”
        String expectedTextMessage ="Sale";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Sale']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage,actualTextMessage);
        //3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]"));
        //3.5 Verify that the product’s arrange Rates
        String expectedTextMessage1 ="Rates";
        String actualTextMessage1 = driver.findElement(By.xpath("//span[text()='Rates ']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage1,actualTextMessage1);
    }@Test
    public void verifyBestSellerProudctsArrangeByZToA() throws InterruptedException {
        //4.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //4.2 Mouse hover on the “Bestsellers”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        //4.3 Verify the text “Bestsellers”
        String expectedTextMessage ="Bestsellers";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Bestsellers']")).getText();
        Assert.assertEquals("Not Bestseller", expectedTextMessage,actualTextMessage);
        //4.4 Mouse hover on “Sort By” and select “Name Z-A”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='desc']"));
        //4.5 Verify that the product arrange by Z to A
        String expectedTextMessage1 ="Name Z - A";
        Thread.sleep(1000);
        String actualTextMessage1 = getTextFromElement(By.xpath("//span[text()='Name Z - A']"));
        Assert.assertEquals("Not z-a", expectedTextMessage1,actualTextMessage1);
    }@Test
    public void verifyBestSellersProductsPriceArrangeHighTOLow() {
        //5.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //5.2 Mouse hover on the “Bestsellers” link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        //5.3 Verify the text “Bestsellers”
        String expectedTextMessage ="Bestsellers";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Bestsellers']")).getText();
        Assert.assertEquals("Not Bestseller", expectedTextMessage,actualTextMessage);
        //5.4 Mouse hover on “Sort By” and select “Price High-Low”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
      clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
        //5.5 Verify that the product’s price arrange High to Low
        String expectedTextMessage1 ="Price High - Low";
        String actualTextMessage1 = getTextFromElement(By.xpath("//span[text()='Price High - Low']"));
        Assert.assertEquals("Not Bestseller", expectedTextMessage1,actualTextMessage1);

    }@Test
    public void verifyBestSellerProductsArrangeByRates() {
        //6.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //6.2 Mouse hover on the “Bestsellers”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        //6.3 Verify the text “Bestsellers”
        String expectedTextMessage ="Bestsellers";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Bestsellers']")).getText();
        Assert.assertEquals("Not Bestseller", expectedTextMessage,actualTextMessage);
        //6.4 Mouse hover on “Sort By” and select “Rates”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
       clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]"));
        //6.5 Verify that the product’s arrange Rates
        String expectedTextMessage1 ="Rates";
        String actualTextMessage1 = driver.findElement(By.xpath("//span[text()='Rates ']")).getText();
        Assert.assertEquals("Not Bestseller", expectedTextMessage1,actualTextMessage1);
    }
}
