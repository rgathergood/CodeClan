class Musician
  attr_reader(:name)

  def initialize(name, instrument)
    @name = name
    @instrument = instrument
  end

  def play_song(song_title)
    @instrument.make_sound(song_title)
  end
end #end of class
