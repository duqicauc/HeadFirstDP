package state.gumballstate;

import java.net.MalformedURLException;
import java.rmi.*;

public class GumballMachineMonitorTest {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		String locationString = "rmi://127.0.0.1/gumballmachine";
		GumballMachineMonitor monitor;
		try {
			GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(locationString);
			monitor = new GumballMachineMonitor(machineRemote);
			monitor.report();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
