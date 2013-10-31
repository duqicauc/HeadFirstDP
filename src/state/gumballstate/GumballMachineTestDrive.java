package state.gumballstate;

import java.rmi.*;


public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);
			// remote service 实例化一个GumballMachine，并需要用RMI注册
			gumballMachine = new GumballMachine(args[0],count);
			Naming.rebind("//" + args[0] + "/gumballmachine",gumballMachine);
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
