class Pub

  attr_accessor(:pub_name, :till_balance)

  def initialize (pub_name, till_balance)
    @pub_name = pub_name
    @till_balance = till_balance
    @drinks = []
  end

  def stock_take()
    @drinks.count()
  end

  def add_drink(drink)
    @drinks.push(drink) if !drink.nil?
  end

  def pub_checks_age(customer)
    age = false
    if customer.age >= 18
      age = true
    end
    return age
  end

  def find_drink_by_name(name)
    for drink_to_buy in @drinks
      if drink_to_buy.name() == name
        return drink_to_buy.name
      end
    end
    return nil
  end

  def can_customer_afford_drink(customer_funds, drink_price)
    customer_funds.wallet_balance >= drink_price.price
  end

  def add_funds_to_till(drink_price)
    @till_balance += drink_price
  end

  def buy_drink(customer, drink_name)
    if pub_checks_age(customer)
      if find_drink_by_name(drink_name)
        if can_customer_afford_drink
          return customer.remove_funds(drink_name.price)
        end
      end
    end
  end

end #end of class
