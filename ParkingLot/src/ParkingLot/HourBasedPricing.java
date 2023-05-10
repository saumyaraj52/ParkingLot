package ParkingLot;

public class HourBasedPricing extends PricingStrategy {
	int cost;
	public HourBasedPricing()
	{
		super();
		this.cost = 100;
	}
	public int costCalculate(int time)
	{
		int totCost = this.cost*time/60;
		return totCost;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
