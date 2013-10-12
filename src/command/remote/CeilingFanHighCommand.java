package command.remote;

public class CeilingFanHighCommand implements Command {
	private CeilingFan ceilingFan;
	private int prevSpeed; //记录undo之前的风扇转速
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();

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
