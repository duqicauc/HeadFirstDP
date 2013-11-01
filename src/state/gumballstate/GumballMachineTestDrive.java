package state.gumballstate;

import java.rmi.*;
import java.rmi.registry.*;


public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count = 0;
		String urlString = null;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			System.out.println("Server start ...");
			count = Integer.parseInt(args[1]);	//第二个参数作为个数
			gumballMachine = new GumballMachine(args[0], count);//第一个参数作为本机IP地址或者主机名
			Registry r = LocateRegistry.createRegistry(8111);
			urlString = args[0].toString() + "/gumballmachine";
			System.out.println(urlString);
			r.rebind(urlString, gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		} 

//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);

//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.ejectQuarter();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
	}
}
