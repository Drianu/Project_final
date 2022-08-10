package org.example;

import PageObjects.MainPage;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
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

    @When("i input for newsletter the email {string}")
    public void i_input_the_email_newsletter(String string) {
        mainPage.inputEmailField(string);
    }

    @Then("a pop-up appears with succesful subscribed for the newsletter")
    public void a_pop_up_appears_with_succesful_subscribed_for_the_newsletter() {
        Assert.assertTrue(driver.switchTo().alert().getText().startsWith("Email saved - you will now receive our monthly newsletter. Thank you!"));
        driver.quit();

    }

    @Then("email field border turns red")
    public void email_field_border_turns_red() {
       driver.findElements(By.cssSelector(".error"));
       driver.quit();
    }

    @When("i click the 'Start the Enrollment' button")
    public void i_click_the_start_the_enrollment_button() {
        mainPage.clickOnStartEnrollmentButton();

    }

    @Then("i am taken to the 'Sign up' page")
    public void  i_am_taken_to_the_sign_up_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("software testing | enrollment"));
        driver.quit();
    }

    @When("i click the 'What you`ll learn' button")
    public void i_click_the_what_you_ll_learn_button() {
        mainPage.clickOnlearnButton();

    }
    @Then("i am taken to 'Learn The Fundamentals' page")
    public void i_am_taken_to_learn_the_fundamentals_page(){
        Assert.assertTrue(driver.getPageSource().contains("Learn The Fundamentals"));
    }

    @And("i click the 'Read More' button")
    public void i_click_the_read_more_button()
    {
        Utils.waitForElementToLoad(1);
        mainPage.clickOnReadMoreButton();

    }

    @Then("i am taken to the 'Fundamentals' page")
    public void i_am_taken_to_the_fundamentals_page() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("fundamentals"));
        driver.quit();
    }


    @When ("i click on the 'Questions' button")
    public void i_click_on_the_questions_button() {
        mainPage.clickOnQuestionsButton();
    }

    @Then("i am taken to the 'Frequently Asked Questions' page")
    public void i_am_take_to_the_frequently_asked_questions_page() {
       Assert.assertTrue(driver.getPageSource().contains("Frequently Asked Questions"));
    }
    @And("i click on the all four questions accordion buttons")
    public void i_click_on_the_all_four_question_accordion_buttons() {
        Utils.waitForElementToLoad(1);
        mainPage.clickOnAccordionButton1();
        Utils.waitForElementToLoad(1);
        mainPage.clickOnAccordionButton2();
        Utils.waitForElementToLoad(1);
        mainPage.clickOnAccordionButton3();
        Utils.waitForElementToLoad(1);
        mainPage.clickOnAccordionButton4();
        Utils.waitForElementToLoad(1);
        mainPage.clickOnAccordionButton5();
        Utils.waitForElementToLoad(1);
        driver.quit();

    }
    @When("i click on the 'Instructors' button")
    public void i_click_on_the_instructors_button() {
        mainPage.clickOnInstructorsButton();
    }

    @Then("i am taken to the to the 'Our Instructor' page")
    public void i_am_taken_to_the_our_instructors_page() {
        Assert.assertTrue(driver.getPageSource().contains("Our Instructors"));
        driver.quit();
    }

    @When("i click the 'Twitter' button")
    public void i_click_the_twitter_button() {
    //WebElement scrollToInstructorspage = driver.findElement(By.xpath("//*[@id=\"instructors\"]/div/h2"));
    Utils.scrollToElement(driver, mainPage.scrollToInstructorsPage());
    mainPage.clickOnJohnDoeTwitterButton();

    }

    @Then("i am taken to the 'Twitter' page")
    public void i_am_taken_to_the_twitter_page() {
        Utils.waitForElementToLoad(1);
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("twitter"));
        driver.navigate().back();
    }
    @When("i click the 'Facebook' button")
    public void i_click_the_facebook_button() {
        mainPage.clickOnJohnDoeFacebookButton();
    }
    @Then("i am taken to the 'Facebook' page")
    public void i_am_taken_to_the_facebook_page() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("facebook"));
        driver.navigate().back();
    }
    @When("i click the 'Linkedin' button")
    public void i_click_the_linkedin_button(){
        mainPage.clickOnJohnDoeLinkedinButton();
    }
    @Then ("i am taken to the 'Linkedin' page")
    public void  i_am_taken_to_the_linkedin_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("linkedin"));
        driver.navigate().back();
    }

    @When("i click the 'Instagram' button")
    public void i_click_the_instragram_button() {
        mainPage.clickOnJohnDoeInstagramButton();
    }

    @Then("i am taken to the 'Instagram' page")
    public void i_am_taken_to_the_instagram_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("instagram"));
        driver.quit();
    }
    @Given("i am on the personal information page")
    public void i_am_on_the_personal_information_page() {
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/routes/enrollment.html");
    }
    @And("i input the first name {string}")
    public void i_input_the_first_name(String string) {
        mainPage.inputOnFirstNameTextBox(string);
    }
    @And("i input the last name {string}")
    public void i_input_the_last_name (String string) {
        mainPage.inputOnLastNameTextBox(string);
    }
    @And("i input the username {string}")
    public void i_input_the_username (String string) {
        mainPage.inputOnUsernameTextBox(string);
    }
    @And("i input the password {string}")
    public void i_input_the_password (String string) {
        mainPage.inputOnPasswordTextBox(string);
    }
    @And("i input the confirm password {string}")
    public void i_input_the_confirm_password (String string) {
        mainPage.inputOnConfirmPasswordTextBox(string);
    }

    @When("i click the next button")
    public void i_click_the_next_button_personal_information_page(){
        mainPage.clickOnPersonalInformationPageNextButton();
    }
    @Then("i am taken to the 'Contact information' page")
    public void i_am_taken_to_the_contact_information_page(){
        Assert.assertTrue(driver.getPageSource().contains("Contact information"));
        driver.quit();
    }
    @Given("i am on the 'Contact information' page")
    public void i_am_on_the_contact_information_page(){
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/routes/enrollment.html");
        mainPage.inputOnFirstNameTextBox("Adrian");
        mainPage.inputOnLastNameTextBox("Leonte");
        mainPage.inputOnUsernameTextBox("Drianu");
        mainPage.inputOnPasswordTextBox("testcase");
        mainPage.inputOnConfirmPasswordTextBox("testcase");
        mainPage.clickOnPersonalInformationPageNextButton();
    }
    @And("i input the email {string}")
    public void i_input_the_email(String string){
        mainPage.inputOnContactInformationEmailTextBox(string);
    }

    @And("i input the phone number {string}")
    public void i_input_the_phone_number(String string){
        mainPage.inputOnPhoneTextBox(string);
    }
    @And("i input the country {string}")
    public void i_input_the_country(String string){
        mainPage.inputkOnCountryTextBox(string);
    }
    @And("i input the city {string}")
    public void i_input_the_city(String string){
        mainPage.inputOnCityTextBox(string);
    }
    @And("i input the postcode {string}")
    public void i_input_the_postcode(String string){
        mainPage.inputOnPostCodeTextBox(string);
    }
    @And("i click the next button")
    public void i_click_the_next_button_contact_information_page(){
        mainPage.clickOnContactInformationPageNextButton();
    }
    @Then("i am taken to the 'Course options' page")
    public void i_am_taken_to_the_course_options_page(){
        Assert.assertTrue(driver.getPageSource().contains("Course options"));
        driver.quit();
    }

    //@AfterAll ublic void closeBrowser(Scenario scenario) {
    //        if (scenario.isFailed()) {
    //            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    //            scenario.attach(screenshot, "image/png", "name");



}



