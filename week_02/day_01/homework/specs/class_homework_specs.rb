require('minitest/autorun')
require_relative('../class_homework')

#Part A
class TestStudent < MiniTest::Test

  def setup
    @student = Student.new("Rob", 19)
  end

  def test_student_name
    name = @student.student_name()
    assert_equal("Rob", name)
  end

  def test_student_cohort
    cohort = @student.student_cohort()
    assert_equal(19, cohort)
  end

  def test_set_student_name
    @student.set_student_name("Chris")
    new_name = @student.student_name()
    assert_equal("Chris", new_name)
  end

  def test_set_student_cohort
    @student.set_student_cohort(321)
    new_cohort = @student.student_cohort()
    assert_equal(321, new_cohort)
  end

  def test_student_talk
    sentence = @student.student_talk("I can talk!")
  end

  def test_student_favourite_language
    string = @student.favourite_language("Ruby!")
    assert_equal("My favourite language is Ruby!", string)
  end

end

#Part B
class TestSportsTeam < MiniTest::Test

  def setup
    @team = SportsTeam.new("The Eagles", ["Charlie Day", "Sweet Dee", "Ronald McDonald"], "Frank Reynolds")
  end

  def test_team_name
    name = @team.team_name()
    assert_equal("The Eagles", name)
  end

  def test_players
    players = @team.players()
    assert_equal(["Charlie Day", "Sweet Dee", "Ronald McDonald"], players)
  end

  def test_coach
    coach = @team.coach()
    assert_equal("Frank Reynolds", coach)
  end

  def test_change_coach
    @team.coach = "Rickety Cricket"
    assert_equal("Rickety Cricket", @team.coach)
  end

  def test_add_player
    @team.add_player("Old Man")
    players = @team.players()
    assert_equal(["Charlie Day", "Sweet Dee", "Ronald McDonald", "Old Man"], players)
  end

  def test_check_name__found
    result = @team.check_name("Charlie Day")
    assert_equal(true, result)
  end

  def test_check_name__not_found
    result = @team.check_name("Artemis")
    assert_equal(false, result)
  end

  def match_points__win
    @team.match_points("won")
    points = @team.points()
    assert_equal(10, points)
  end

  def match_points__lost
    @team.match_points("lost")
    points = @team.points()
    assert_equal(0, points)
  end


end
