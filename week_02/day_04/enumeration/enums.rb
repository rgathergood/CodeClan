chickens = ["Margaret", "Hetty", "Henrietta", "Audrey", "Mabel"]

#EACH
#Traditional for loop
# for chicken in chickens
#   p chicken
# end
#
#Exactly the same as above
# chickens.each do |chicken|
#   shouting_chicken = chicken.upcase()
#   p shouting_chicken
# end

#MAP
#Traditional
# name_lengths = []
# chickens.each { |chicken| name_lengths << chicken.length() }
# p name_lengths
#
#Alternative to each method
# name_lengths = chickens.map { |chicken| chicken.length() }
# p name_lengths

# chickens.each_with_index { |chicken, index| p "#{ chicken } is at index #{ index }!" }

#FIND
# p chickens.find { |chicken| chicken[0] == "H" }
# p chickens.find_all { |chicken| chicken[0] == "H" }

#REDUCE
# p chickens.reduce { |list, chicken| list + ", " + chicken }
#
number = [1, 2, 3, 4, 5]
p number.reduce { |sum, number| sum + number }
