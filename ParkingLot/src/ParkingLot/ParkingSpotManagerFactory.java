package ParkingLot;

public class ParkingSpotManagerFactory 
{
	TwoWheelerSpotManager twoWheeler;
	FourWheelerSpotManager fourWheeler;
	
	
	public ParkingSpotManager getParkingSpotManager(Vehicle v)
	{
		//System.out.println(v.vehicleType);
		if(v.vehicleType == EnumVehicleType.TWO_WHEELER)
			return twoWheeler;
		if(v.vehicleType == EnumVehicleType.FOUR_WHEELER)
			return fourWheeler;
		return fourWheeler;
	}


	public ParkingSpotManagerFactory() {
		super();
		this.twoWheeler = new TwoWheelerSpotManager();
		this.fourWheeler = new FourWheelerSpotManager();
	}
	
	public ParkingSpotManager getParkingSpotManagerFromParking(ParkingSlot p)
	{
		if(p.parkingSlotType == EnumParkingSlotType.TWO_WHEELER)
			return twoWheeler;
		return fourWheeler;
	}
	

}
