require("minitest/autorun")
require_relative("../customers")
require_relative("../drinks")

class CustomersTest < MiniTest::Test

  def setup()
    @customer1 = Customers.new("Rob", 12, 24)
  end

  def test_customer_name()
    assert_equal("Rob", @customer1.name)
  end

  def test_customer_wallet_balance()
    assert_equal(12, @customer1.wallet_balance)
  end

  def test_customer_age()
    assert_equal(24, @customer1.age)
  end

  def test_remove_funds()
    @drink1 = Drinks.new("Apothic Red", 3)
    @customer1.remove_funds(@drink1.price)
    remaining_balance = @customer1.wallet_balance()
    assert_equal(9, remaining_balance)
  end

end #end of class
