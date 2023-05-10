package ParkingLot;

import java.util.Date;

public abstract class CostComputationManager {
	public CostComputationManager()
	{
		super();
	}
	
	public int costCalculate(PricingStrategy p ,Ticket t)
	{
		int oldTime = t.startTime;
		int curTime = (int) (new Date().getTime()/1000);
		int diffTime = (curTime-oldTime);
		int costCalculate = p.costCalculate(diffTime);
		return costCalculate;
	}
}
