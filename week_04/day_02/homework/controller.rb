require('sinatra')
require('sinatra/contrib/all')
require('pry')
require_relative('./models/sinatra_app.rb')

get '/equal/:string1/:string2' do
  inputs = Sinatra_app.new(params[:string1].to_s, params[:string2].to_s)
  @result = inputs.equal()
  erb(:result)
end

get '/palindrome/:string1' do
  input = Sinatra_app.new(params[:string1].to_s)
  @result = input.palindrome()
  erb(:result)
end

get '/isogram/:string1' do
  input = Sinatra_app.new(params[:string1].to_s)
  @result = input.isogram()
  erb(:result)
end

get '/anagram/:string1/:string2' do
  inputs = Sinatra_app.new(params[:string1].to_s, params[:string2].to_s)
  @result = inputs.anagram()
  erb(:result)
end
