package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"product-list\"]/div[2]/div[3]/div/div[1]/div[1]/div/strong[2]")
    WebElement searchReultCount;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void searchResultNumber(int productNumber) {
        assertTrue(isLoaded());
        assertTrue(searchReultCount.getText().contains("" + productNumber));
    }

    public boolean isLoaded() {
        boolean isLoaded = isLoaded(searchReultCount);
        return isLoaded;
    }
}
