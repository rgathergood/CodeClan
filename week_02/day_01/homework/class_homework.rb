class Student

  # attr_accessor :name, :cohort

  def initialize(input_name, input_cohort)
    @name = input_name
    @cohort = input_cohort
  end

  def student_name()
    return @name
  end

  def student_cohort()
    return @cohort
  end

  def set_student_name(name)
    @name = name
  end

  def set_student_cohort(cohort)
    @cohort = cohort
  end

  def student_talk(sentence)
    return sentence
  end

  def favourite_language(favourite_language)
    return "My favourite language is #{favourite_language}"
  end

end

#Part B
class SportsTeam

  attr_accessor :team_name, :players, :coach


  def initialize(input_team_name, input_players, input_coach)
    @team_name = input_team_name
    @players = input_players
    @coach = input_coach
    @points = 0
  end

  #   def team_name()
  #     return @team_name
  #   end
  #
  #   def players()
  #     return @players
  #   end
  #
  #   def coach()
  #     return @coach
  #   end

  def change_coach(coach)
    @coach = coach
  end

  def add_player(players)
    @players.push(players)
  end

  def check_name(name_to_find)
    for player in @players
      if player == name_to_find
        return true
      end
    end
    return false
  end

  def match_points(won_or_lost)
    if won_or_lost == "won"
      @points += 10 
  end

end
