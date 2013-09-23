package decorator;

public abstract class Beverage {
	protected String description = "Unknown beverage";
	
	protected static final int TALL = 1;
	protected static final int GRANDE = 2;
	protected static final int VENTI = 3;
	protected int size = TALL;
	
	public String getDescription(){
		return description;
	}
	
	public abstract float cost();

	public int getSize() {
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
}	

