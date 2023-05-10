package ParkingLot;

import java.util.List;
import java.util.Set;

public abstract class ParkingSpotManager 
{
	List<Integer> parkingSlots;
	Set<Integer> set;
	int freecnt;
	public ParkingSpotManager() {
		super();
	}

	public int getFreecnt() {
		return this.freecnt;
	}
	public void setFreecnt(int freecnt) {
		this.freecnt = freecnt;
	}
	
	public ParkingSlot getParkingSlotsForVehicle()
	{
		int val = this.parkingSlots.get(this.getFreecnt());
		System.out.println(this.getFreecnt());
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
		
	}
}
