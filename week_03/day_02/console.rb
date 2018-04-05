require('pry-byebug')
require_relative('models/pizza_order.rb')

order1 = PizzaOrder.new({'first_name' => 'Luke', 'last_name' => 'Skywalker', 'quantity' => '1', 'topping' => 'Napoli'})
order2 = PizzaOrder.new({'first_name' => 'Darth', 'last_name' => 'Vader', 'quantity' => '1', 'topping' => 'Quattro Formaggi'})

binding.pry

nil
