const Hero = function (name, health, favouriteFood) {
  this.name = name;
  this.health = health;
  this.favouriteFood = favouriteFood;
  this.questList = [];
  this.moneyBag = 0;
}

Hero.prototype.saysHello = function () {
  return (`Hello my name is ${this.name}!`)
};

Hero.prototype.addQuest = function (quest) {
  this.questList.push(quest);
};

Hero.prototype.addMoney = function (amount) {
  this.moneyBag += amount;
};

Hero.prototype.completeQuest = function (quest) {
  quest.markQuestComplete();
  this.addMoney(quest.reward);
};

Hero.prototype.eatFood = function (food) {
  if (this.favouriteFood === food.name) {
    this.health += (food.healthPoints * 1.5);
  } else {
    this.health += food.healthPoints;
  }
};

Hero.prototype.sortQuestsByDifficulty = function () {
  this.questList.sort((questA, questB) => {
    if (questA.difficulty > questB.difficulty) {
      return -1;
    }
    if (questA.difficulty < questB.difficulty) {
      return 1;
    }
    return 0;
  });
};

Hero.prototype.sortQuestsByUrgency = function (property) {
  this.questList.sort((questA, questB) => {
    if (questA.urgency > questB.urgency) {
      return -1;
    }
    if (questA.urgency < questB.urgency) {
      return 1;
    }
    return 0;
  });
};

Hero.prototype.sortQuestsByReward = function (property) {
  this.questList.sort((questA, questB) => {
    if (questA.reward > questB.reward) {
      return -1;
    }
    if (questA.reward < questB.reward) {
      return 1;
    }
    return 0;
  });
};

Hero.prototype.filterByComplete = function () {
  const completedQuests = this.questList.filter(quest => {return quest.status});
  return completedQuests;
};

Hero.prototype.filterByUncomplete = function () {
  const uncompletedQuests = this.questList.filter(quest => {return !quest.status});
  return uncompletedQuests;
};

module.exports = Hero;
