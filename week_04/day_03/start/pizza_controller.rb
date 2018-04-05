require( 'sinatra' )
require( 'sinatra/contrib/all' )
require_relative('./models/pizza_order.rb')
require( 'pry-byebug')

get '/pizza-orders' do
  @orders = PizzaOrder.all()
  erb( :index )
end

post '/pizza-orders' do
  @order = PizzaOrder.new( params )
  @order.save()
  erb( :create )
end

get '/pizza-orders/new' do
  erb( :new )
end

get '/pizza-orders/:id' do
  @order = PizzaOrder.find( params[:id].to_i )
  erb( :show )
end

get '/pizza-orders/:id/edit' do
  @order = PizzaOrder.find( params[:id].to_i )
  erb( :edit )
end

post '/pizza-orders/:id' do
  order = PizzaOrder.new( params )
  order.update()
  redirect to '/pizza-orders'
end

post '/pizza-orders/:id/delete' do
  @order = PizzaOrder.find( params[:id].to_i )
  @order.delete()
  redirect to '/pizza-orders'
end
