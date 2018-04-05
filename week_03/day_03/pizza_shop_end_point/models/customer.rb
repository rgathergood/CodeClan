require_relative('../db/sql_runner.rb')

class Customer
  attr_reader(:id, :name)

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
  end

  def pizza_orders()
    sql = "SELECT * FROM pizza_orders
    WHERE customer_id = $1"
    values = [@id]
    results = SqlRunner.run(sql, values)
    orders = results.map {|order| PizzaOrder.new(order)}
    return orders
  end

  def save()
    sql =
    "INSERT INTO customers(name)
    VALUES($1)
    RETURNING *;"
    values = [@name]
    result = SqlRunner.run(sql, values)
    @id = result[0]['id'].to_i
  end

  def Customer.all()
    sql = "SELECT * FROM customers;"
    customers = SqlRunner.run(sql)
    return customers.map {|customer_hash| Customer.new(customer_hash)}
  end

  def Customer.delete_all()
    sql = "DELETE FROM customers"
    SqlRunner.run(sql)
  end
end #end of class
