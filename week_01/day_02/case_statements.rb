# p "What was your score?"
#
# score = gets.chomp.to_i
#
# case score
#   when 10
#     p "genius"
#   when 8..9
#     p "merit"
#   when 5..7
#     p "pass"
#   when 4
#     p "resit"
#   else
#     p "fail"
# end


# #
# # result = "fail"
# # result = "pass" if (score >= 6)
# #
# result = score >= 6 ? "pass" : "fail"
#
# p result

rob_hungry = true
rob_tired = true

p "Rob is hangry" if (rob_hungry && rob_tired)
p "Rob is grumpy" id (rob_hungry || rob_tired)
