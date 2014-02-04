require 'rspec'
require 'frequent_flyer'

describe FrequentFlyer do
  context 'when the frequent flyer account is first created' do
    it 'should initially have Bronze status' do
      frequentFlyer = FrequentFlyer.new
      expect(frequentFlyer.status).to eq('BRONZE')
    end
  end
  context 'when the frequent flyer member starts to fly with Flying High' do
    it 'should earn points for each flight' do
      frequentFlyer = FrequentFlyer.new

      frequentFlyer.earn_status_points(100)

      expect(frequentFlyer.status_points).to eq(100)
    end

    it 'should upgrade member to next status level when enough points are earned' do
      frequentFlyer = FrequentFlyer.new

      frequentFlyer.earn_status_points(100).earn_status_points(200)

      expect(frequentFlyer.status).to eq('SILVER')
    end
  end
end