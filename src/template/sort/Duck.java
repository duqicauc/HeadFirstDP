package template.sort;

/**
 * Duck类，实现Comparable接口，使得能够在Duck数组进行排序sort
 * */
public class Duck implements Comparable {
	private String name;
	private int weight;
	
	public Duck(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		Duck otherDuck = (Duck)o;
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else{
			return 1;
		}
	}
	
	public String toString(){
		return name + " weight " + weight;
	}

}
