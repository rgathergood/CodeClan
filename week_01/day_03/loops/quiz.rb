my_number = 5
p "What number am I thinking of?"
value = gets.chomp.to_i()

while (value != my_number)
  if(value > my_number)
    p "Number is too high"
  else
    p "Number is too low"
  end

  value = gets.chomp.to_i()
end

p "Well done!"
