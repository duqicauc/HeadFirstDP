package command.remote;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();

	}

	@Override
	public void undo() {
		light.on();
		
	}

}
