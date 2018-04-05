require('pry-byebug')
require_relative('models/pizza_order.rb')
require_relative('models/customer.rb')

PizzaOrder.delete_all()
Customer.delete_all()

# order1 = PizzaOrder.new({'first_name' => 'Luke', 'last_name' => 'Skywalker', 'quantity' => '1', 'topping' => 'Napoli'})

#order2 = PizzaOrder.new({'first_name' => 'Darth', 'last_name' => 'Vader', 'quantity' => '1', 'topping' => 'Quattro Formaggi'})

customer1 = Customer.new({'name' => 'John'})
customer1.save()

order1 = PizzaOrder.new({
  'topping' => 'Pepperoni',
  'quantity' => 2,
  'customer_id' => customer1.id
  })

  order1.save()
binding.pry

nil
