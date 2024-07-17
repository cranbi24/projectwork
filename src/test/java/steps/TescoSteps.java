package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.SearchResultPage;

import java.time.Duration;

public class TescoSteps {
    protected static WebDriver driver;
    protected static Wait wait;
    private HomePage homePage;
    private SearchResultPage searchResultPage;


    @Before
    public static void setup() {
        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
    }


    @Given("I open Tesco webshop website")
    public void openHP() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        homePage = new HomePage(driver);

    }

    @And("I accept all cockies")
    public void acceptAllCockies() {
        homePage.acceptCookies();
    }

    @Given("search field is visible")
    public void searchFieldIsVisible() {
        homePage.searchVisible();
    }

    @When("I search for a {string}")
    public void search(String product) {
        searchResultPage = homePage.search(product);
        searchResultPage.isLoaded();
    }

    @Then("{string} of products shows in the result page")
    public void productNumber(String productNumber) {
        searchResultPage.searchItemCount(productNumber);
    }

    @And("productname containes {string}")
    public void productnameContaines(String product) {
        searchResultPage.searchProduct(product);
    }

    @After
    public static void cleanup() {
        driver.quit();
    }


    @When("I change the language to {string}")
    public void changeLanguage(String language) {
        homePage.changeLanguage(language);
    }

    @Then("language is changed to {string}")
    public void languageIsChanged(String language) {
        homePage.getCheckLanguageElement(language);
    }

    @Given("language is set to {string}")
    public void languageIsSetToHungarian(String language) {
        homePage.getCheckLanguageElement(language);
    }
}
