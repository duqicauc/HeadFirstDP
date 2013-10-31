package state.gumballstate;

import java.rmi.RemoteException;


public class GumballMachineMonitor {
	private GumballMachineRemote gumballMachine;
	
	public GumballMachineMonitor(GumballMachineRemote gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void report(){
		try {
			System.out.println("Gumball Machine: " + gumballMachine.getLocation());
			System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
			System.out.println("Current state: " + gumballMachine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
