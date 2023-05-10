package ParkingLot;

public class Vehicle {
	
	EnumVehicleType vehicleType;
	Ticket ticket;
	ParkingSlot parkingSlot;
	public Vehicle(EnumVehicleType vehicleType, Ticket ticket, ParkingSlot parkingSlot) {
		super();
		this.vehicleType = vehicleType;
		this.ticket = ticket;
		this.parkingSlot = parkingSlot;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnumVehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(EnumVehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public ParkingSlot getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(ParkingSlot parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
}
