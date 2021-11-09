import io.cucumber.java.en.*;
import java.util.List;
import static org.junit.Assert.*;

public class StepDefinitions {

    private Order o;

    @Given("Romeo who wants to create an Order")
    public void creating_an_order() {
        o = new Order();
        o.setOwner("Romeo");
    }

    @When("Juliet is declared as recipient")
    public void declaring_recipient(){
        o.setRecipient("Juliet");
    }

    @Then("the order does not contain any drinks")
    public void check_emptiness() {
        List<Order.Drink> drinks = o.getDrinks();
        assertEquals(0, drinks.size());
    }
}