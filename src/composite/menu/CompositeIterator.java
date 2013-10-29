package composite.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	private Stack stack = new Stack();	//使用栈stack保存当前遍历的节点的位置
	
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	/**
	 * 不支持删除，仅仅是支持遍历
	 * */
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
