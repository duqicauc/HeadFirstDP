package proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	private PersonBean person;

	/**
	 * @param person
	 */
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		// 外人只能看，不能改，能评分
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			}else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			}else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
