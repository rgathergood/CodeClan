require_relative('../models/hogwarts_student.rb')
require_relative('../models/hogwarts_house.rb')
require('pry-byebug')

Hogwarts_house.delete_all()
Hogwarts_student.delete_all()

house1 = Hogwarts_house.new({
  "name" => "Gryffindor",
  "crest" => "https://vignette.wikia.nocookie.net/harrypotter/images/e/ee/Gryffindor_Crest-0.jpg/revision/latest?cb=20160729145529"
  })

house1.save()

house2 = Hogwarts_house.new({
  "name" => "Hufflepuff",
  "crest" => "https://vignette.wikia.nocookie.net/harrypotter/images/6/62/Download_%289%29.jpg/revision/latest?cb=20160729145653"
  })

house2.save()

house3 = Hogwarts_house.new({
  "name" => "Ravenclaw",
  "crest" => "https://vignette.wikia.nocookie.net/harrypotter/images/2/28/Download_%284%29.jpg/revision/latest?cb=20160729145945"
  })

house3.save()

house4 = Hogwarts_house.new({
  "name" => "Slytherin",
  "crest" => "https://vignette.wikia.nocookie.net/harrypotter/images/7/72/Ccd53034-c798-452a-8032-f28e06250d8f.jpg/revision/latest?cb=20160729150848"
  })

house4.save()

student1 = Hogwarts_student.new({
  "first_name" => "Harry",
  "last_name" => "Potter",
  "house_id" => house1.id(),
  "age" => 11
  })

student2 = Hogwarts_student.new({
  "first_name" => "Draco",
  "last_name" => "Malfoy",
  "house_id" => house4.id(),
  "age" => 12
    })

student1.save()
student2.save()

binding.pry
nil
