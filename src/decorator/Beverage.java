package decorator;

public abstract class Beverage {
	protected String description = "Unknown beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract float cost();
}
