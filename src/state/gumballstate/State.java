package state.gumballstate;

import java.io.Serializable;

/**
 * State接口 :成员方法代表针对某个接口的一系列状态转换动作
 * 要求：可序列化，这样就可以通过网络传输
 * */
public interface State extends Serializable{
	public void insertQuarter(); //投币25分
	public void ejectQuarter();	// 请求退回25分
	public void turnCrank();	// 扣下曲柄，请求送出糖果
	public void dispense();		// 分配糖果
}
