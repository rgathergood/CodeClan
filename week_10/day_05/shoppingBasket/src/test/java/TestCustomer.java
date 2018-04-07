import ShoppingBasket.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    private Customer customer1;

    @Before
    public void before() {
        customer1 = new Customer("Gary", false);
    }

    @Test
    public void customerHasName() {
        assertEquals("Gary", customer1.getName());
    }

    @Test
    public void customerHasLoyaltyCard() {
        assertEquals(false, customer1.hasLoyaltyCard());
    }
}