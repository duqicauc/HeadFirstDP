package command.remote;

public class Light {
	private String location;
	
	public Light(String location) {
		this.location = location;
	}
	
	public void on(){
		System.out.println(location + "turn on the light");
	}
	
	public void off(){
		System.out.println(location + "turn off the light");
	}
}
