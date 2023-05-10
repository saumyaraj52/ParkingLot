package ParkingLot;

public abstract class PricingStrategy {
	int cost;
	public PricingStrategy()
	{
		this.cost=10;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	public int costCalculate(int time)
	{
		return this.cost;
	}
}
