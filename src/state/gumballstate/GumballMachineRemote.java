package state.gumballstate;

import java.rmi.*;

/**
 * This is the remote interface
 * 所有的返回值和参数都要是可序列化的，这里需要对State修改
 * */
public interface GumballMachineRemote extends Remote{
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException; 
}
