require('pg')
require_relative('../db/sql_runner.rb')

class PizzaOrder

  attr_accessor :quantity, :topping
  attr_reader :id, :customer_id

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @quantity = options['quantity'].to_i
    @topping = options['topping']
    @customer_id = options['customer_id'].to_i
  end

  def customer()
    sql = "SELECT * FROM customers
    WHERE id = $1;"
    values = [@customer_id]
    result = SqlRunner.run(sql, values)
    customer_hash = result[0]
    return Customer.new(customer_hash)
  end

  def save()
    db = PG.connect( { dbname: 'pizza_shop', host: 'localhost'} )
    sql =
      "INSERT INTO pizza_orders
      (
        quantity,
        topping,
        customer_id
      )
      VALUES
      (
        $1, $2, $3
      )
      RETURNING *;
      "
      values = [@quantity, @topping, @customer_id]
      db.prepare("save", sql)
      @id = db.exec_prepared("save", values)[0]['id'].to_i
      db.close()
  end

  def delete()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "DELETE FROM pizza_orders WHERE id = $1"
    values = [@id]
    db.prepare("delete_one", sql)
    db.exec_prepared("delete_one", values)
    db.close
  end

  def update()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "UPDATE pizza_orders
    SET
    (
      first_name,
      last_name,
      quantity,
      topping
    ) =
    (
      $1, $2, $3, $4
    )
    WHERE id = $5
    ;"
    values = [@first_name, @last_name, @quantity, @topping, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close
  end

  def PizzaOrder.all()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "SELECT * FROM pizza_orders"
    values = []
    db.prepare("all", sql)
    orders = db.exec_prepared("all", values)
    db.close()
    return orders.map {|order| PizzaOrder.new(order)}
  end

  def PizzaOrder.delete_all()
    db = PG.connect({ dbname: 'pizza_shop', host: 'localhost'})
    sql = "DELETE FROM pizza_orders"
    values = []
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all", values)
    db.close
  end

end #end of class
