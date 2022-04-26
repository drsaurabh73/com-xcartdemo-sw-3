package shopping;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.sql.Timestamp;

public class ShoppingTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }@Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {

        //1.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        //1.3 Verify the text “Bestsellers”
        String expectedTextMessage ="Bestsellers";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Bestsellers']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage,actualTextMessage);

        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        //1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
       // mouseHover(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']"));
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedTextMessage1 ="Product has been added to your cart";
        String actualTextMessage1 = driver.findElement(By.xpath("//li[text()='Product has been added to your cart']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage1,actualTextMessage1);

        //1.7 Click on X sign to close the message
        clickOnElement(By.xpath("//a[@class='close']"));
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@title='Your cart']"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//span[text()='View cart']"));
        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedTextMessage2 ="Your shopping cart - 1 item";
        String actualTextMessage2 = driver.findElement(By.xpath("//h1[text()='Your shopping cart - 1 item']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage2,actualTextMessage2);
        //1.10 Verify the Subtotal $299.00
        String actualMessage5_1 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[1]"));
        String actualMessage5_3 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[3]"));
        String actualMessage5_2 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[2]"));
        String actualMessage5_4 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[4]"));
        String actualMessage3 = actualMessage5_1 + actualMessage5_2 + actualMessage5_3 + actualMessage5_4; // Combining price to single string
        String expectedTextMessage3 ="$299.00";
      //  String actualTextMessage3 = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage3,actualMessage3);


        //1.11 Verify the total $309.73
        String actualMessage6_1 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']"));
        String actualMessage6_2 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-integer']"));
        String actualMessage6_3 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']"));
        String actualMessage6_4 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']"));
        String actualMessage4 = actualMessage6_1 + actualMessage6_2 + actualMessage6_3 + actualMessage6_4;// Combining price to single string


        String expectedTextMessage4 ="$309.73";
        //String actualTextMessage4 = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage4,actualMessage4);

        //1.12 Click on “Go to checkout” button
        clickOnElement(By.xpath("//button[@class='btn  regular-button regular-main-button checkout']"));
        //1.13 Verify the text “Log in to your account”
        String expectedTextMessage5 ="Log in to your account";
        String actualTextMessage5 = driver.findElement(By.xpath("//h3[text()='Log in to your account']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage5,actualTextMessage5);
        //1.14 Enter Email address
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = "sam"+timestamp.getTime()+"@domain.com";
        sendTextToElement(By.xpath("//input[@name='email']"),"samptail@gmail.com");
        //1.15 Click on “Continue” Button
        clickOnElement(By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']"));
        //1.16 Verify the text “Secure Checkout”  email:samptail@gmail.com
        String expectedTextMessage6 ="Secure Checkout";
        String actualTextMessage6 = driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage6,actualTextMessage6);
        //1.17 Fill all the mandatory fields
        sendTextToElement(By.xpath("//input[@name='shippingAddress[firstname]']"));
        sendTextToElement(By.xpath("//input[@name='shippingAddress[firstname]']"),"sam");
        sendTextToElement(By.xpath("//input[@name='shippingAddress[lastname]']"));
        sendTextToElement(By.xpath("//input[@name='shippingAddress[lastname]']"),"patil");
        sendTextToElement(By.xpath("//input[@name='shippingAddress[street]']"),"LA");
        sendTextToElement(By.xpath("//input[@name='shippingAddress[city]']"));
        sendTextToElement(By.xpath("//input[@name='shippingAddress[city]']"),"uk");
        sendTextToElement(By.xpath("//input[@name='shippingAddress[custom_state]']"),"Leicester");
        sendTextToElement(By.xpath("//input[@name='shippingAddress[zipcode]']"));
        sendTextToElement(By.xpath("//input[@name='shippingAddress[zipcode]']"),"90005");
        sendTextToElement(By.xpath("//input[@name='email']"));

       // Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       // String emailAddress1 = "sam"+timestamp.getTime()+"@domain.com";
        sendTextToElement(By.xpath("//input[@name='email']"),emailAddress);



      //  sendTextToElement(By.xpath("//input[@name='email']"),"samptail@gmail.com");


        //1.18 Check the check box “Create an account for later use”
        Thread.sleep(1000);
        clickOnElement(By.xpath("//input[@id='create_profile']"));
        //1.19 Enter the password
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@name='password']"),"@123456");
        //1.20 Select the Delivery Method to “Local Shipping”
        clickOnElement(By.xpath("//input[@value='128']"));
        //1.21 Select Payment Method “COD”
        Thread.sleep(1000);
        clickOnElement(By.xpath("//input[@value='6']"));
        //1.22 Verify the total $311.03
        String actualMessage9_1 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']"));
        String actualMessage9_2 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-integer']"));
        String actualMessage9_3 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']"));
        String actualMessage9_4 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']"));
        String actualMessage7 = actualMessage9_1 + actualMessage9_2 + actualMessage9_3 + actualMessage9_4;

        String expectedTextMessage7 ="$311.03";
       // String actualTextMessage7 = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage7,actualMessage7);


        //1.23 Click on “Place Order” Button
        clickOnElement(By.xpath("//button[@class='btn regular-button regular-main-button place-order submit disabled']"));
        //1.24 Verify the text “Thank you for your order”
        String expectedTextMessage8 ="Thank you for your order";
        String actualTextMessage8 = driver.findElement(By.xpath("//h1[text()='Thank you for your order']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage8,actualTextMessage8);


    }@Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']"));
        //1.2 Mouse hover on the “Bestseller”  link and click
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']"));
        //1.3 Verify the text “Bestsellers”
        String expectedTextMessage ="Bestsellers";
        String actualTextMessage = driver.findElement(By.xpath("//h1[text()='Bestsellers']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage,actualTextMessage);

        //	1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHover(By.xpath("//span[text()='Sort by:']"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        //	1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        mouseHover(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]"));

        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedTextMessage1 ="Product has been added to your cart";
        String actualTextMessage1 = driver.findElement(By.xpath("//li[text()='Product has been added to your cart']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage1,actualTextMessage1);
        //1.7 Click on X sign to close the message
        clickOnElement(By.xpath("//a[@class='close']"));
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@title='Your cart']"));
        //Thread.sleep(1000);
      //  clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        //1.9 Verify the text “Your shopping cart - 1 item”
        Thread.sleep(1000);
        String expectedTextMessage2 ="Your shopping cart - 1 item";
        String actualTextMessage2 = driver.findElement(By.xpath("//h1[@id='page-title']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage2,actualTextMessage2);
        //1.10 Click on “Empty your cart” link
        clickOnElement(By.xpath("//a[@class='clear-bag']"));
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        String expectedTextMessage4 = "Are you sure you want to clear your cart?";
        String actualTextMessage4 = alertText();
//        String expectedTextMessage3 ="";
//        String actualTextMessage3 = driver.findElement(By.xpath("")).getText();
//        Assert.assertEquals("Not sale", expectedTextMessage3,actualTextMessage3);
        //1.12 Click “Ok” on alert
       alertHandle();
        //1.13 Verify the message “Item(s) deleted from your cart”

        Assert.assertEquals("Not sale", expectedTextMessage4,actualTextMessage4);
        //1.15 Verify the text “Your cart is empty”
        String expectedTextMessage5 ="Your cart is empty";
        String actualTextMessage5 = driver.findElement(By.xpath("//h1[text()='Your cart is empty']")).getText();
        Assert.assertEquals("Not sale", expectedTextMessage5,actualTextMessage5);



    }
}
