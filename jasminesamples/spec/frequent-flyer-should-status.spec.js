'use strict';

describe('Frequent Flyers', function() {

    var FrequentFlyer = require('../lib/frequent_flyer');
    var frequentFlyer;
    require('chai').should()

    beforeEach(function() {
        frequentFlyer = new FrequentFlyer();
    });


    describe("Managing Frequent Flyer statuses", function() {
        it("should initially have Bronze status", function() {
            frequentFlyer.getStatus().should.equal('Bronze');
        });

        it("should initially have no status points", function() {
            frequentFlyer.getStatusPoints().should.equal(0);
        });

    });

    describe("Cumulating Frequent Flyer points", function() {
        it('should earn points for each flight', function() {

            frequentFlyer.earnStatusPoints(100);
            frequentFlyer.earnStatusPoints(50);

            frequentFlyer.getStatusPoints().should.equal(150);
        });

        it('should upgrade member to next status level when enough points are earned', function() {

            frequentFlyer.earnStatusPoints(300);

            frequentFlyer.getStatus().should.equal('Silver');
        });

        it('should do shit', function() {

            var obtainableStatuses = ['Silver','Gold','Platinum']

            obtainableStatuses.should.include('Gold')
        });

    });
});
