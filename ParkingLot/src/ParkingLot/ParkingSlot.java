package ParkingLot;

public abstract class ParkingSlot 
{
	EnumParkingSlotType parkingSlotType;
	boolean empty;
	int cost; //cost per minute
	int id;
	public EnumParkingSlotType getParkingSlotType() {
		return parkingSlotType;
	}
	public void setParkingSlotType(EnumParkingSlotType parkingSlotType) {
		this.parkingSlotType = parkingSlotType;
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public ParkingSlot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ParkingSlot(int id,EnumParkingSlotType parkingSlotType, boolean empty, int cost) {
		super();
		this.id = id;
		this.parkingSlotType = parkingSlotType;
		this.empty = empty;
		this.cost = cost;
	}

}
