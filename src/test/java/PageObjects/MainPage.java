package PageObjects;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement emailSubmitButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private  WebElement learnButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreButton;

    public MainPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputEmailField (String email) {
        this.emailField.sendKeys(email);
        this.emailSubmitButton.click();
    }
    public void clickOnStartEnrollmentButton() {
        this.startEnrollmentButton.click();
    }
    public void clickOnlearnButton() {
        this.learnButton.click();
    }
    public void clickOnReadMoreButton() {
        this.learnButton.click();
    }
    public static void waitForTheElementToLoad (int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    }



