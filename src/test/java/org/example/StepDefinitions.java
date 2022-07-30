package org.example;

import PageObjects.MainPage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);

    }

    @Given("i am on the main page website")
    public void i_am_on_the_main_page_website() {
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/index.html");
    }

    @When("i input the email {string}")
    public void i_input_the_email(String string) {
        mainPage.inputEmailField(string);
    }

    @Then("a pop-up appears with succesful subscribed for the newsletter")
    public void a_pop_up_appears_with_succesful_subscribed_for_the_newsletter() {
        Assert.assertTrue(driver.switchTo().alert().getText().startsWith("Email saved - you will now receive our monthly newsletter. Thank you!"));
    }

    @Then("email field border turns red")
    public void email_field_border_turns_red() {
       driver.findElements(By.cssSelector(".error"));
    }

    @When("i click the 'Start the Enrollment' button")
    public void i_click_the_start_the_enrollment_button() {
        mainPage.clickOnStartEnrollmentButton();

    }

    @Then("i am taken to the 'Sign up' page")
    public void  i_am_taken_to_the_sign_up_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("software testing | enrollment"));
    }

    @When("i click the 'What you`ll learn' button")
    public void i_click_the_what_you_ll_learn_button() {
        mainPage.clickOnlearnButton();
    }

    @And("i click the 'Read More' button")
    public void i_click_the_read_more_button() {

        mainPage.clickOnReadMoreButton();
    }
    @Then("i am taken to the 'Fundamentals' page")
    public void i_am_taken_to_the_fundamentals_page() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("fundamentals"));
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }


    }
}


