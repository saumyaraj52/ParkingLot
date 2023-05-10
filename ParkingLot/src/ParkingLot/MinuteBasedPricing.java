package ParkingLot;

public class MinuteBasedPricing extends PricingStrategy {
	int cost;
	public MinuteBasedPricing()
	{
		super();
		this.cost = 10;
	}
	public int costCalculate(int time)
	{
		int totCost = this.cost*time;
		return totCost;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
