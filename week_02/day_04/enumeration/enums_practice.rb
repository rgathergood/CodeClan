pets = [
  {
    name: "Sir Percy",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
  },
  {
    name: "King Bagdemagus",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
  },
  {
    name: "Sir Lancelot",
    pet_type: :dog,
    breed: "Pomsky",
    price: 1000,
  },
  {
    name: "Arthur",
    pet_type: :dog,
    breed: "Husky",
    price: 900,
  },
  {
    name: "Tristan",
    pet_type: :dog,
    breed: "Basset Hound",
    price: 800,
  },
  {
    name: "Merlin",
    pet_type: :cat,
    breed: "Egyptian Mau",
    price: 1500,
  }
]

# Print out all of the names using a loop
for pet in pets
  p pet[:name]
end

# Print out all of the names using an enumerable
pets.each { |pet| p pet[:name] }

# Find a pet using a loop and if statement
for pet in pets
  if pet[:name] == "Sir Percy"
    p pet
  end
end

# Find a pet using an enumerable
p pets.find { |pet| pet[:name] == "Merlin" }
