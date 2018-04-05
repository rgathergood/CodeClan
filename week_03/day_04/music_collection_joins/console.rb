require('pry-byebug')

require_relative('models/artist.rb')
require_relative('models/album.rb')

artist1 = Artist.new({'name' => 'Queen'})
artist1.save()
artist2 = Artist.new({'name' => 'The Police'})
artist2.save()
artist3 = Artist.new({'name' =>})

album1 = Album.new(
  {'title' => 'A Kind Of Magic',
    'genre' => 'rock',
    'artist_id' => artist1.id}
  )

album1.save()
binding.pry

nil
