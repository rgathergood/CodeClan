class Band
  def initialize(musicians) #array
    @musicians = musicians
  end

  def perform(song_title)
    performance = []
    for musician in @musicians
      performance << musician.play_song(song_title)
    end
    return performance
  end
end #end of class
