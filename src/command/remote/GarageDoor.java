package command.remote;


public class GarageDoor {
	private String location;
	
	public GarageDoor(String location) {
		this.location = location;
	}
	
	public void up(){
		System.out.println(location + "garage Door is open");
	}
	
	public void down(){
		System.out.println(location + "garage Door is closed");
	}
	
	public void stop(){
		System.out.println(location + "garage Door is stopped");
	}
	
	public void lightOn(){
		System.out.println(location + "garage Door's light is On");
	}
	
	public void lightOff(){
		System.out.println(location + "garage Door's light is off");
	}
}
