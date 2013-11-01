package state.gumballstate;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineMonitorTest {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException {
		GumballMachineMonitor monitor = null;
		try {
			//通过服务器的网络地址获取Registry对象
			Registry r = LocateRegistry.getRegistry("127.0.0.1", 8111);
			//获取远程对象存根，即代理对象
			GumballMachineRemote machineRemote = (GumballMachineRemote) r.lookup("127.0.0.1/gumballmachine");
			//本地监控器对象
			monitor = new GumballMachineMonitor(machineRemote);
			monitor.report();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
