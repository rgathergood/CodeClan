require_relative('vehicle')

class Car < Vehicle

  attr_reader(:model)

  def initialize(model)
    super(4)
    @model = model
  end

end #end of class
