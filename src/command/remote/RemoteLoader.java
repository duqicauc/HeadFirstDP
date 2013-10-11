package command.remote;

public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenRoomLight = new Light("Kitchen Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
		
		remote.setCommand(0,livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		// 利用toString函数将插槽和在这个插槽上对应的命令对象打印出来
		System.out.println(remote);
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);

	}

}
