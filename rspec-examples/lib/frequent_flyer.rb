class FrequentFlyer
  def initialize()
    @status = 'BRONZE'
    @status_points = 0
  end

  def status
    @status
  end

  def status_points
    @status_points
  end

  def earn_status_points points
    @status_points = @status_points + points
    @status = 'SILVER' if status_points >= 300
    self
  end
end