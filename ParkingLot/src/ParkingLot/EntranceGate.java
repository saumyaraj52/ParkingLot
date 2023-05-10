package ParkingLot;

import java.util.Date;

public class EntranceGate 
{
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	ParkingSpotManager parkingSpotManager;
	Ticket ticket;
	
	public boolean isParkingSlotAvailable(Vehicle v)
	{
		//System.out.println("Parking Spots available: "+this.parkingSpotManagerFactory.getParkingSpotManager(v).getFreecnt());
		if(this.parkingSpotManagerFactory.getParkingSpotManager(v).getFreecnt()>0) return true;
		else return false;
	}
	
	public ParkingSlot getParkingSpot(Vehicle v)
	{
		return this.parkingSpotManagerFactory.getParkingSpotManager(v).getParkingSlotsForVehicle();
	}
	
	public Ticket getTicket(Vehicle v)
	{
		ParkingSlot parkingSlot = getParkingSpot(v);
		int dateTime = (int) (new Date().getTime()/1000);
		this.ticket=new Ticket(parkingSlot,dateTime);
		//update parking spot
		return ticket;
	}

	public EntranceGate(ParkingSpotManagerFactory p) {
		super();
		this.parkingSpotManagerFactory = p;
	}

}
