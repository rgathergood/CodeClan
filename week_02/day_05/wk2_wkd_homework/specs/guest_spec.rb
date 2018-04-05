require("minitest/autorun")
require_relative("../guest.rb")
require_relative("../song.rb")
require_relative("../bar.rb")

class GuestTest < MiniTest::Test

  def setup()
    @song1 = Song.new("Piano Man", "Billy Joel")
    @guest1 = Guest.new("Michael Scott", 420, @song1)
  end

  def test_guest_has_name()
    assert_equal("Michael Scott", @guest1.name) #test 1
  end

  def test_guest_wallet_balance()
    assert_equal(420, @guest1.wallet_balance) # test 2
  end

  def test_guest_has_favourite_song()
    assert_equal(@song1, @guest1.favourite_song) # test 3
  end

  def test_guest_pays_fee()
    @guest1.guest_pays_fee(10)
    assert_equal(410, @guest1.wallet_balance)
  end

  def test_empty_tab()
    assert_equal(0, @guest1.tab)
  end

  def test_whoop_when_favourite_song_on_list()
    whoop = @guest1.is_favourite_song_on_list(true)
    assert_equal("WHOOOOP!", whoop)
  end

end #end of class
