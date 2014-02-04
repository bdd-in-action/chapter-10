'use strict';

module.exports = (function () {

    var FrequentFlyer = function() {
        this.status = 'Bronze';
        this.statusPoints = 0;

        this.getStatus = function () {
            return this.status;
        };

        this.getStatusPoints = function() {
            return this.statusPoints;
        };

        this.earnStatusPoints = function(additionalPoints) {
            this.statusPoints = this.statusPoints + additionalPoints;
            if (this.statusPoints >= 300) {
                this.status = 'Silver';
            }
        }
    };

    return FrequentFlyer;
})();
