package command;

// RemoteControlTest为客户
public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); // remote为Invoker(侍者)
		Light light = new Light();  //Light为命令接受者
		// 1、createCommandObject
		LightOnCommand lightOn = new LightOnCommand(light);
		// 2、setCommand:客户将名利交给Invoker
		remote.setCommand(lightOn);
		// 3、Later...Invoker调用execute()
		remote.buttonWasPressed();

	}

}
