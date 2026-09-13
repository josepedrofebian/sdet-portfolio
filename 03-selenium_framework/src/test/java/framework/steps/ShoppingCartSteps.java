package framework.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.driver.DriverManager;
import framework.pages.store.StorePage;
import framework.pages.store.components.CartComponent;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartSteps {

    // [Cucumber] Menyimpan StorePage yang digunakan Scenario
    private StorePage storePage;

    // [Cucumber] Menyimpan CartComponent yang digunakan Scenario
    private CartComponent cart;

    // [Cucumber] Mendapatkan WebDriver dari DriverManager
    private WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    // [Cucumber] Mapping step Given dari feature ke Java
    @Given("user is on the store page")
    public void userIsOnTheStorePage() {

        // [POM] Membuat StorePage menggunakan driver yang sama dari Hooks
        storePage = new StorePage(getDriver());
    }

    // [Cucumber] {string} mengambil nilai "Laptop Pro" dari feature
    @When("user adds {string} to the cart")
    public void userAddsProductToCart(String productName) {

        // [POM] Menjalankan business action melalui StorePage
        storePage.addProductToCart(productName);
    }

    // [Cucumber] Mapping step And dari feature ke Java
    @When("user opens the shopping cart")
    public void userOpensTheShoppingCart() {

        // [POM] Membuka CartComponent melalui StorePage
        cart = storePage.openCart();
    }

    // [Cucumber] {string} mengambil nama produk dari feature
    @Then("{string} should be displayed in the cart")
    public void productShouldBeDisplayedInTheCart(String productName) {

        // [Component] Mengambil informasi produk dari shopping cart
        String productInfo = cart.getProductInfo();

        // [TestNG] Memastikan produk yang dicari ada di shopping cart
        Assert.assertTrue(
                productInfo.contains(productName),
                productName + " tidak ditemukan di shopping cart");
    }
}