package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement emailSubmitButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;
    @FindBy(xpath = "/html/body/section[2]")
    private WebElement primaryTextLight;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;
    @FindBy(xpath = "/html/body/a")
    private WebElement returnButtonTextBoxes;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMoreButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPersonReadMoreButton;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement learnButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a/i")
    private WebElement readMoreButton;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement accordionButton1;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement accordionButton2;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement accordionButton3;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement accordionButton4;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[5]/h3/button")
    private WebElement accordionButton5;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement scrollToOurInstructors;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement johnDoeTwitterButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[2]/i")
    private WebElement johnDoeFacebookButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[3]/i")
    private WebElement johnDoeLinkedinButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[4]/i")
    private WebElement johnDoeInstagramButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputEmailField(String email) {
        this.emailField.sendKeys(email);
        this.emailSubmitButton.click();
    }

    public void clickOnStartEnrollmentButton() {
        this.startEnrollmentButton.click();
    }

    public void clickOnVirtualReadMoreButton() {
        this.virtualReadMoreButton.click();
    }

    public WebElement scrollToPrimaryTextLight() {
        return this.primaryTextLight;
    }

    public void clickOnReturnButtonTextBox() {
        this.returnButtonTextBoxes.click();
    }

    public void clickOnHybridReadMoreButton() {
        this.hybridReadMoreButton.click();
    }

    public void clickOnInPersonReadMoreButton() {
        this.inPersonReadMoreButton.click();
    }

    public void clickOnlearnButton() {
        this.learnButton.click();
    }

    public void clickOnReadMoreButton() {
        this.readMoreButton.click();
    }

    public void clickOnQuestionsButton() {
        this.questionsButton.click();
    }

    public void clickOnAccordionButton1() {
        this.accordionButton1.click();
    }

    public void clickOnAccordionButton2() {
        this.accordionButton2.click();
    }

    public void clickOnAccordionButton3() {
        this.accordionButton3.click();
    }

    public void clickOnAccordionButton4() {
        this.accordionButton4.click();
    }

    public void clickOnAccordionButton5() {
        this.accordionButton5.click();
    }

    public void clickOnInstructorsButton() {
        this.instructorsButton.click();
    }

    public WebElement scrollToInstructorsPage() {
        return this.scrollToOurInstructors;
    }

    public void clickOnJohnDoeTwitterButton() {
        this.johnDoeTwitterButton.click();
    }

    public void clickOnJohnDoeFacebookButton() {
        this.johnDoeFacebookButton.click();
    }

    public void clickOnJohnDoeLinkedinButton() {
        this.johnDoeLinkedinButton.click();
    }

    public void clickOnJohnDoeInstagramButton() {
        this.johnDoeInstagramButton.click();
    }
}


