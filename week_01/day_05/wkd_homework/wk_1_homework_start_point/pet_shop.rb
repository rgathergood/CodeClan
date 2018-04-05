def pet_shop_name(a_pet_shop_hash)
  return a_pet_shop_hash[:name]
end


def total_cash(a_pet_shop_hash)
  return a_pet_shop_hash[:admin][:total_cash]
end


def add_or_remove_cash(a_pet_shop_hash, cash)
  a_pet_shop_hash[:admin][:total_cash] =
  a_pet_shop_hash[:admin][:total_cash] + cash
end


def pets_sold(a_pet_shop_hash)
  a_pet_shop_hash[:admin][:pets_sold]
end


def increase_pets_sold(a_pet_shop_hash, value)
  a_pet_shop_hash[:admin][:pets_sold] += value
end


def stock_count(total_pets)
  total_pets[:pets].count
end


#I struggled for ages with this one
def pets_by_breed(a_pet_shop_hash, pets)
  breed_type = [] #does the array need to be empty?
  for value in a_pet_shop_hash[:pets]
    if value[:breed] == pets
      breed_type.push(value)
    end
  end
    return breed_type
end


def find_pet_by_name(a_pet_shop_hash, a_pet)
  for pets_name in a_pet_shop_hash[:pets]
    if pets_name[:name] == a_pet
      return pets_name
    end
  end
return nil #initially forgot to add this
end


def remove_pet_by_name(a_pet_shop_hash, a_name)
  for pet in a_pet_shop_hash[:pets]
    if pet[:name] == a_name
      a_pet_shop_hash[:pets].delete(pet)
    end
  end
end


def add_pet_to_stock(a_pet_shop_hash, a_new_pet)
  a_pet_shop_hash[:pets].push(a_new_pet)
end


def customer_pet_count(customer)
  return customer[:pets].count
end


def add_pet_to_customer(customer, a_new_pet)
  return customer[:pets].push(a_new_pet)
end


#removed if statement
def customer_can_afford_pet(customer_funds, pet_price)
  return customer_funds[:cash] >= pet_price[:price]
end


def sell_pet_to_customer(a_pet_shop_hash, pet, customer)
  if pet == nil
    return
  end
  if customer_can_afford_pet(customer, pet)
    add_pet_to_customer(customer, pet) #Is this symbol unneccessary? Need to clarify?
    increase_pets_sold(a_pet_shop_hash, 1)
    add_or_remove_cash(a_pet_shop_hash, pet[:price])
  end
end


#I overthought the above for too long - match tests with functions I already created.
#Functions to call:
#add_pet_to_customer
#customer_can_afford_pet */DO THIS ONE FIRST!*/ then set if pet == nil return
#increase_pets_sold
#add_or_remove_cash

# This was a fun and challenging homework excercise, there are a few lines of code I struggled to create by myself (e.g. knowing I have to create an empty array).

#TOP_TAKEAWAY - Give your parameters meaningful names! This makes life so much easier when reviewing. (Cheers for the advice Paul!)#



#Finished in 0.002020s, 9900.9900 runs/s, 12871.2870 assertions/s.
#
# 20 runs, 26 assertions, 0 failures, 0 errors, 0 skips
# ➜  specs ruby pet_shop_spec.rb
# Run options: --seed 18844
#
# # Running:
#
# ....................
#
# Finished in 0.002160s, 9259.2594 runs/s, 12037.0372 assertions/s.
#
# 20 runs, 26 assertions, 0 failures, 0 errors, 0 skips
