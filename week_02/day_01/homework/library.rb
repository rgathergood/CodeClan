class Library

  attr_reader :books

  def initialize(books = [])
    @books = books
  end

  def search_by_title(title)
    for book in @books
      return book if book[:title] == title
    end
  end

  def search_rental_details_by_title(title)
    for book in @books
      return book[:rental_details] if book[:title] == title
    end
    return "Book not found"
  end

  def add_new_book(new_book)
    @books.push(
      {
        title: "1984",
        rental_details: {
          student_name: "",
          date: ""
        }
      }
    )
  end

  def change_details(title,name, date)
    for book in @books
      if book[:title] == title
        book[:rental_details][:student_name] = name
        book [:rental_details][:date] = date
      end
    end
  end

end
