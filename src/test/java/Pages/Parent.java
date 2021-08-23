package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Parent {

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element); // element gözükene kadar bekle
        scrollToElement(element); // element e kadar javascript ile kaydır
        element.clear();// elemntin için temizle
        element.sendKeys(value); // valueyi  gönder
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // element clickable kadar bekle
        scrollToElement(element); // element e kadar javascript ile kaydır
        element.click(); // click yap
    }

    public static void waitUntilVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void delay(int second)
    {
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void verifyContainsText(WebElement element, String msg)
    {
        waitUntilVisible(element); // element clickable kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));
    }

    public void selectFunction(WebElement element,String text)
    {
        Select select=new Select(element);

        select.selectByVisibleText(text);
    }
    public void actionFunction(WebElement myElement)
    {
        Actions action=new Actions(BaseDriver.getDriver());

        action.moveToElement(myElement).build();
        action.perform();
    }
}
