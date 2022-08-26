package org.example;

import PageObjects.EnrollmentPage;
import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;
    private EnrollmentPage enrollmentPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        enrollmentPage = new EnrollmentPage(driver);

    }

    @Given("i am on the main page website")
    public void i_am_on_the_main_page_website() {
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/index.html");
    }

    @When("i input for newsletter the email {string}")
    public void i_input_the_email_newsletter(String string){mainPage.inputEmailField(string);
    }

    @Then("a pop-up appears with succesful subscribed for the newsletter")
    public void a_pop_up_appears_with_succesful_subscribed_for_the_newsletter() {
        Assert.assertTrue(driver.switchTo().alert().getText().startsWith("Email saved - you will now receive our monthly newsletter. Thank you!"));
    }

    @Then("email field border turns red")
    public void email_field_border_turns_red(){
       driver.findElements(By.cssSelector(".error"));
    }

    @When("i click the 'Start the Enrollment' button")
    public void i_click_the_start_the_enrollment_button(){
        mainPage.clickOnStartEnrollmentButton();
    }

    @Then("i am taken to the 'Sign up' page")
    public void  i_am_taken_to_the_sign_up_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("software testing | enrollment"));
    }
    @When("i click on 'Read More' button for 'Virtual' text box")
    public void i_click_on_read_more_button_for_virtual_text_box(){
        Utils.scrollToElement(driver, mainPage.scrollToPrimaryTextLight());
        mainPage.clickOnVirtualReadMoreButton();
    }
    @Then("i am taken to the 'Virtual' page")
    public void i_am_take_to_the_virtual_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("virtual"));
        driver.navigate().back();
    }
    @When("i click on 'Read More' button for 'Hybrid' text box")
    public void i_click_on_read_more_button_for_hybrid_text_box(){
        mainPage.clickOnHybridReadMoreButton();
    }
    @Then("i am taken to the 'Hybrid' page")
    public void i_am_taken_to_the_hybrid_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("hybrid"));
        driver.navigate().back();
    }
    @When("i click on 'Read More' button for 'In Person'")
    public void i_click_on_read_more_button_for_in_person(){
        mainPage.clickOnInPersonReadMoreButton();
    }
    @Then("i am taken to the 'In Person' page")
    public void i_am_taken_to_the_in_person_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("in person"));
        driver.navigate().back();
    }

    @When("i click the 'What you`ll learn' button")
    public void i_click_the_what_you_ll_learn_button(){
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
    public void i_am_taken_to_the_fundamentals_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("fundamentals"));
    }


    @When ("i click on the 'Questions' button")
    public void i_click_on_the_questions_button(){
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
    }
    @When("i click on the 'Instructors' button")
    public void i_click_on_the_instructors_button() {
        mainPage.clickOnInstructorsButton();
    }

    @Then("i am taken to the to the 'Our Instructor' page")
    public void i_am_taken_to_the_our_instructors_page() {
        Assert.assertTrue(driver.getPageSource().contains("Our Instructors"));
    }

    @When("i click the 'Twitter' button for John Doe")
    public void i_click_the_twitter_button_for_John_Doe() {
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

    @When("i click the 'Facebook' button for John Doe")
    public void i_click_the_facebook_button_for_john_doe() {
        mainPage.clickOnJohnDoeFacebookButton();
    }

    @Then("i am taken to the 'Facebook' page")
    public void i_am_taken_to_the_facebook_page() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("facebook"));
        driver.navigate().back();
    }

    @When("i click the 'Linkedin' button for John Doe")
    public void i_click_the_linkedin_button_for_john_doe(){
        mainPage.clickOnJohnDoeLinkedinButton();
    }

    @Then ("i am taken to the 'Linkedin' page")
    public void  i_am_taken_to_the_linkedin_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("linkedin"));
        driver.navigate().back();
    }

    @When("i click the 'Instagram' button for John Doe")
    public void i_click_the_instragram_button_for_john_doe() {
        mainPage.clickOnJohnDoeInstagramButton();
    }

    @Then("i am taken to the 'Instagram' page")
    public void i_am_taken_to_the_instagram_page(){
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("instagram"));
    }
    @Given("i am on the personal information page")
    public void i_am_on_the_personal_information_page() {
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/routes/enrollment.html");
    }

    @And("i input the first name {string}")
    public void i_input_the_first_name(String string) {
        enrollmentPage.inputOnFirstNameTextBox(string);
    }

    @And("i input the last name {string}")
    public void i_input_the_last_name (String string) {
        enrollmentPage.inputOnLastNameTextBox(string);
    }

    @And("i input the username {string}")
    public void i_input_the_username (String string) {
        enrollmentPage.inputOnUsernameTextBox(string);
    }

    @And("i input the password {string}")
    public void i_input_the_password (String string) {
        enrollmentPage.inputOnPasswordTextBox(string);
    }

    @And("i input the confirm password {string}")
    public void i_input_the_confirm_password (String string) {
        enrollmentPage.inputOnConfirmPasswordTextBox(string);
    }

    @When("i click the next button on personal information page")
    public void i_click_the_next_button_personal_information_page(){
        enrollmentPage.clickOnPersonalInformationPageNextButton();
    }

    @Then("i am taken to the 'Contact information' page")
    public void i_am_taken_to_the_contact_information_page(){
        Assert.assertTrue(driver.getPageSource().contains("Contact information"));
    }

    @Given("i am on the 'Contact information' page")
    public void i_am_on_the_contact_information_page(){
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/routes/enrollment.html");
        enrollmentPage.fillPersonalInformation();
        enrollmentPage.clickOnPersonalInformationPageNextButton();
    }

    @And("i input the email {string}")
    public void i_input_the_email(String string){
        enrollmentPage.inputOnContactInformationEmailTextBox(string);
    }

    @And("i input the phone number {string}")
    public void i_input_the_phone_number(String string){
        enrollmentPage.inputOnPhoneTextBox(string);
    }

    @And("i input the country {string}")
    public void i_input_the_country(String string){
        enrollmentPage.inputkOnCountryTextBox(string);
    }

    @And("i input the city {string}")
    public void i_input_the_city(String string){
        enrollmentPage.inputOnCityTextBox(string);
    }

    @And("i input the postcode {string}")
    public void i_input_the_postcode(String string){
        enrollmentPage.inputOnPostCodeTextBox(string);
    }

    @When("i click the next button on contact information page")
    public void i_click_the_next_button_contact_information_page(){
        enrollmentPage.clickOnContactInformationPageNextButton();
    }

    @Then("i am taken to the 'Course options' page")
    public void i_am_taken_to_the_course_options_page(){
        Assert.assertTrue(driver.getPageSource().contains("Course options"));
    }
    @Given("i am on the 'Course options' page")
    public void i_am_on_the_course_options_page(){
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/routes/enrollment.html");
        enrollmentPage.fillPersonalInformation();
        enrollmentPage.clickOnPersonalInformationPageNextButton();
        enrollmentPage.fillContactInformation();
        enrollmentPage.clickOnContactInformationPageNextButton();
    }
    @And("i click on all four course options")
    public void i_click_on_all_four_course_options(){
        enrollmentPage.clickOnCourseOptionsManuelTesterButton();
        enrollmentPage.clickOnCoursepOptionsAutomationTesterButton();
        enrollmentPage.clickOnCourseOptionsAutomationAndManualTesterButton();
        enrollmentPage.clickOnCourseOptionsSecurityTesterButton();
    }
    @And("i click the next button on 'Course options' page")
    public void i_click_the_next_button_on_course_options_page(){
        enrollmentPage.clickOnCourseOptionsNextButton();
    }
    @Then("i am taken to the 'Payment information' page")
    public void i_am_taken_to_the_payment_information_page(){
        Assert.assertTrue(driver.getPageSource().contains("Success!"));
    }
    @Given("i am on the 'Payment options' page")
    public void i_am_on_the_payment_options_page(){
        driver.get("file:///C:/Users/40730/Desktop/Testing-Env-master/routes/enrollment.html");
        enrollmentPage.fillPersonalInformation();
        enrollmentPage.clickOnPersonalInformationPageNextButton();
        enrollmentPage.fillContactInformation();
        enrollmentPage.clickOnContactInformationPageNextButton();
        enrollmentPage.clickOnCourseOptionsNextButton();
    }
    @And("i input the card holder name {string}")
    public void i_input_the_card_holder_name(String string){
        enrollmentPage.inputOnCardHolderNameTextBox(string);
    }
    @And(("i input the card number {string}"))
    public void i_input_the_card_number(String string){
        enrollmentPage.inputOnCardNumberTextBox(string);
    }
    @And("i input the card cvc {string}")
    public void i_input_the_card_cvc(String string){
        enrollmentPage.inputOnCvcTextBox(string);
    }
    @And("i select the expiry date month 'December'")
    public void i_select_the_expiry_date_month_december(){
        enrollmentPage.clickOnSelectExpiryDateMonthDecember();
        Utils.waitForElementToLoad(1);
        enrollmentPage.clickOnSelectExpiryDateMonthDecember();
    }
    @And("i select the expiry year '2033'")
    public void i_select_the_expiry_year_2033(){
        enrollmentPage.clickOnExpiryDateYearTextBox();
        Utils.waitForElementToLoad(1);
        enrollmentPage.clickOnSelectExpiryDateYear2033();
    }
    @And("i click the next button on 'Payment information' page")
    public void i_click_the_next_button_on_payment_information_page(){
        enrollmentPage.clickOnPaymentInformationNextButton();
    }
    @Then("i am taken to the {string} page")
    public void i_am_taken_to_the_succes_page(String string){
        Assert.assertTrue(driver.getPageSource().contains(string));
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }
}



