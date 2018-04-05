require('pry-byebug')
require_relative('model/bounty_list.rb')

bounty1 = BountyList.new({
  'name' => 'Davros',
  'species' => 'Dalek',
  'homeworld' => 'Skaro',
  'bounty_value' => '1000'
  })

  bounty2 = BountyList.new({
    'name' => 'Megatron',
    'species' => 'Decipticon',
    'homeworld' => 'Cybertron',
    'bounty_value' => '3000'
    })

    binding.pry

    nil
