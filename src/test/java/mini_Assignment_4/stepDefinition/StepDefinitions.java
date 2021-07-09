package mini_Assignment_4.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ProductOperationClass productOperation = new ProductOperationClass();

    @Given("^Launch browser$")
    public void launch_browser() {
        loginPage.launchUrl();
    }

    @When("^Login with correct credential$")
    public void login_with_correct_credential() throws InterruptedException {
        loginPage.login();
    }

    @And("^find product and add to cart$")
    public void find_product_and_add_to_cart() throws InterruptedException {
        productOperation.findProduct();

    }

    @And("^continue shopping$")
    public void continue_shopping() throws InterruptedException {
        productOperation.continueShopping();
    }

    @And("^Add one more product in cart and verify cart total product$")
    public void add_one_more_product_in_cart_and_verify_cart_total_product() {
        productOperation.countCartNumber();

    }

    @And("^count cart value and go to check out$")
    public void count_cart_value_and_go_to_check_out() {
        productOperation.countCartValueOnCheckOut();

    }

    @And("^provide customer details$")
    public void provide_customer_details() throws InterruptedException {
        productOperation.checkOut();
    }

    @And("^verify order success message$")
    public void verify_order_success_message() {
        productOperation.verifySuccessMessage();

    }

}