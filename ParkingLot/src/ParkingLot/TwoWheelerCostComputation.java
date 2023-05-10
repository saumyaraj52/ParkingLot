package ParkingLot;

import java.util.Date;

public class TwoWheelerCostComputation extends CostComputationManager {
	int baseCost;
	public TwoWheelerCostComputation()
	{
		super();
		this.baseCost = 10;
	}
	
	public int costCalculate(PricingStrategy p ,Ticket t)
	{
		int oldTime = t.startTime;
		int curTime = (int) (new Date().getTime()/1000);
		int diffTime = (curTime-oldTime);
		int costCalculate = p.costCalculate(diffTime)+this.baseCost;
		return costCalculate;
	}

}
