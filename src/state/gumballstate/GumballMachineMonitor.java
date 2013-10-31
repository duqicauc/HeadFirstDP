package state.gumballstate;


public class GumballMachineMonitor {
	private GumballMachine gumballMachine;
	
	public GumballMachineMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void report(){
		System.out.println("Gumball Machine: " + gumballMachine.getLocation());
		System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
		System.out.println("Current state: " + gumballMachine.getState());
		
	}
}
