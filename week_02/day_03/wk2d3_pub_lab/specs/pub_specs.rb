require("minitest/autorun")
require_relative("../pub")
require_relative("../drinks")
require_relative("../customers")

class PubTest < MiniTest::Test

  def setup()
    @pub = Pub.new("The Cross Keys", 500)
    @drink1 = Drinks.new("Apothic Red", 3)
    @drink2 = Drinks.new("Malbec", 4)
    @drink3 = Drinks.new("IPA", 2)
    @customer1 = Customers.new("Rob", 3, 24)
    @customer2 = Customers.new("Jimmy", 0, 15)
  end

  def test_pub_name()
    assert_equal("The Cross Keys", @pub.pub_name)
  end

  def test_pub_till_balance()
    assert_equal(500, @pub.till_balance)
  end

  def test_stock_take()
    drinks = @pub.stock_take()
    assert_equal(0, drinks)
  end

  def test_add_drink()
    @pub.add_drink(@drink1)
    total = @pub.stock_take
    assert_equal(1, total)
  end

  def test_pub_checks_age__above_18()
    is_of_age = @pub.pub_checks_age(@customer1)
    assert_equal(true, is_of_age)
  end

  def test_pub_checks_age__below_18()
    is_of_age = @pub.pub_checks_age(@customer2)
    assert_equal(false, is_of_age)
  end

  def test_find_drink_by_name__returns_drink()
    @pub.add_drink(@drink1)
    drink = @pub.find_drink_by_name("Apothic Red")
    assert_equal(@drink1.name, drink)
  end

  def test_find_drink_by_name__drink_not_found()
    @pub.add_drink(@drink1)
    drink = @pub.find_drink_by_name("IPA")
    assert_nil(drink)
  end

  def test_can_customer_afford_drink__sufficient_funds()
    @pub.add_drink(@drink1)
    can_afford_drink = @pub.can_customer_afford_drink(@customer1, @drink1)
    assert_equal(true, can_afford_drink)
  end

  def test_can_customer_afford_drink_insufficient_funds()
    @pub.add_drink(@drink2)
    can_afford_drink = @pub.can_customer_afford_drink(@customer1, @drink2)
    assert_equal(false, can_afford_drink)
  end

  def test_customers_pays_for_drink()
    @pub.add_drink(@drink1)
    @pub.buy_drink(@customer1, @drink1)
    assert_equal(3, @customer1.wallet_balance())
  end

  def test_add_funds_to_till()
    @pub.add_drink(@drink1)
    @pub.add_funds_to_till(@drink1.price)
    total = @pub.till_balance
    assert_equal(503, total)
  end

end #end of class
