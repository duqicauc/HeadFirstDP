package command.remote;

//
// This is an invoker
//
public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	/**
	 * 给插槽slot设定相应的命令
	 * */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n-----Remote Control-----\n");
		for (int i = 0; i < 7; i++) {
			stringBuffer.append("[ slot " + i + "] "
					+ onCommands[i].getClass().getName() + "\t"
					+ offCommands[i].getClass().getName());
		}
		return stringBuffer.toString();
	}

}
