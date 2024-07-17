package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultPage extends BasePage {


    @FindBy(xpath = "//*[@id=\"product-list\"]/div[2]/div[3]/div/div[1]/div[1]/div/strong[2]")
    WebElement searchResultCount;

    @FindBy(xpath = "//*[@id=\"results\"]/h1")
    WebElement searchResultString;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String toSearchFor) {
        assertTrue(isLoaded());
        assertTrue(searchResultString.getText().contains("" + toSearchFor));
    }

    public void searchItemCount(String toSearchFor) {
        assertTrue(isLoaded());
        assertTrue(searchResultCount.getText().contains("" + toSearchFor));
    }

    public boolean isLoaded() {
        boolean isLoaded = isLoaded(searchResultCount);
        return isLoaded;
    }
}
