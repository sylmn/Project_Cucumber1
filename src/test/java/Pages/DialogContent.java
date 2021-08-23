package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css="a.login")
    private WebElement loginBtn;

    @FindBy(id="email")
    private WebElement nameinput;

    @FindBy(id="passwd")
    private WebElement passinput;

    @FindBy(id="SubmitLogin")
    private WebElement signInBtn;

    @FindBy(css="p.info-account")
    private WebElement successMessage;

    @FindBy(xpath="//a[text()='Contact us']")
    private WebElement contactUs;

    @FindBy(id="id_contact")
    private WebElement subjectHeading;

    @FindBy(id="message")
    private WebElement messageBox;

    @FindBy(id="submitMessage")
    private WebElement sendBtn;

    @FindBy(css="p.alert-success")
    private WebElement successMessage2;

    @FindBy(xpath="//div[@class='alert alert-danger']//p")
    private WebElement errorMessage;

    @FindBy(xpath="(//li[@class='item']//a)[1]")
    private WebElement specialsBtn;

    @FindBy(css="a.product_img_link>img")
    private WebElement firstImg;

    @FindBy(xpath="//span[text()='Add to cart']")
    private WebElement addCart;

    @FindBy(xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']//child::h2")
    private WebElement successAddMesage;

    @FindBy(css="i.icon-th-list")
    private WebElement iconList;

    @FindBy(css="a[title='Women']")
    private WebElement womenBtn;

    WebElement myElement;
    public void findAndSend(String elementName,String value)
    {
          switch (elementName) {
              case "nameinput":  myElement = nameinput;  break;
              case "passinput":  myElement = passinput;  break;
              case "messageBox":  myElement = messageBox;  break;
          }

          sendKeysFunction(myElement, value);
    }

    public void findAndClick(String elementName)
    {
        switch (elementName) {
            case "loginBtn": myElement = loginBtn; break;
            case "signInBtn": myElement = signInBtn; break;
            case "contactUs": myElement = contactUs; break;
            case "sendBtn": myElement = sendBtn; break;
            case "specialsBtn": myElement = specialsBtn; break;
            case "iconList": myElement = iconList; break;
            case "addCart": myElement = addCart; break;
            case "womenBtn": myElement = womenBtn; break;

        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String elementName, String msg)
    {
        switch (elementName) {
            case "successMessage": myElement = successMessage;  break;

            case "successMessage2": myElement = successMessage2;  break;

            case "errorMessage": myElement = errorMessage;  break;

            case "successAddMesage": myElement = successAddMesage;  break;
        }

        verifyContainsText(myElement, msg);
    }

    public void findAndSelect(String elementName,String text)
    {
        switch (elementName) {
            case "subjectHeading": myElement = subjectHeading; break;

        }

        selectFunction(myElement,text);
    }
    public void actionSelect(String elementName)
    {
        switch (elementName) {
            case "womenBtn": myElement = womenBtn; break;

        }

        actionFunction(myElement);
    }
//    public void findAndDelete(String deleteString)
//    {
//        findAndSend("searchInput", deleteString);
//        findAndClick("searchButton");
//
//        // çöp kovaları 2 den az olana kadar bekle
//        WebDriverWait wait =new WebDriverWait(BaseDriver.getDriver(),10);
//        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"),2));
//
//        findAndClick("deleteButton");
//        findAndClick("deleteDialogBtn");
//    }

}
