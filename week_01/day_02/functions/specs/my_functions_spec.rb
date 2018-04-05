require( 'minitest/autorun' )
require_relative( '../my_functions' )

class FunctionsTest < MiniTest::Test

  def test_greet
    result = greet('Rob', 'morning')
    assert_equal('Good morning, Rob', result)
  end

  def test_greet__capitalize
    result = greet('rob', 'morning')
    assert_equal('Good morning, Rob', result)
  end

  def test_add
    result = add( 2, 3 )
    assert_equal( 5, result )
  end

  def test_add__negative
    result = add(4, -2)
    assert_equal(2, result)
  end

end
