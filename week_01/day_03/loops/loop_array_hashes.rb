chicken_hashes = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

total_eggs = 0

for chicken in chicken_hashes
  if chicken[:eggs] > 0
    p "#{chicken[:name]}"
  end
end
# List chickens without any eggs 

for chicken in chicken_hashes
  # p "#{chicken[:name]} is #{chicken[:age]}"
  total_eggs += chicken[:eggs]
  chicken[:eggs] = 0
end

p "#{total_eggs} eggs collected"
p chicken_hashes
