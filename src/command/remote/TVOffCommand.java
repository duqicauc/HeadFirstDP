package command.remote;

public class TVOffCommand implements Command {
	private TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();

	}

	@Override
	public void undo() {
		tv.on();

	}

}
