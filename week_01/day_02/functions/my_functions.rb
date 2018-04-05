
def greet(name, time_of_day)
  greeting = "Good #{ time_of_day }, #{ name.capitalize() }"
  return greeting
end


def add(firstnumber, secondnumber)
  return firstnumber + secondnumber
end

def population_density(population, area)
   return population / area.to_f()
end


# Task
# Create an add function
# this will take two parameters
# call the first parameter firstnumber and the second secondnumber
# use the return keyword
# Invoke the function add( 2, 3 )
#
# Create a population_density function
# this will take two parameters
# call the first parameter population and the second area
# calculate the population density (e.g. population / area) and return it
# invoke the function using the population and area of Mauritius:
# population: 5373000
# area: 77933
