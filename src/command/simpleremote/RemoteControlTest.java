package command.simpleremote;


public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); // remote为Invoker(侍者)
		Light light = new Light();  //Light为命令接受者
		GarageDoor garageDoor = new GarageDoor();
		
		// 1、createCommandObject
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		// 2、setCommand:客户将名利交给Invoker
		remote.setCommand(lightOn);
		// 3、Later...Invoker调用execute()
		remote.buttonWasPressed();
		
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();

	}

}
