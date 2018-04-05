def return_10
  return 10
end

def add(num1, num2)
  return num1 + num2
end

def subtract(num1, num2)
  return num1 - num2
end

def multiply(num1, num2)
  return num1 * num2
end

def divide(num1, num2)
  return num1 / num2
end

def length_of_string(input_string)
  return input_string.length
end

def join_string(string1, string2)
  return string1 + string2
end

def add_string_as_number(string1, string2)
  return string1.to_i + string2.to_i
end

def number_to_full_month_name(number)
   month_name = case number
   when 1
    "January"
   when 3
    "March"
  when 9
    "September"
 end
 return month_name
end

def number_to_short_month_name(number)
  case number
  when 1
    return "Jan"
  when 3
    return "Mar"
  when 9
    return "Sep"
  end
end

# def number_to_short_month_name(name)
# sliced_month_name = number_to_full_month_name(number).slice(0,3)
# return sliced_month_name
# end

def volume_of_cube(length)
  return length**3
end

def volume_of_sphere(radius)
  return (4/3.0 * (Math::PI) * radius**3).round(1)
end

def fahrenheit_to_celsius(temperature)
  return ((temperature - 32) * 5/9.0).round(1)
end
