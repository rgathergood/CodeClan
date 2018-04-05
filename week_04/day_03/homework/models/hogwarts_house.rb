require_relative('../db/sql_runner.rb')

class Hogwarts_house

  attr_reader(:name, :crest, :id)

  def initialize(options)
    @id = options['id'].to_i
    @name = options['name']
    @crest = options['crest']
  end

  def save()
    sql = "INSERT INTO hogwarts_houses
    (
      name,
      crest
    )
    VALUES
    (
      $1, $2
    )
    RETURNING *"
    values = [@name, @crest]
    house_info = SqlRunner.run(sql, values)
    @id = house_info.first()['id'].to_i
  end

  def self.delete_all()
    sql = "DELETE FROM hogwarts_houses"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM hogwarts_houses"
    houses = SqlRunner.run(sql)
    result = houses.map {|house| Hogwarts_house.new(house)}
    return result
  end

  def self.find(id)
    sql = "SELECT * FROM hogwarts_houses WHERE id = $1"
    values = [id]
    house = SqlRunner.run(sql, values)
    result = Hogwarts_house.new(house.first())
    return result
  end

end
