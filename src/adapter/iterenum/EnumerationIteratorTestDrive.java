package adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main(String[] args) {
		Vector v = new Vector(Arrays.asList(args));
		v.add("duqi");
		v.add("bdd");
		v.add("liuman");
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		iterator.remove();
		//iterator.next();
	}
}
