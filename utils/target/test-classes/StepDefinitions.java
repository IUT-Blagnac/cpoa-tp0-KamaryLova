import io.cucumber.java.en.*;
import java.util.List;
import static org.junit.Assert.*;

public class StepDefinitions {

    private Order o;

    @Given("Romeo who wants to create an Order")
    public void romeo_who_wants_to_create_an_order() {
        // Write code here that turns the phrase above into concrete actions
        o = new Order();
        o.setOwner("Romeo");
    }
    @Then("Juliet is declared as recipient")
    public void juliet_is_declared_as_recipient() {
        // Write code here that turns the phrase above into concrete actions
        o.setRecipient("Juliet");
    }
    @When("the order does not contain any drinks")
    public void the_order_does_not_contain_any_drinks() {
        // Write code here that turns the phrase above into concrete actions
        List<Order.Drink> drinks = o.getDrinks();
        assertEquals(0, drinks.size());
    }
}