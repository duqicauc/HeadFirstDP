package iterator.dinnermerger;

import java.util.Iterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class DinnerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position = 0;
	
	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	/**
	 * 是否有下一个对象需要遍历
	 * */
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	/**
	 * 返回下一个对象的引用
	 * */
	public Object next() {
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}

	/**
	 * 删除，因为这里chef用了固定大小的数组来存放菜单项
	 * 所以我们删除一个元素时，策略是将其后面的项一直到最后一项整体向前移位，将
	 * 要删除的那个元素覆盖掉
	 * */
	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (items[position-1] != null) {
			for (int i = position - 1; i < (items.length-1); i++) {
				items[i] = items[i+1];
			}
			items[items.length-1] = null;
		}
	}

}
