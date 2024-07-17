package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement cookieButton;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-form\"]/button")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"utility-header-language-switch-link\"]")
    WebElement languageFlag;

    @FindBy(xpath = "//*[@id=\"utility-header-registration-link\"]/span")
    WebElement checkLanguageElement;

    private final String registrationInEnglish = "Register";
    private final String registrationInHungarian = "Regisztráció";

    public HomePage(WebDriver inputDriver) {
        super(inputDriver);
    }

    public void acceptCookies() {
        cookieButton.click();
    }

    public void searchVisible() {
        searchField.isDisplayed();
    }

    public SearchResultPage search(String searchWord) {
        searchField.sendKeys(searchWord);
        searchButton.click();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.isLoaded();
        return searchResultPage;
    }

    public void changeLanguage(String language) {
        languageFlag.click();
    }

    public void getCheckLanguageElement(String language) {
        assertTrue((language.equals("English") && checkLanguageElement.getText().equals(registrationInEnglish))
                || (language.equals("Hungarian") && checkLanguageElement.getText().equals(registrationInHungarian)));

    }
}

