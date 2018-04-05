require_relative('./fizzbuzz')
require('minitest/autorun')

class FizzbuzzTest < MiniTest::Test
  def test_fizzbuzz__neither_returns_number_as_string_2
    result = fizzbuzz(2)
    assert_equal("2", result)
  end

  def test_fizzbuzz__neither_return_number_as_string_4
    result = fizzbuzz(4)
    assert_equal("4", result)
  end

  def test_fizzbuzz__divisible_by_3_returns_fizz_3
    result = fizzbuzz(3)
    assert_equal("Fizz", result)
  end

  def test_fizzbuzz__divisible_by_5_returns_buzz_5
    result = fizzbuzz(5)
    assert_equal("Buzz", result)
  end

  def test_fizzbuzz__divisble_by_both_returns_fizzbuzz_15
    result = fizzbuzz(15)
    assert_equal("FizzBuzz", result)
  end
end
