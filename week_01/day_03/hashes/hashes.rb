# meals = [ "yogurt", "roll", "steak" ]

my_first_hash = {}
my_second_hash = Hash.new()

meals = {
          :breakfast => "yogurt",
          :lunch => "roll",
          :dinner => "steak"
        }
#
#
# # p meals
# p meals["breakfast"]
# # p meals["Supper"]
# meals["breakfast"] = "pancakes"
# p meals
# meals["supper"] = "pasta"
# p meals
#
# meals.delete("supper")
# p meals

# p meals.key()
# p meals.values()

# p :my_sym
# p :hello



# pocket_money = {
#                   "rob" => 42,
#                   "cal" => 128,
#                   "tim" => 87,
#                   "bec" => 76,
#                 }
#
# pocket_money["mat"] = 12
# pocket_money["rob"] = 24
# pocket_money.delete("bec")
# p pocket_money
#
# p pocket_money.keys()
# p pocket_money.values()

# p meals [:breakfast]
# meals[:breakfast] = "pancakes"
#
# meals = {
#   breakfast: "yoghurt",
#   supper: "chips"
# }
#
# p meals[:supper]

# countries = {
#   uk: {
#     capital: "London",
#     population: 1000
#   },
#   germany: {
#     capital: "Berlin",
#     population: 5
#   }
# }
#
# p countries[:germany][:population]

avengers = {
  ironman: {
    name: "Tony Stark",
    moves: {
      punch: 10,
      kick: 100
    }
  },

  hulk: {
    name: "Bruce Banner",
    moves: {
      smash: 1000,
      roll: 500
    }
  }
}

p avengers[:ironman][:moves][:kick]
p avengers[:hulk][:moves][:roll]
