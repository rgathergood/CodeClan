require("minitest/autorun")
require_relative("../person")

class PersonTest < MiniTest::Test

  def setup()
    @person = Person.new("Rob", 24)
  end

  def test_person_has_name()
    name = @person.name()
    assert_equal("Rob", name)
  end

  def test_person_has_age()
    age = @person.age()
    assert_equal(24, age)
  end

end#end of class
