package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {
    @FindBy (xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameTextBox;
    @FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameTextBox;
    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement userNameTexBox;
    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement passwordTextBox;
    @FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordTextBox;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement personalInformationPageNextButton;
    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement contactInformationEmailTextBox;
    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phoneTextBox;
    @FindBy (xpath = "//*[@id=\"country\"]")
    private WebElement countryTextBox;
    @FindBy (xpath = "//*[@id=\"city\"]")
    private WebElement cityTextBox;
    @FindBy (xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeTextBox;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement contactInnformationNextButton;
    @FindBy (xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement courseOptionsManuelTesterButton;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/div[2]/label")
    private WebElement coursepOptionsAutomationTesterButton;
    @FindBy (xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement courseOptionsAutomationAndManualTesterButton;
    @FindBy (xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement courseOptionsSecurityTesterButton;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement courseOptionsNextButton;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNameTextBox;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumberTextBox;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcTextBox;
    @FindBy (xpath = "//*[@id=\"month\"]")
    private WebElement expiryDateMonthTextBox;
    @FindBy (xpath = "//*[@id=\"month\"]/option[13]")
    private WebElement selectExpiryDateMonthDecember;
    @FindBy (xpath = "//*[@id=\"year\"]")
    private WebElement expiryDateYearTextBox;
    @FindBy (xpath = "//*[@id=\"year\"]/option[14]")
    private WebElement selectExpiryDateYear2033;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement paymentInformationNextButton;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement returnTohomepageEnrollmentBUtton;

    public EnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputOnFirstNameTextBox(String firstName){this.firstNameTextBox.sendKeys(firstName);}
    public void inputOnLastNameTextBox(String lastName){this.lastNameTextBox.sendKeys(lastName);}
    public void inputOnUsernameTextBox(String userName){this.userNameTexBox.sendKeys(userName);}
    public void inputOnPasswordTextBox(String password){this.passwordTextBox.sendKeys(password);}
    public void inputOnConfirmPasswordTextBox(String confirmPassword){this.confirmPasswordTextBox.sendKeys(confirmPassword);}
    public void clickOnPersonalInformationPageNextButton(){this.personalInformationPageNextButton.click();}
    public void inputOnContactInformationEmailTextBox(String emailcontact){this.contactInformationEmailTextBox.sendKeys(emailcontact);}
    public void inputOnPhoneTextBox(String phone){this.phoneTextBox.sendKeys(phone);}
    public void inputkOnCountryTextBox(String country){this.countryTextBox.sendKeys(country);}
    public void inputOnCityTextBox(String city){this.cityTextBox.sendKeys(city);}
    public void inputOnPostCodeTextBox(String postCode){this.postCodeTextBox.sendKeys(postCode);}
    public void clickOnContactInformationPageNextButton(){this.contactInnformationNextButton.click();}
    public void clickOnCourseOptionsManuelTesterButton(){this.courseOptionsManuelTesterButton.click();}
    public void clickOnCoursepOptionsAutomationTesterButton(){this.coursepOptionsAutomationTesterButton.click();}
    public void clickOnCourseOptionsAutomationAndManualTesterButton(){this.courseOptionsAutomationAndManualTesterButton.click();}
    public void clickOnCourseOptionsSecurityTesterButton(){this.courseOptionsSecurityTesterButton.click();}
    public void clickOnCourseOptionsNextButton(){this.courseOptionsNextButton.click();}
    public void inputOnCardHolderNameTextBox(String cardHolderName){this.cardHolderNameTextBox.sendKeys(cardHolderName);}
    public void inputOnCardNumberTextBox(String cardNumber){this.cardNumberTextBox.sendKeys(cardNumber);}
    public void inputOnCvcTextBox(String cvc){this.cvcTextBox.sendKeys(cvc);}
    public void clickOnExpiryDateMonthTextBox(){this.expiryDateMonthTextBox.click();}
    public void clickOnSelectExpiryDateMonthDecember(){this.selectExpiryDateMonthDecember.click();}
    public void clickOnExpiryDateYearTextBox(){this.expiryDateYearTextBox.click();}
    public void clickOnSelectExpiryDateYear2033(){this.selectExpiryDateYear2033.click();}
    public void clickOnPaymentInformationNextButton(){this.paymentInformationNextButton.click();}
    public void clickOnReturnTohomepageEnrollmentBUtton(){this.returnTohomepageEnrollmentBUtton.click();}

    public void fillPersonalInformation(){
        firstNameTextBox.sendKeys("Adrian");
        lastNameTextBox.sendKeys("Leonte");
        userNameTexBox.sendKeys("Drianu");
        passwordTextBox.sendKeys("testcase");
        confirmPasswordTextBox.sendKeys("testcase");
    }

    public void fillContactInformation(){
        contactInformationEmailTextBox.sendKeys("testcase@testcase.com");
        phoneTextBox.sendKeys("0743560452");
        countryTextBox.sendKeys("Romania");
        cityTextBox.sendKeys("Brasov");
        postCodeTextBox.sendKeys("500365");
    }

    public void fillPaymentInformation(){
        cardHolderNameTextBox.sendKeys("Leonte Adrian");
        cardNumberTextBox.sendKeys("4356-1234-2432-4561");
        cvcTextBox.sendKeys("341");

    }
}





