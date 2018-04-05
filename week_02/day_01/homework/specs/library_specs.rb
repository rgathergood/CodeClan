require('minitest/autorun')
require_relative('../library')

class TestLibrary < MiniTest::Test

  def setup()
    @books = Library.new(
      [
        {
          title: "lord_of_the_rings",
          rental_details: {
            student_name: "Jeff",
            date: "01/12/16"
          }
        }
      ]
    )
  end

  def test_return_book_from_library
    books = @books.books()
    result = [{
      title: "lord_of_the_rings",
      rental_details: {
        student_name: "Jeff",
        date: "01/12/16"
      }
    }
  ]
  assert_equal(result, books)
end

def test_search_book_by_title
  search = @books.search_by_title("lord_of_the_rings")
  result = {
    title: "lord_of_the_rings",
    rental_details: {
      student_name: "Jeff",
      date: "01/12/16"
    }
  }
  assert_equal(search, result)
end

def test_search_rental_details_by_title
  rental_details = @books.search_rental_details_by_title("lord_of_the_rings")
  result = {
    student_name: "Jeff",
    date: "01/12/16"
  }
  assert_equal(result, rental_details)
end

def test_add_new_book
  @books.add_new_book("1984")
  books = @books.books()
  result = [
    {
      title: "lord_of_the_rings",
      rental_details: {
        student_name: "Jeff",
        date: "01/12/16"
      }
    },
    {
      title: "1984",
      rental_details: {
        student_name: "",
        date: ""
      }
    }
  ]
  assert_equal(result, books)
end

def test_change_details
  @books.change_details("lord_of_the_rings", "Rob", "06/02/18")
  books = @books.books()
  result = [
    {
      title: "lord_of_the_rings",
      rental_details: {
        student_name: "Rob",
        date: "06/02/18"
      }
    }
  ]
  assert_equal(result, books)
end

end
