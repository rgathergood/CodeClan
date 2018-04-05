chicken_hashes = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

def find_chicken_by_name(array, name)
  for chicken in array
    if (chicken[:name] == name)
      return chicken
    end
  end
  return "Not Found"
end

p find_chicken_by_name(chicken_hashes, "Hetty")
p find_chicken_by_name(chicken_hashes, "Steve")

# def count_eggs(array)
#   total_eggs = 0
#
#   for chicken in array
#     total_eggs += chicken[:eggs]
#     chicken[:eggs] = 0
#   end
#
#     return "#{ total_eggs } eggs collected"
# end
#
# p count_eggs(chicken_hashes)
