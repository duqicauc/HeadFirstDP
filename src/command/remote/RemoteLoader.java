package command.remote;

public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenRoomLight = new Light("Kitchen Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remote.setCommand(0,livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remote.setCommand(2, garageDoorUp, garageDoorDown);
		remote.setCommand(3, stereoOnWithCD, stereoOff);
		// 利用toString函数将插槽和在这个插槽上对应的命令对象打印出来
		System.out.println(remote);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		//remote.onButtonWasPushed(1);
		//remote.offButtonWasPushed(1);
		//remote.onButtonWasPushed(2);
		//remote.offButtonWasPushed(2);
		//remote.undoButtonWasPushed();
		//remote.onButtonWasPushed(3);
		//remote.offButtonWasPushed(3);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		
		
		/*测试CeilingFan相关undo功能*/
		CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(livingRoomCeilingFan);
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(livingRoomCeilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
		
		remote.setCommand(0, ceilingFanOnCommand, ceilingFanOffCommand);
		remote.setCommand(1, ceilingFanLowCommand, ceilingFanOffCommand);
		remote.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
		remote.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();//执行undo之后应该返回为low speed
		
		remote.onButtonWasPushed(3);
		remote.onButtonWasPushed(2);
		System.out.println(remote);
		remote.undoButtonWasPushed();//执行之后应该返回到remote.onButtonWasPushed(3)这句，即high speed
	}

}
