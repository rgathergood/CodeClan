require('minitest/autorun')
require_relative('../bank_account') #remember this for every test in Ruby

class TestBankAccount < MiniTest::Test

def setup
  @account = BankAccount.new("Jarrod", 3, "personal")
  @finns_account = BankAccount.new("Finn", 50000, "business")
end

  def test_account_name
    holder_name = @account.holder_name()
    assert_equal("Jarrod", holder_name)
  end

  def test_account_balance
    balance = @account.balance()
    assert_equal(3, balance)
  end

  def test_account_type
    type = @account.type()
    assert_equal("personal", type)
  end

  def test_set_account_name
    @finns_account.holder_name = "Darren"
    holder_name = @finns_account.holder_name()
    assert_equal("Darren", holder_name)
  end

  def test_set_account_balance
    @finns_account.balance = 300
    account_balance = @finns_account.balance()
    assert_equal(300, account_balance)
  end

  def test_set_account_type
    @finns_account.type = "savings"
    account_type = @finns_account.type()
    assert_equal("savings", account_type)
  end

  def test_pay_into_account
    account = BankAccount.new("Jarrod", 5, "personal")
    account.pay_in(1000)
    new_balance = account.balance()
    assert_equal(1005, new_balance)
  end

  def test_pay_monthly_fee
    account = BankAccount.new("Darren", 500, "student")
    account.pay_monthly_fee()
    new_balance = account.balance()
    assert_equal(490, new_balance)
  end

  def test_pay_monthly_fee__business
    account = BankAccount.new("Rob", 100, "business")
    account.pay_monthly_fee()
    new_balance= account.balance()
    assert_equal(50, new_balance)
  end
end

# account_2 = BankAccount.new("Darren", 2, "business")
# {
#   holder_name: "Jarrod",
#   amount: 3,
#   type: "personal"
# }
# name = get_account_name(account)
# assert_equal("Jarrod", name)
