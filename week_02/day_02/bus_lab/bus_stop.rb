class BusStop
  attr_reader(:name, :queue)

  def initialize(name, queue)
    @name = name
    @queue = queue
  end

  def add_to_queue(new_queuer)
    @queue.push(new_queuer)
  end

  def empty_queue()
    @queue.clear()    
  end
end #end of class
