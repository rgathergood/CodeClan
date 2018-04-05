# def get_account_name(account)
#   return account[:holder_name]
# end
class BankAccount

  # attr_reader :type, :balance, :holder_name
  # attr_writer :type, :balance, :holder_name

  attr_accessor :type, :balance, :holder_name

  def initialize(input_holder_name, input_balance, input_type)
    @holder_name = input_holder_name
    @balance = input_balance
    @type = input_type
  end

  def pay_in(value)
    @balance += value
  end

  def pay_monthly_fee()
    @balance -= 10 if @type == "student"
    @balance -= 50 if @type == "business"
  end
  #Could create hash for this

  # def holder_name()
  #   return @holder_name
  # end
  #
  # def account_balance()
  #   return @balance
  # end
  #
  # def account_type()
  #   return @type
  # end
  #
  # def set_holder_name(name)
  #   @holder_name = name
  # end

  # def set_account_balance(new_balance)
  #   @balance = new_balance
  # end
  #
  # def set_account_type(new_type)
  #   @type = new_type
  # end
end
