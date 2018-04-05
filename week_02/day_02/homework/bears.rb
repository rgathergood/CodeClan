class Bears

  attr_reader(:name, :stomach)

  def initialize(name)
    @name = name
    @stomach = []
  end

  def take_fish(river)
    @stomach << river.remove_fish()
  end

  def roar()
    return "ROAR!!!"
  end

  def count_food()
    return @stomach.count
  end

end#end of class
