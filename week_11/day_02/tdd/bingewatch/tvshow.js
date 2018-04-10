const TVShow = function (name, seasons) {
  this.name = name;
  this.seasons = seasons;
};

TVShow.prototype.calculateTotalDuration = function() {
  let totalDuration = 0;
  for (season of this.seasons) {
    totalDuration += season.duration;
  };
  return totalDuration;
};

module.exports = TVShow;
