p "What animal are you?"

name = gets.chomp

if (name.downcase == "chicken")
  p "This is my favourite animal!"
elsif (name.downcase == "kitten")
  p "Kittens are pretty good too!"
else
  p "This is not my favourite animal!"
end
