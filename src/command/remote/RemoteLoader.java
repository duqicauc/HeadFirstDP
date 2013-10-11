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
		
		// 利用toString函数将插槽和在这个插槽上对应的命令对象打印出来
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);

	}

}
