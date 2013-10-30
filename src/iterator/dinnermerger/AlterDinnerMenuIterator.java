package iterator.dinnermerger;

import java.util.Calendar;
import java.util.Iterator;

public class AlterDinnerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position = 0;
	
	public AlterDinnerMenuIterator(MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		// 星期日是第一天  星期一是第二天
		position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position += 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException(
				"Alternating Dinner Menu Iterator does not support remove");
	}

}
