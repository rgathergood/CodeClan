class Rooms

  attr_accessor(:song_list, :occupants)
  attr_reader(:capacity, :room_fee, :till_balance)

  def initialize(capacity, till_balance, room_fee, song_list = [], occupants = [])
    @capacity = capacity
    @song_list = song_list
    @till_balance = till_balance
    @room_fee = room_fee
    @occupants = occupants
  end

  def add_guest(guest)
    if is_room_full()
      @occupants << guest
      return "Come on in!"
    end
    return "Sorry this room is full"
  end

  def is_favourite_song_on_list(guest)

    return @song_list.include?(guest.favourite_song)

    # for song in @song_list
    #   for guest in @occupants
    #     if song == guest.favourite_song
    #   end
    # end
  end

  def is_room_full()
    return @occupants.count < @capacity
  end


  def remove_guest(guest)
    @occupants.delete(guest)
  end

  def guest_can_afford_fee(guest)
    if guest.wallet_balance >= @room_fee
      return true
    else
      return "Sorry you cannot afford this room"
    end
  end

  def collect_guest_fee(guest)
    guest.guest_pays_fee(@room_fee)
    @till_balance += @room_fee
  end

  def add_drink_to_tab(guest, drink_price)
    guest.tab += drink_price
  end

  def add_song(song)
    @song_list << song
  end

end #end of class
