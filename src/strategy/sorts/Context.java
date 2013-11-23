package strategy.sorts;

public class Context {
	private SortStrategy sortStrategy;
	
	public Context(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	/* 留给客户代码的接口 */
	public void sort()
	{
		sortStrategy.sort();
	}

}
