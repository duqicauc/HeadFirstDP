package command.simpleremote;

public class GarageDoorStopCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorStopCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.stop();

	}

}
