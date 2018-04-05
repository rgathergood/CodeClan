class Guest

  attr_reader(:name, :favourite_song)
  attr_accessor(:wallet_balance, :tab)

  def initialize(name, wallet_balance, favourite_song)
    @name = name
    @wallet_balance = wallet_balance
    @favourite_song = favourite_song
    @tab = 0
  end

  def guest_pays_fee(fee)
    @wallet_balance -= fee
  end

  def is_favourite_song_on_list(present)
    return "WHOOOOP!" if present
  end
end #end of class
