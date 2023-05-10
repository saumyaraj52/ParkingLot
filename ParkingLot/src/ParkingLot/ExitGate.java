package ParkingLot;

public class ExitGate 
{
	CostComputationManagerFactory costComputationManagerFactory;
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	ParkingSpotManager parkingSpotManager;
	
	CostComputationManager costComputationManager;
	
	PricingStrategy pricingStrategy;

	public ExitGate(ParkingSpotManagerFactory p) 
	{
		super();
		this.costComputationManagerFactory = new CostComputationManagerFactory();
		this.parkingSpotManagerFactory = p;
	}
	
	
	public int computeCost(Ticket t,PricingStrategy p)
	{
		this.costComputationManager= this.costComputationManagerFactory.getCostCommputation(t);
		int cost = this.costComputationManager.costCalculate(p,t);
		return cost;
	}
	
	public void payTicket(int cost,Ticket t)
	{
		//payment done
		ParkingSlot parkingSlot = t.parkingSlot;
		this.parkingSpotManager = this.parkingSpotManagerFactory.getParkingSpotManagerFromParking(parkingSlot);
		this.parkingSpotManager.returnParkingSlot(parkingSlot);
		return;
		
	}
	
	
	
	
}
