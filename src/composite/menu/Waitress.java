package composite.menu;

public class Waitress {
	private MenuComponent allMenus;

	/**
	 * @param allMenus
	 */
	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print();
	}
		
}
