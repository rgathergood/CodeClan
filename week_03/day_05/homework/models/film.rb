require_relative('../db/sql_runner.rb')
require_relative('customer.rb')
require_relative('ticket.rb')
require_relative('screening.rb')

class Film

  attr_reader(:id)
  attr_accessor(:title, :price)

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @title = options['title']
    @price = options['price']
  end

  def save()
    sql = "INSERT INTO films (title, price)
    VALUES($1, $2)
    RETURNING id"
    values = [@title, @price]
    location = SqlRunner.run( sql, values).first
    @id = location['id'].to_i
  end

  def delete()
    sql = "DELETE FROM films WHERE id = $1"
    values = [@id]
    SqlRunner.run( sql, values)
  end

  def update()
    sql = "UPDATE films
    SET(title, price) = ($1, $2)
    WHERE id = $3;"
    values = [@title, @price, @id]
    SqlRunner.run( sql, values)
  end

  def customers()
    sql = "SELECT customers.* FROM customers
    INNER JOIN tickets ON customers.id = tickets.customer_id
    WHERE film_id = $1"
    values = [@id]
    customers = SqlRunner.run(sql, values)
    result = customers.map{|customer|Customer.new(customer)}
    return result
  end

  def attendance()
    sql = "SELECT COUNT(customers.*) AS total FROM customers
    INNER JOIN tickets ON tickets.customer_id = customer_id
    WHERE tickets.film_id = $1"
    values = [@id]
    attendance = SqlRunner.run(sql, values).first
    return attendance['total'].to_i
  end

  def screening()
    sql = "SELECT show_time FROM screenings
    WHERE screenings.film_id = $1"
    values = [@id]
    screenings = SqlRunner.run(sql, values)
    result = screenings.map{|screening|Screening.new(screening)}
    return result
  end
  #Why does this return film_id = 0?

  def Film.all()
    sql = "SELECT * FROM films"
    values = []
    films = SqlRunner.run(sql, values)
    result = films.map{|film| Film.new(film)}
    return result
  end

  def Film.delete_all()
    sql = "DELETE FROM films"
    values = []
    SqlRunner.run(sql, values)
  end

end #end of class
