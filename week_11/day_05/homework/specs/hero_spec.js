const assert = require('assert');
const Hero = require('../models/hero.js');
const Quest = require('../models/quest.js');
const Food = require('../models/food.js');
const Rat = require('../models/rat.js');

describe('Hero', function () {
  let hero;
  let quest1;
  let food1;
  let rat;

  beforeEach( function () {
    hero = new Hero('Boromir', 75, 'Eggs')
    quest1 = new Quest('Bake a Cake', 4, 1, 100)
    quest2 = new Quest('Kill some orcs', 6, 3, 250)
    quest3 = new Quest('Save Hobbits', 8, 2, 400)
    food1 = new Food('Cheese', 20)
    food2 = new Food('Eggs', 20)
    rat = new Rat
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
    assert.deepStrictEqual(hero.questList, [])
  })

  it('has moneyBag value', function () {
    assert.strictEqual(hero.moneyBag, 0)
  });

  it('can say their name', function () {
    assert.strictEqual(hero.saysHello(), 'Hello my name is Boromir!')
  });

  it('can add to moneyBag', function () {
    hero.addMoney(10);
    assert.strictEqual(hero.moneyBag, 10);
  });

  it('can add quests to questsToComplete', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    assert.deepStrictEqual(hero.questList, [quest1, quest2])
  });

  it('can remove quest', function () {
    hero.addQuest(quest2);
    hero.completeQuest(quest2);
    assert.deepStrictEqual(quest2.status, true)
    assert.strictEqual(hero.moneyBag, 250);
  })

  it('can eat food', function () {
    hero.eatFood(food1);
    assert.strictEqual(hero.health, 95)
  });

  it('can eat favouriteFood', function () {
    hero.eatFood(food2);
    assert.strictEqual(hero.health, 105)
  });

  it('can sort by difficulty', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    hero.addQuest(quest3);
    hero.sortQuestsByDifficulty();
    assert.deepStrictEqual(hero.questList, [quest3, quest2, quest1])
  });

  it('can sort by urgency', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    hero.addQuest(quest3);
    hero.sortQuestsByUrgency();
    assert.deepStrictEqual(hero.questList, [quest2, quest3, quest1])
  });

  it('can sort by reward', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    hero.addQuest(quest3);
    hero.sortQuestsByReward();
    assert.deepStrictEqual(hero.questList, [quest3, quest2, quest1])
  });

  it('can filterByComplete', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    hero.addQuest(quest3);
    hero.completeQuest(quest2);
    assert.deepStrictEqual(hero.filterByComplete(), [quest2])
  });

  it('can filterByUncomplete', function () {
    hero.addQuest(quest1);
    hero.addQuest(quest2);
    hero.addQuest(quest3);
    hero.completeQuest(quest2);
    assert.deepStrictEqual(hero.filterByUncomplete(), [quest1, quest3])
  });

  it('can eat food touched by rat', function () {
    rat.touchFood(food1);
    hero.eatFood(food1);
    assert.strictEqual(hero.health, 55)
  });

});
