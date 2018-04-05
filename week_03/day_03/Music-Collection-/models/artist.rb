require_relative('../db/sql_runner.rb')
class Artist

  attr_reader(:id)
  attr_accessor(:name)

  def initialize(options)
    @id = options ['id'].to_i if options ['id']
    @name = options ['name']
  end

  def save()
    sql =
    "INSERT INTO artists (name)
    VALUES ($1)
    RETURNING *;"
    values = [@name]
    result = SqlRunner.run(sql, values)
    @id = result[0]['id'].to_i
  end

  def album()
    sql =
    "SELECT * FROM albums WHERE id = $1;"
    values = [@id]
    result = SqlRunner.run(sql, values)
    albums_hash = result[0]
    return Album.new(albums_hash)
  end

  def update()
    sql ="UPDATE artists
    SET name = $1 WHERE id = $2; "
    values = [@name, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM artists WHERE id = $1"
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def Artist.find_by_id(id)
    sql = "SELECT* FROM artists WHERE id = $1"
    values = [id]
    artist = SqlRunner.run(sql, values)
    return artist.map{|artist| Artist.new(artist)}
  end

  def Artist.all()
    sql = "SELECT * FROM artists"
    artists = SqlRunner.run(sql)
    return artists.map{|artist| Artist.new(artist)}.first
  end

end # end of class
