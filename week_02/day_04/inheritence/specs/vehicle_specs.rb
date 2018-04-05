require('minitest/autorun')
require_relative('../vehicle')

class TestVehicle < MiniTest::Test

  def setup()
    @vehicle = Vehicle.new(4)
  end

  def test_vehicle_can_start_engine()
    result = @vehicle.start_engine()
    assert_equal("Vrrmmm", result)
  end

  def test_vehicle_has_four_wheels()
    wheels = @vehicle.number_of_wheels()
    assert_equal(4, wheels)
  end
  
end #end of class
