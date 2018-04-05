require("minitest/autorun")
require_relative("testing_task_2.rb")
require_relative("card.rb")

class CardGameTest < MiniTest::Test

  def setup()
    @cardGame = CardGame.new
    @card1 = Card.new("Hearts", 10)
    @card2 = Card.new("Ace", 1)
    @cards = [@card1, @card2]
  end

  def test_card_is_ace()
    assert_equal(true, @cardGame.checkforAce(@card2))
  end

  def test_card_is_not_ace()
    assert_equal(false, @cardGame.checkforAce(@card1))
  end

  def test_highest_card()
    assert_equal(@card1, @cardGame.highest_card(@card1, @card2))
  end

  def test_cards_total()
    assert_equal("You have a total of 11", CardGame.cards_total(@cards))
  end

end
