const Quest = function (name, difficulty, urgency, reward) {
  this.name = name;
  this.difficulty = difficulty;
  this.urgency = urgency;
  this.reward = reward;
  this.status = false;
}

Quest.prototype.markQuestComplete = function () {
   this.status = true;
};

module.exports = Quest;
