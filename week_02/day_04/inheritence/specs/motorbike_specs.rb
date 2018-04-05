require('minitest/autorun')
require_relative('../motorbike')

class TestMotorbike < MiniTest::Test
  
  def setup()
    @motorbike = Motorbike.new()
  end

  def test_motorbike_can_start_engine()
    result = @motorbike.start_engine()
    assert_equal("Vrrmmm I am a motorbike", result)
  end

end #end of class
