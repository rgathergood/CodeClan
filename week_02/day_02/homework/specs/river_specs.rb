require("minitest/autorun")
require_relative("../river")
require_relative("../fish")


class RiverTest < MiniTest::Test

  def setup
    @river = River.new("Amazon", 4)
  end

  def test_get_river_name
    assert_equal("Amazon", @river.name())
  end

  def test_remove_fish
    @river.remove_fish()
    assert_equal(3, @river.fish().count)
  end

  def test_count_fish
    assert_equal(4, @river.count_fish)
  end

end#end of class
