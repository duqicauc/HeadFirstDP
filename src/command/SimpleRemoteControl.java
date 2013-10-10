package command;

//
// This is Invoker
//
public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
