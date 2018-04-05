require 'sinatra'
require 'sinatra/contrib/all'

# {HTTPMethod} '{url}' do
# end

get '/hi' do
  return "Hello World"
end

get '/roll-die' do
   return rand(1...6).to_s
end

get '/name/:first/:last' do
  return "Hello #{params[:first]} #{params[:last]}"
end

get '/friends/:number' do
  friends = ["Joey", "Phoebe", "Chandler", "Rachel", "Ross"]
  index = params[:number].to_i - 1
  return friends[index]
end

get '/pet/hello' do
  return "Hello Pet"
end

get '/pet/:name' do
  return "Hello #{params[:name]}"
end
