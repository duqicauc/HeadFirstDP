package command.remote;

public class CeilingFanOnCommand implements Command {
	private CeilingFan ceilingFan;
	private int prevSpeed;

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();

	}

	@Override
	public void undo() {
		// 分支超过3个，选择switch
		switch (prevSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		case CeilingFan.OFF:
			ceilingFan.off();
			break;
			
		default:
			break;
		}

	}

}
