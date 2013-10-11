package command.remote;

public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		remote.setCommand(0,livingRoomLightOn, livingRoomLightOff);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);

	}

}
