require("minitest/autorun")
require_relative("../bar.rb")

class BarTest < MiniTest::Test

  def setup()
    @bar = Bar.new()
    @drinks = {
      "Wine" => 6,
      "Beer" => 4,
      "Gin"  => 5,
      "Vodka" => 3
    }
  end

  def test_bar_drinks()
    assert_equal(@drinks, @bar.drinks)   #Check this test
  end

  def test_prices()

    
    assert_equal(6, @bar.drinks["Wine"])
    assert_equal(4, @bar.drinks["Beer"])
    assert_equal(5, @bar.drinks["Gin"])
    assert_equal(3, @bar.drinks["Vodka"])
  end
end # end of class
