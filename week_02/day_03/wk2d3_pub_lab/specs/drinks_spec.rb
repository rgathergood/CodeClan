require("minitest/autorun")
require_relative("../drinks")

class DrinksTest < MiniTest::Test

  def setup()
    @drink1 = Drinks.new("Apothic Red", 3)
  end

  def test_drink_name()
    assert_equal("Apothic Red", @drink1.name)
  end

  def test_drink_price()
    assert_equal(3, @drink1.price)
  end

end #end of class
