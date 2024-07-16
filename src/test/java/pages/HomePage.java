package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement cookieButton;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-form\"]/button")
    WebElement searchButton;

    public HomePage(WebDriver inputDriver) {
        super(inputDriver);
    }

    public void acceptCookies() {
        cookieButton.click();
    }

    public SearchResultPage search(String searchWord) {
        searchField.sendKeys(searchWord);
        searchButton.click();
        return new SearchResultPage(driver);
    }


}
