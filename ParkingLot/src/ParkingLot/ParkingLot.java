package ParkingLot;

import java.util.LinkedList;
import java.util.Queue;

public class ParkingLot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
		EntranceGate entranceGate = new EntranceGate(parkingSpotManagerFactory);
		ExitGate exitGate = new ExitGate(parkingSpotManagerFactory);
		Queue<Ticket> q = new LinkedList<Ticket>();
		for(int i=0;i<10;i++)
		{
			Vehicle v = new Vehicle();
			v.vehicleType = EnumVehicleType.FOUR_WHEELER;
			
			if(entranceGate.isParkingSlotAvailable(v)==true)
			{
				Ticket t = entranceGate.getTicket(v);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				q.add(t);
			}
			else
			{
				System.out.println("No Parking Space available");
			}
		}
		for(int i=0;i<10;i++)
		{
			Vehicle v = new Vehicle();
			v.vehicleType = EnumVehicleType.TWO_WHEELER;
			
			if(entranceGate.isParkingSlotAvailable(v)==true)
			{
				Ticket t = entranceGate.getTicket(v);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				q.add(t);
				
			}
			else
			{
				System.out.println("No Parking Space available");
			}
		}
		
		while(!q.isEmpty())
		{
			Ticket temp = q.poll();
			int val=exitGate.computeCost(temp, new MinuteBasedPricing());
			System.out.println("Parking Cost : "+val);
			exitGate.payTicket(val, temp);
			System.out.println("Out of Parking");
		}
		

	}

}
