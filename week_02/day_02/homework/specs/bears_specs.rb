require("minitest/autorun")
require_relative("../bears")
require_relative("../river")

class BearsTest < MiniTest::Test

  def setup
    @bear = Bears.new("Yogi")
    @river = River.new("Amazon", 4)
  end

  def test_take_fish()
    @bear.take_fish(@river)
    assert_equal(3, @river.fish.count)
  end

#test bear can't take fish if river empty

  def test_roar()
    result = @bear.roar
    assert_equal("ROAR!!!", result)
  end

  def test_count_food()
    @bear.take_fish(@river)
    result = @bear.count_food
    assert_equal(1, result)
  end

end#end of class
