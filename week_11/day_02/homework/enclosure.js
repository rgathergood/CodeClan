const Enclosure = function () {
  this.dinosaurs = [];
}

Enclosure.prototype.numberOfDinosaurs = function () {
  return this.dinosaurs.length;
};

Enclosure.prototype.addDinosaur = function (dinosaur) {
  this.dinosaurs.push(dinosaur);
};

Enclosure.prototype.removeByType = function (type) {
  this.dinosaurs = this.dinosaurs.filter(dinosaur => dinosaur.type != type);
};

Enclosure.prototype.returnIfOffspringIsGreaterThanTwo = function () {
  return this.dinosaurs.filter(dinosaur => dinosaur.offspring > 2);
};

Enclosure.prototype.getDinosaursBornAfterYears = function (years) {
  let dinosaursBorn = 0;
  for (var i = 0; i < this.dinosaurs.length; i++) {
    let dinosaur = this.dinosaurs[i]
    dinosaursBorn += (1 + dinosaur.offspring) ** years;
  }
  return dinosaursBorn;
};

module.exports = Enclosure;
