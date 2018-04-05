require_relative('../db/sql_runner.rb')
require_relative('customer.rb')
require_relative('film.rb')

class Ticket

  attr_reader(:id)
  attr_accessor(:customer_id, :film_id)

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @customer_id = options['customer_id'].to_i
    @film_id = options['film_id'].to_i
  end

  def save()
    sql = "INSERT INTO tickets (customer_id, film_id)
    VALUES($1, $2)
    RETURNING id"
    values = [@customer_id, @film_id]
    location = SqlRunner.run( sql, values).first
    @id = location['id'].to_i
  end

  def delete()
    sql = "DELETE FROM tickets WHERE id = $1"
    values = [@id]
    SqlRunner.run( sql, values)
  end

  def update()
    sql = "UPDATE tickets
    SET(customer_id, film_id) = ($1, $2)
    WHERE id = $3;"
    values = [@customer_id, @film_id, @id]
    SqlRunner.run( sql, values)
  end

  def customer()
    sql = "SELECT * FROM customers WHERE id = $1"
    values = [@customer_id]
    customer = SqlRunner.run(sql, values).first
    return Customer.new(customer)
  end

  def film()
    sql = "SELECT * FROM films WHERE id = $1"
    values = [@film_id]
    film = SqlRunner.run(sql, values).first
    return Film.new(film)
  end

  def Ticket.all()
    sql = "SELECT * FROM tickets"
    values = []
    tickets = SqlRunner.run(sql, values)
    result = tickets.map{|ticket| Ticket.new(ticket)}
    return result
  end

  def Ticket.delete_all()
    sql = "DELETE FROM tickets"
    values = []
    SqlRunner.run(sql, values)
  end

end #end of class
