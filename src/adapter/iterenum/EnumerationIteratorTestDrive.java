package adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		v.add("duqi");
		v.add("bdd");
		v.add("liuman");
		Iterator iterator = new EnumerationIterator(v.elements());
		
		/* 
		 * hasNext()：判断后面还有没有元素
		 * next():取得下一个元素
		 * remove():删除当前元素，当然，在这里，对于EnumerationIterator来说会报异常
		 * */
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//iterator.remove();
	}
}
