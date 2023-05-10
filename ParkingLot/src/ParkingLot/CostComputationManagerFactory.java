package ParkingLot;

public class CostComputationManagerFactory {
	
	TwoWheelerCostComputation twoWheelerCostComputation;
	FourWheelerCostComputation fourWheelerCostComputation;
	public CostComputationManagerFactory() {
		super();
		this.twoWheelerCostComputation =  new TwoWheelerCostComputation();
		this.fourWheelerCostComputation = new FourWheelerCostComputation();
	}
	public CostComputationManager getCostCommputation(Ticket t) {
		// TODO Auto-generated method stub
		if(t.parkingSlot.parkingSlotType == EnumParkingSlotType.TWO_WHEELER)
			return this.twoWheelerCostComputation;
		return this.fourWheelerCostComputation;
	}
	
	
	

}
