const BingeWatch = function(tvshow, hours) {
  this.tvshow = tvshow;
  this.hours = hours;
};

BingeWatch.prototype.calculateTimeToFinish = function () {
  const minutes = this.tvshow.calculateTotalDuration();
  const hours = minutes / 60;
  const days = Math.ceil(hours / this.hours);
  return days;
};

module.exports = BingeWatch;
