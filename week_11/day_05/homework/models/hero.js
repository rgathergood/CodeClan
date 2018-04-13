const Hero = function (name, health, favouriteFood) {
  this.name = name;
  this.health = health;
  this.favouriteFood = favouriteFood;
  this.questsToComplete = [];
  this.completedQuests = [];
  this.moneyBag = 0;
}

Hero.prototype.saysHello = function () {
  return (`Hello my name is ${this.name}!`)
};

Hero.prototype.addQuest = function (quest) {
  this.questsToComplete.push(quest);
};

Hero.prototype.completeQuest = function (quest) {
  quest.markQuestComplete();
  const index = this.questsToComplete.indexOf(quest);
  this.questsToComplete.splice(index, 1);
  this.completedQuests.push(quest);
};

module.exports = Hero;
