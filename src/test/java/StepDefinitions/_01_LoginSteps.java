package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps {

    DialogContent dc=new DialogContent();

    @Given("^Navigate to practicesite$")
    public void navigateToPracticesite() {
        WebDriver driver= BaseDriver.getDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();

    }


    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button()  {
        dc.findAndClick("loginBtn");
        dc.findAndSend("nameinput", "group5@gmail.com");
        dc.findAndSend("passinput", "groupgroup");
        dc.findAndClick("signInBtn");
    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully()  {
        dc.findAndContainsText("successMessage","Welcome to your account");

    }


    @And("^Navigate to contact us page$")
    public void navigateToContactUsPage() {
    dc.findAndClick("contactUs");



    }

    @When("^Sent problem message to customer service$")
    public void sentProblemMessageToCustomerService() {
        dc.findAndSelect("subjectHeading","Customer service");
        dc.findAndSend("messageBox","problem yok");
        dc.findAndClick("sendBtn");
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

        dc.findAndContainsText("successMessage2","successfully");
    }


    @When("^Send wrong e mail address$")
    public void sendWrongEMailAddress() {
    dc.findAndSend("nameinput","deneme@");
    dc.findAndClick("sendBtn");
    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dc.findAndContainsText("errorMessage","error");
    }

    @When("^Sent webmaster blank message$")
    public void sentWebmasterBlankMessage() {
        dc.findAndSelect("subjectHeading","Webmaster");
        dc.findAndClick("sendBtn");

    }

    @Then("^Successfully added message is displayed$")
    public void successfullyAddedMessageIsDisplayed() {
        dc.findAndContainsText("successAddMesage","successfully");
    }

    @And("^Navigate to specials page$")
    public void navigateToSpecialsPage() {

        dc.findAndClick("specialsBtn");
    }

    @When("^Click list button and add the first dress to the cart$")
    public void addFirstItemToTheCart() {

        dc.findAndClick("iconList");
        dc.findAndClick("addCart");
    }

    @When("^Select T-shirts and add to cart$")
    public void selectTShirtsAndAddToCart() {
        dc.findAndClick("womenBtn");
        dc.actionFunction("womenBtn");
    }

    @Then("^T-shirt text should be seen on the screen$")
    public void tShirtTextShouldBeSeenOnTheScreen() {
    }
}
