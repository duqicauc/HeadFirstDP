package command.remote;

public class HottubOffCommand implements Command {
	private Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		hottub.setTemperature(98);//这里是？？一遍下次打开时有个默认温度？
		hottub.off();

	}

	@Override
	public void undo() {
		hottub.on();

	}

}
