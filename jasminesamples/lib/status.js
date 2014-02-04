'use strict';

var _ = require('underscore');

module.exports = (function() {
  // Public interface
  var frequentFlyerStatusLevels = {
    minimumPointsFor : function(status) {
        if (status == 'Platinum') { return 1200; }
        if (status == 'Gold') { return 750; }
        if (status == 'Silver') { return 450; }
    },
      allLevels : function() { return ['Bronze','Silver','Gold','Platinum']}
  };

  return frequentFlyerStatusLevels;
})();
