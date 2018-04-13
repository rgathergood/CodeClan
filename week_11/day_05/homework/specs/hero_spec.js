const assert = require('assert');
const Hero = require('../models/hero.js');
const Quest = require('../models/quest.js');

describe('Hero', function () {
  let hero;
  let quest1;

  beforeEach( function () {
    hero = new Hero('Boromir', 75, 'Eggs')
    quest1 = new Quest('Bake a Cake', 4, 'Low', 100)
    quest2 = new Quest('Kill some orcs', 6, 'Medium', 250)
    quest3 = new Quest('Save Hobbits', 8, 'High', 400)
  });

  it('has a name', function () {
    assert.strictEqual(hero.name, 'Boromir')
  });

  it('has health', function () {
    assert.strictEqual(hero.health, 75)
  });

  it('has a favouriteFood', function () {
    assert.strictEqual(hero.favouriteFood, 'Eggs')
  });

  it('has questsToComplete', function () {
    assert.deepStrictEqual(hero.questsToComplete, [])
  })

  it('has completedQuests', function () {
    assert.deepStrictEqual(hero.completedQuests, [])
  })

  it('has moneyBag value', function () {
    assert.strictEqual(hero.moneyBag, 0)
  });

  it('can say their name', function () {
    assert.strictEqual(hero.saysHello(), 'Hello my name is Boromir!')
  });

  it('can add quests to questsToComplete', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    assert.deepStrictEqual(hero.questsToComplete, [quest1, quest2])
  });

  it('can remove quest', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    hero.completeQuest(quest2);
    assert.deepStrictEqual(hero.questsToComplete, [quest1])
    assert.deepStrictEqual(hero.completedQuests, [quest2])
  })

});
