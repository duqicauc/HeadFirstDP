package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
	private Enumeration enumeration;
	
	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		// 由于在Enumeration接口中不支持删除操作，所以放弃并抛出异常
		throw new UnsupportedOperationException();
		
	}

}
