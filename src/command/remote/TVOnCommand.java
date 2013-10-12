package command.remote;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}
	
	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	@Override
	public void undo() {
		tv.off();

	}

}
