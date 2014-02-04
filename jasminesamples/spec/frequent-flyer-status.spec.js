'use strict';

describe('Frequent Flyers', function() {

    var FrequentFlyer = require('../lib/frequent_flyer');
    var frequentFlyer;

    beforeEach(function() {
        frequentFlyer = new FrequentFlyer();
    });


    describe("Managing Frequent Flyer statuses", function() {
        it("should initially have Bronze status", function() {
           expect(frequentFlyer.getStatus()).toBe('Bronze');
        });

        it("should initially have no status points", function() {
            expect(frequentFlyer.getStatusPoints()).toBe(0);
        });

    });

    describe("Cumulating Frequent Flyer points", function() {
       it('should earn points for each flight', function() {

           frequentFlyer.earnStatusPoints(100);
           frequentFlyer.earnStatusPoints(50);

           expect(frequentFlyer.getStatusPoints()).toBe(150);
       });

        it('should upgrade member to next status level when enough points are earned', function() {

            frequentFlyer.earnStatusPoints(300);

            expect(frequentFlyer.getStatus()).toBe('Silver');
        });
    });
});
