package utilities;

import browerfactory.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {
    /*
    This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    /*
    This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /*
    This method will send text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public void sendTextToElement(By by) {
        driver.findElement(by).clear();
    }


    //
    public List<WebElement> listofWebElementsList(By by) {
        return driver.findElements(by);
    }



    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        driver.findElement(by);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
    public String alertText(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        return alert.getText();
    }
    public void alertHandle(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        alert.accept();
    }
}