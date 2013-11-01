package proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MatchMakingTestDrive {
	Hashtable datingDB = new Hashtable();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public MatchMakingTestDrive() {
		initializeDatabase();
	}

	/**
	 * 测试用例的整体执行过程设计
	 * */
	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	/**
	 * 获取Owner的代理对象
	 * */
	PersonBean getOwnerProxy(PersonBean person) {
		/*
		 * Proxy.newProxyInstance函数：
		 * 返回值：Returns an instance of a proxy class for the specified interfaces
		 *  	that dispatches method invocations to the specified invocation handle 
		 * 参数： 
		 * （1）loader： the class loader to define the proxy class 
		 * （2）interfaces： the list of interfaces for the proxy class to implement 
		 * （3）h： the invocation handler to dispatch method invocations to
		 */
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	/**
	 * 获取NoOwner的代理对象
	 * */
	PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean) datingDB.get(name);
	}

	void initializeDatabase() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
