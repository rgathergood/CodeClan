class River

  attr_reader :name, :fish

  def initialize(name, fish)
    @name = name
    @fish = ["Harry Haddock", "Sally Salmon", "Peter Pike", "Tommy Trout"]
  end

  def remove_fish()
    @fish.pop()
  end

  def count_fish()
    return @fish.count
  end

end#end of class
