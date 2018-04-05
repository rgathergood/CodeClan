require("minitest/autorun")
require_relative("../song.rb")

class SongTest < MiniTest::Test

  def setup()
    @song1 = Song.new("Piano Man", "Billy Joel")
  end

  def test_song_has_title()
    assert_equal("Piano Man", @song1.title)
  end

  def test_song_has_artist()
    assert_equal("Billy Joel", @song1.artist)
  end

end #end of class
