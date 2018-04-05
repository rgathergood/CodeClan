require('sinatra')
require('sinatra/contrib/all')
require_relative('./models/hogwarts_student.rb')
require_relative('./models/hogwarts_house.rb')

get '/hogwarts-students' do
  @students = Hogwarts_student.all()
  erb(:index)
end

post '/hogwarts-students' do
  @student = Hogwarts_student.new(params)
  @student.save()
  erb(:create)
end

get '/hogwarts-students/new' do
  @houses = Hogwarts_house.all()
  erb(:new)
end

get '/hogwarts-students/:id' do
  @student = Hogwarts_student.find(params[:id].to_i )
  erb(:show)
end
