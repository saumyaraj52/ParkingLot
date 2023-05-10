package ParkingLot;

public class Ticket {
	ParkingSlot parkingSlot;
	//int timeBooked;
	int startTime; //seconds
	public ParkingSlot getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(ParkingSlot parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(ParkingSlot parkingSlot, int startTime) {
		super();
		this.parkingSlot = parkingSlot;
		this.startTime = startTime;
	}
}
