stops = ["Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket"]

# Add "Edinburgh Waverley" to the end of the array
# stops.push("Edinburgh Waverley")

# Add "Glasgow Queen St" to the start of the array
# stops.unshift("Glasgow Queen St")

# Add "Polmont" at the appropriate point (between "Falkirk High" and "Linlithgow")
# stops.insert(4, "Polmont")

# Work out the index position of "Linlithgow"
# stops.index("Linlithgow")

# Remove "Livingston" from the array using its name
# stops.delete("Livingston")

# Delete "Cumbernauld" from the array by index
# stops.delete_at(2)


# How many stops there are in the array?
# stops.count()
# stops.length()
# stops.size()

# How many ways can we return "Falkirk High" from the array?
# stops[4]
# stops[-4]
# stops.at(4)
# stops.at(-5)

# Reverse the positions of the stops in the array
# stops.reverse() #only prints the reverse
# stops.reverse!() #modifies array


# Print out all the stops using a for loop
# for stop in stops
#   print stop
# end


users = {
  "Jonathan" => {
    :twitter => "jonnyt",
    :lottery_numbers => [6, 12, 49, 33, 45, 20],
    :home_town => "Stirling",
    :pets => [
    {
      :name => "fluffy",
      :species => "cat"
    },
    {
      :name => "fido",
      :species => "dog"
    },
    {
      :name => "spike",
      :species => "dog"
    }
  ]
  },
  "Erik" => {
    :twitter => "eriksf",
    :lottery_numbers => [18, 34, 8, 11, 24],
    :home_town => "Linlithgow",
    :pets => [
    {
      :name => "nemo",
      :species => "fish"
    },
    {
      :name => "kevin",
      :species => "fish"
    },
    {
      :name => "spike",
      :species => "dog"
    },
    {
      :name => "rupert",
      :species => "parrot"
    }
  ]
  },
  "Avril" => {
    :twitter => "bridgpally",
    :lottery_numbers => [12, 14, 33, 38, 9, 25],
    :home_town => "Dunbar",
    :pets => [
      {
        :name => "monty",
        :species => "snake"
      }
    ]
  }
}

# 1. Get Jonathan's Twitter handle (i.e. the string `"jonnyt"`)
p users["Jonathan"][:twitter]

# 2. Get Erik's hometown
p users["Erik"][:home_town]

# 3. Get the array of Erik's lottery numbers
p users["Erik"][:lottery_numbers]

# 4. Get the type of Avril's pet Monty

#p user["Avril"][:pets] [0] [:species]

for pet in users["Avril"][:pets]
  if pet[:name] == "monty"
    p "Avril's pet Monty is a #{pet[:species]}"
  end
end

# 5. Get the smallest of Erik's lottery numbers
p users["Erik"][:lottery_numbers].min()

# 6. Return an array of Avril's lottery numbers that are even
def even_numbers (array)
even_nums = []
  for number in array
    if (number % 2 == 0)
      even_nums.push(number)
    end
  end
  return even_nums
end #end of def

p even_numbers(users["Avril"][:lottery_numbers])


result = []

for number in users["Avril"][:lottery_numbers]
  if (number.even?)
    result.push(number)
  end
end

p result

# 7. Erik is one lottery number short! Add the number `7` to be included in his lottery numbers
users["Erik"][:lottery_numbers].push(7)
users["Erik"][:lottery_numbers] << 7 #shovel operator

# 8. Change Erik's hometown to Edinburgh
users["Erik"]["home_town"] = "Edinburgh"

# 9. Add a pet dog to Erik called "Fluffy"
users["Erik"][:pets].push({name: "Fluffy", species: "dog"})

dog = {
  :name => "fluffy",
  :species => "dog"
}

users["Erik"][:pets].push(dog)
users["Erik"][:pets] << dog
users["Erik"][:pets].unshift(dog)
users["Erik"][:pets].push({})

# 10. Add another person to the users hash
p users["Rob"] => {}



united_kingdom = [
  {
    name: "Scotland",
    population: 5295000,
    capital: "Edinburgh"
  },
  {
    name: "Wales",
    population: 3063000,
    capital: "Swansea"
  },
  {
    name: "England",
    population: 53010000,
    capital: "London"
  },

]
  #1. Change the capital of Wales from `"Swansea"` to `"Cardiff"`.
  for country in united_kingdom
    if country[:capital] == "Swansea"
      country[:capital] = "Cardiff"
    end
  end

  # united_kingdom[1][:capital] = "Cardiff"

  # 2. Create a Hash for Northern Ireland and add it to the `united_kingdom` array (The capital is Belfast, and the population is 1,811,000).
northern_ireland = {
  name: "Northern Ireland",
  population: 1811000,
  capital: "Belfast"
}

united_kingdom.push(northern_ireland)

  # 3. Use a loop to print the names of all the countries in the UK.
  for country in united_kingdom
     p country[:name]
  end

  # 4. Use a loop to find the total population of the UK.

  # def population_count(array)
  #   total_population = 0
  #
  #   for value in array
  #     total_population += value[:population]
  #     value[:population] = 0
  #   end
  #
  #     return "#{ total_population }"
  # end
  #
  # p population_count(united_kingdom)


  total = 0

  for country in united_kingdom
    total += country[:population]
  end

  p total
