package command.remote;

public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);//为什么这里11比10好？
	}

}
