package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.SearchResultPage;

import java.time.Duration;

public class SearchSteps {
    protected static WebDriver driver;
    protected static Wait wait;
    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @BeforeAll
    public static void setup() {
        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().setSize(new Dimension(900, 900));
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }
    @Given("I open Tesco webshop website")
    public void iOpenHP() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        homePage=new HomePage(driver);


    }

    @And("I accept all cockies")
    public void iAcceptAllCockies() {
    }

    @Given("search field is visible")
    public void searchFieldIsVisible() {
    }

    @When("I search for a {string}")
    public void iSearchForA(String arg0) {
    }

    @Then("{string} of products shows in the result page")
    public void ofProductsShowsInTheResultPage(String arg0) {
    }

    @And("productname containes {string}")
    public void productnameContaines(String arg0) {
    }


}
