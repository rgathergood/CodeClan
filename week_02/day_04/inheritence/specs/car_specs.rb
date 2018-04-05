require('minitest/autorun')
require_relative('../car')

class TestCar < MiniTest::Test

  def setup()
    @car = Car.new()
  end

  def test_car_can_start_engine()
    result = @car.start_engine()
    assert_equal("Vrrmmm", result)
  end

end #end of class
