package ParkingLot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoWheelerSpotManager extends ParkingSpotManager {

	List<Integer> parkingSlots;
	Set<Integer> set;
	int freecnt;

	public int getFreecnt() {
		return this.freecnt;
	}
	public void setFreecnt(int freecnt) {
		this.freecnt = freecnt;
	}
	public TwoWheelerSpotManager() 
	{
		super();
		this.parkingSlots = new ArrayList<Integer>(800);
		for(int i=0;i<800;i++)
		{
			this.parkingSlots.add(i);
		}
		this.freecnt=799;
		this.set = new HashSet<>();
	}
	
	public ParkingSlot getParkingSlotsForVehicle()
	{
		int val = this.parkingSlots.get(this.getFreecnt());
		System.out.println("Two wheeler Parking Spots available: "+this.getFreecnt());
		this.setFreecnt(this.getFreecnt()-1);
		set.add(val);
		return new TwoWheelerParkingSlot(val);
	}
	
	public void returnParkingSlot(ParkingSlot p)
	{
		int id = p.id;
		set.remove(id);
		parkingSlots.add(id);
		this.setFreecnt(this.getFreecnt()+1);
		System.out.println("Two wheeler Parking Spots available: "+this.getFreecnt());
	}
}
