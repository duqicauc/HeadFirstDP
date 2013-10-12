package command.remote;

import factory.ingredient.MarinaraSauce;

public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
//		
//		Light livingRoomLight = new Light("Living Room");
//		Light kitchenRoomLight = new Light("Kitchen Room");
//		GarageDoor garageDoor = new GarageDoor("");
//		Stereo stereo = new Stereo("Living Room");
//		
//		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
//		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
//		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//		
//		remote.setCommand(0,livingRoomLightOn, livingRoomLightOff);
//		remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
//		remote.setCommand(2, garageDoorUp, garageDoorDown);
//		remote.setCommand(3, stereoOnWithCD, stereoOff);
//		// 利用toString函数将插槽和在这个插槽上对应的命令对象打印出来
//		System.out.println(remote);
//		remote.undoButtonWasPushed();
//		
//		remote.onButtonWasPushed(0);
//		remote.offButtonWasPushed(0);
//		System.out.println(remote);
//		remote.undoButtonWasPushed();
//		//remote.onButtonWasPushed(1);
//		//remote.offButtonWasPushed(1);
//		//remote.onButtonWasPushed(2);
//		//remote.offButtonWasPushed(2);
//		//remote.undoButtonWasPushed();
//		//remote.onButtonWasPushed(3);
//		//remote.offButtonWasPushed(3);
//		remote.offButtonWasPushed(0);
//		remote.onButtonWasPushed(0);
//		System.out.println(remote);
//		remote.undoButtonWasPushed();
//		
//		
//		/*测试CeilingFan相关undo功能*/
//		CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
//		
//		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
//		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
//		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(livingRoomCeilingFan);
//		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(livingRoomCeilingFan);
//		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
//		
//		remote.setCommand(0, ceilingFanOnCommand, ceilingFanOffCommand);
//		remote.setCommand(1, ceilingFanLowCommand, ceilingFanOffCommand);
//		remote.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
//		remote.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);
//		
//		remote.onButtonWasPushed(0);
//		remote.offButtonWasPushed(0);
//		System.out.println(remote);
//		remote.undoButtonWasPushed();//执行undo之后应该返回为low speed
//		
//		remote.onButtonWasPushed(3);
//		remote.onButtonWasPushed(2);
//		System.out.println(remote);
//		remote.undoButtonWasPushed();//执行之后应该返回到remote.onButtonWasPushed(3)这句，即high speed
		
		// 实例化设备对象
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();

		// 实例化On开关命令对象
		LightOnCommand lightOn = new LightOnCommand(light);
		TVOnCommand tvOn = new TVOnCommand(tv);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		
		// 实例化Off开关命令对象
		LightOffCommand lightOff = new LightOffCommand(light);
		TVOffCommand tvOff = new TVOffCommand(tv);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		HottubOffCommand hotOff = new HottubOffCommand(hottub);
		
		// 将命令分类组装并构建两个分组命令对象
		Command[] partyOn = {lightOn,tvOn,stereoOnWithCD,hottubOn};
		Command[] partyOff = {lightOff,tvOff,stereoOff,hotOff};	
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMarco = new MacroCommand(partyOff);
		
		// 将命令对象与插槽绑定
		remote.setCommand(0, partyOnMacro, partyOffMarco);
		
		System.out.println(remote);
		System.out.println("-----Push the partyOn button-----");
		remote.onButtonWasPushed(0);
		System.out.println("-----Push the partyOff button-----");
		remote.offButtonWasPushed(0);
	}

}
