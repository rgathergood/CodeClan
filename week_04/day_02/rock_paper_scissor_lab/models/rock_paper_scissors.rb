class Rock_paper_scissors

  def initialize(input1, input2)
    @input1 = input1
    @input2 = input2
  end

  def game

    if @input1 == "rock"
      if @input2 == "scissors"
        return "Rock wins"
      elsif @input2 == "rock"
        return "It's a draw"
      elsif @input2 == "paper"
        return "Paper wins"
      end
    end

    if @input1 == "paper"
      if @input2 == "rock"
        return "Paper wins"
      elsif @input2 == "paper"
        return "It's a draw"
      elsif @input2 == "scissors"
        return "Scissors win"
      end
    end

    if @input1 == "scissors"
      if @input2 == "paper"
        return "Scissors wins"
      elsif @input2 == "scissors"
        return "It's a draw"
      elsif @input2 == "rock"
        return "Rock wins"
      end
    end

  end
end
