package composite.menu;

/**
 * 为leaf节点和composite节点提供统一的操作接口
 * 为每一个方法提供了默认实现
 * */
public abstract class MenuComponent {
	/* 以下三个为："composite" methods */
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	/* 以下为：“operation” methods,给MenuItems使用 */
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		// print()是一个“operation”方法，Menus和MenuItems都要实现它，但是我们也提供了一个默认实现
		throw new UnsupportedOperationException();
	}
}
