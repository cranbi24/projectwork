package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {
    @Given("I open Tesco webshop website")
    public void iOpenTescoWebshopWebsite() {
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
