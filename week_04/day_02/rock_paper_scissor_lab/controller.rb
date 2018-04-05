require('sinatra')
require('sinatra/contrib/all')
require('pry')
require_relative('./models/rock_paper_scissors.rb')

get '/' do
  erb(:home)
end

get '/instructions' do
  erb(:instructions)
end

get '/rock_paper_scissors/:input1/:input2' do
  result = Rock_paper_scissors.new(params[:input1].to_s, params[:input2].to_s)
  @outcome = result.game()
  erb(:result)
end
