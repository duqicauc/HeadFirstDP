package proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean person; // 保存一份Real Subject的实例，在本例中是PersonBeanImpl

	/**
	 * @param person
	 */
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	/**
	 * 客户端调用proxy的方法，由Proxy转交给这个invoke函数执行
	 * */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			/* 根据方法名称不同，实例化不同的Proxy类，然后执行不同级别的动作 */
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if(method.getName().equals("setHotOrNotRating")){
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
