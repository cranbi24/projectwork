package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

// https://bevasarlas.tesco.hu/groceries/hu-HU

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver inputDriver) {
        this.driver = inputDriver;
        this.wait = new WebDriverWait(inputDriver, Duration.ofSeconds(1));
        PageFactory.initElements(inputDriver,this);
    }

    protected boolean isLoaded(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

}

