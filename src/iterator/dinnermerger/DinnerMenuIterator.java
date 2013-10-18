package iterator.dinnermerger;


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

}
