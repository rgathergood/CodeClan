require("minitest/autorun")
require_relative("../rooms.rb")
require_relative("../song.rb")
require_relative("../guest.rb")
require_relative("../bar.rb")

class RoomsTest < MiniTest::Test

  def setup()
    @song1 = Song.new("Piano Man", "Billy Joel")
    @song2 = Song.new("2112", "Rush")
    @song3 = Song.new("Fear of the Dark", "Iron Maiden")
    @song_list = [ @song1, @song2, @song2]
    @room1 = Rooms.new(3, 1000, 60, @song_list)
    @guest1 = Guest.new("Michael Scott", 420, @song1)
    @guest2 = Guest.new("Dwight Schrute", 2000, @song2)
    @guest3 = Guest.new("Jim Halpert", 700, @song3)
    @guest4 = Guest.new("Pam Beesly", 300, @song3)
    @guest5 = Guest.new("Kevin Malone", 8, @song1)
    @bar = Bar.new()
  end

  def test_room_is_empty()
    assert_equal([], @room1.occupants) #check this test
  end

  def test_room_has_capacity()
    assert_equal(3, @room1.capacity)
  end

  def test_add_guest_to_room()
    @room1.add_guest(@guest1)
    @room1.add_guest(@guest2)
    occupants_name_list = []
    @room1.occupants.each { |person| occupants_name_list << person.name() }
    assert_equal(["Michael Scott", "Dwight Schrute"], occupants_name_list)
  end

  def test_remove_guest_from_remove()
    @room1.add_guest(@guest1)
    @room1.add_guest(@guest2)
    @room1.remove_guest(@guest2)
    # @room1.song_list.push()
    occupants_name_list = []
    @room1.occupants.each { |person| occupants_name_list << person.name() }
    assert_equal(["Michael Scott"], occupants_name_list)
  end

  def test_check_room_capacity__not_full()
    @room1.add_guest(@guest1)
    @room1.add_guest(@guest2)
    new_guest = @room1.add_guest(@guest3)
    assert_equal("Come on in!", new_guest)
  end

  def test_check_room_capacity__full()
    @room1.add_guest(@guest1)
    @room1.add_guest(@guest2)
    @room1.add_guest(@guest3)
    new_guest = @room1.add_guest(@guest4)
    assert_equal("Sorry this room is full", new_guest)
  end

  def test_room_has_song_list()
    assert_equal(@song_list, @room1.song_list())
  end

  def test_till_has_till_balance()
    assert_equal(1000, @room1.till_balance())
  end

  def test_room_has_fee()
    assert_equal(60, @room1.room_fee)
  end

  def test_guest_can_afford_fee__can_afford()
    guest = @room1.guest_can_afford_fee(@guest1)
    assert_equal(true, guest)
  end

  def test_guest_can_afford_fee__cannnot_afford()
    guest = @room1.guest_can_afford_fee(@guest5)
    assert_equal("Sorry you cannot afford this room", guest)
  end

  def test_collect_guest_fee()
    @room1.collect_guest_fee(@guest1)
    assert_equal(1060, @room1.till_balance)
    assert_equal(360, @guest1.wallet_balance)
  end

  def test_add_drink_to_tab()
    @room1.add_drink_to_tab(@guest1, @bar.drinks["Wine"])
    @room1.add_drink_to_tab(@guest1, @bar.drinks["Beer"])
    assert_equal(10, @guest1.tab)
  end

  def test_add_to_song_list()
    @song4 = Song.new("Zombie", "The Cranberries")
    @song_list << @song4
    @room1.add_song(@song4)
    assert_equal(@song_list, @room1.song_list)
  end

end #end of class
