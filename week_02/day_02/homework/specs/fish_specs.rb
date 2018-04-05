
require("minitest/autorun")
require_relative("../fish")


class FishTest < MiniTest::Test

  def setup
    @fish = Fish.new("Harry Haddock")
  end

  def test_fish_name()
    name = @fish.name()
    assert_equal("Harry Haddock", name)    
  end

end#end of class
