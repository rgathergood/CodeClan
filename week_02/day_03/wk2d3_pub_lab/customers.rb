class Customers

  attr_reader(:name, :wallet_balance, :age)

  def initialize(name, wallet_balance, age)
    @name = name
    @wallet_balance = wallet_balance
    @age = age
  end

  def remove_funds(drink_price)
    @wallet_balance -= drink_price
  end

end #end of class
