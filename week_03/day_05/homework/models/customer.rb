require_relative('../db/sql_runner.rb')
require_relative('film.rb')
require_relative('ticket.rb')

class Customer

  attr_reader(:id)
  attr_accessor(:name, :funds)

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @funds = options['funds']
  end

  def save()
    sql = "INSERT INTO customers (name, funds)
    VALUES ($1, $2)
    RETURNING id"
    values = [@name, @funds]
    location = SqlRunner.run(sql, values).first
    @id = location['id'].to_i
  end

  def delete()
    sql = "DELETE FROM customers WHERE id = $1"
    values = [@id]
    SqlRunner.run( sql, values)
  end

  def update()
    sql = "UPDATE customer
    SET(name, funds) = ($1, $2)
    WHERE id = $3;"
    values = [@name, @funds, @id]
    SqlRunner.run( sql, values)
  end

  def films()
    sql = "SELECT films.* FROM films
    INNER JOIN tickets ON films.id = tickets.film_id
    WHERE customer_id = $1"
    values = [@id]
    films = SqlRunner.run(sql, values)
    result = films.map{|film|Film.new(film)}
    return result
  end

  def tickets()
    sql = "SELECT COUNT(films.*) AS total FROM films
    INNER JOIN tickets ON tickets.film_id = films.id
    WHERE tickets.customer_id = $1"
    values = [@id]
    tickets = SqlRunner.run(sql, values).first
    return tickets['total'].to_i
  end

  def buys_ticket()
    sql = "SELECT SUM(films.price) AS total FROM films
    INNER JOIN tickets ON tickets.film_id = films.id
    WHERE tickets.customer_id = $1"
    values = [@id]
    tickets = SqlRunner.run(sql, values).first
    @funds = @funds - tickets['total'].to_i
  end

  def Customer.all()
    sql = "SELECT * FROM customers"
    values = []
    customers = SqlRunner.run(sql, values)
    result = customers.map{|customer| Customer.new(customer)}
    return result
  end

  def Customer.delete_all()
    sql = "DELETE FROM customers"
    values = []
    SqlRunner.run(sql, values)
  end

  # def Customer.map_items(customer_data)
  #   result = customer_data.map {|customer|Customer.new(customer)}
  #   return result
  # end

end #end of class
