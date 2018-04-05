class Sinatra_app

  def initialize(string1, string2 = "")
    @string1 = string1
    @string2 = string2
  end

  def equal()
    if @string1 == @string2
      return "It's a match!"
    else
      return "Oh dear"
    end
  end

  def palindrome()
    if @string1 == @string1.reverse
      return "What a nice looking palindrome"
    else
      return "What a shame"
    end
  end

  def isogram()
    if @string1.chars.uniq == @string1.chars
      return "Wow much unique"
    else
      return "Hmmm too boring"
    end
  end

  def anagram()
    if @string1.split(//).sort == @string2.split(//).sort
      return "What an amazing anagram"
    else
      return "Doesn't look like much to me"
    end
  end

end #end of class
