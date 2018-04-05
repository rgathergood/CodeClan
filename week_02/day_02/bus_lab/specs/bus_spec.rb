require("minitest/autorun")
require_relative("../bus")
require_relative("../person")
require_relative("../bus_stop")

class BusTest < MiniTest::Test

  def setup()
    passengers = []
    @bus = Bus.new("22", "Ocean Terminal", passengers)
    @passenger1 = Person.new("Tom", 36)
    @passenger2 = Person.new("Ann", 68)
    @queue = []
    @bus_stop = BusStop.new("Holy Corner", @queue)
  end

  def test_bus_has_number()
    number = @bus.number()
    assert_equal("22", number)
  end

  def test_bus_has_destination()
    destination = @bus.destination()
    assert_equal("Ocean Terminal", destination)
  end

  def test_drive_bus()
    driving = @bus.drive()
    assert_equal("Brum brum", driving)
  end

  def test_number_of_passengers()
    number = @bus.count_passengers()
    assert_equal(0, number)
  end

  def test_passenger_pickup()
    @bus.pick_up(@passenger1)
    count = @bus.count_passengers
    assert_equal(1, count)
  end

  def test_passenger_drop_off()
    @bus.pick_up(@passenger2)
    @bus.drop_off(@passenger2)
    count = @bus.count_passengers
    assert_equal(0, count)
  end

  def test_empty_bus()
    @bus.pick_up(@passenger1)
    @bus.pick_up(@passenger2)
    @bus.empty()
    count = @bus.count_passengers
    assert_equal(0, count)
  end

  def test_pick_up_from_stop()
    @bus_stop.add_to_queue(@passenger1)
    @bus_stop.add_to_queue(@passenger2)
    @bus.pick_up_from_stop(@bus_stop)
    assert_equal(0, @queue.count())
    assert_equal(2, @bus.count_passengers())
  end

end #end of class
