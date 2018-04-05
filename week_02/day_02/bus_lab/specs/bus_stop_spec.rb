require("minitest/autorun")
require_relative("../bus_stop")
require_relative("../person")

class BusStopTest < MiniTest::Test

  def setup()
    @queue = []
    @bus_stop = BusStop.new("Holy Corner", @queue)
    @passenger1 = Person.new("Adam", 54)
  end

  def test_bus_stop_has_name()
    name = @bus_stop.name()
    assert_equal("Holy Corner", name)
  end

  def test_add_passenger_to_queue()
    new_queuer = @bus_stop.add_to_queue(@passenger1)
    assert_equal(1, @queue.count())
  end

  def test_empty_queue()
    @bus_stop.add_to_queue(@passenger1)
    @bus_stop.empty_queue()
    assert_equal(0, @queue.count())
  end

end
